package memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MemoList {

	private ArrayList<MemoVO> memoList = new ArrayList<>();

	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}

	@Override
	public String toString() {
		String str = "";
		if(memoList.size() == 0) {
//			저장된 메모가 없으면 메모가 없다는 메시지를 출력한다.
			str += "저장된 메모가 없습니다.\n";
		}else {
//			저장된 메모가 있으면 메모 목록을 마지막에 입력한 메모(최신글)부터 출력한다.
			for(int i=memoList.size()-1; i>=0; i--) { // 마지막부터 처음까지
				str += memoList.get(i) + "\n"; 
			}
//			for(int i=0; i<memoList.size(); i++) { // 처음부터 마지막까지
//				str += memoList.get(i) + "\n"; // str += memoList.get(memoList.size() - 1 - i) + "\n"; (마지막부터 처음까지)
//			}
		}
		return str;
	}

//	MemoMain 클래스에서 호출되는 memoList라는 ArrayList에 저장할 데이터가 저장된 MemoVO 클래스
//	객체를 넘겨받아 memoList라는 ArrayList에 저장하는 메소드
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
	}

//	MemoMain 클래스에서 호출되는 수정 또는 삭제할 글번호를 넘겨받고 memoList라는 ArrayList에
//	저장된 메모 중에서 수정 또는 삭제할 글번호에 해당되는 글 1건을 얻어와서 리턴하는 메소드
	public MemoVO selectMemo(int idx) {
		try {
			return memoList.get(idx - 1);
		}catch(IndexOutOfBoundsException e) {
			return null;
		}
	}

//	MemoMain 클래스에서 호출되는 삭제할 글번호를 넘겨받고 memoList라는 ArrayList에 저장된
//	메모 1건을 삭제하는 메소드
	public void deleteMemo(int idx) {
		memoList.remove(idx - 1);
	
//		ArrayList는 데이터가 삽입될 경우 삽입되는 위치 이후의 데이터가 자동으로 뒤로 이동되고
//		데이터가 삭제될 경우 삭제되는 위치 이후의 데이터가 자동으로 앞으로 이동된다.
//		메모 삭제 후 인덱스가 변경되므로 인덱스에 맞춰서 글번호를 다시 붙여준다.
//		이 현상은 데이터베이스를 사용하지 않고 ArrayList를 사용하기 때문에 발생되는 현상이다.
		
//		메모 삭제 후 글번호를 다시 붙여준다.
		for(int i=0; i<memoList.size(); i++) {
			memoList.get(i).setIdx(i + 1);
		}
	
//		글이 삭제된 후 새 글이 입력될 때 idx가 기존 idx 값에 이어서 1씩 증가할 수 있도록
//		count의 값을 수정한다.
		MemoVO.count = memoList.size();
	}

//	MemoMain 클래스에서 호출되는 수정할 글번호와 메모를 넘겨받고 memoList라는 ArrayList에 저장된
//	메모 1건을 수정하는 메소드	
	public void updateMemo(int idx, String memo) {
		memoList.get(idx - 1).setMemo(memo);
	}

//	MemoMain 클래스에서 호출되는 텍스트 파일의 이름을 넘겨받아 memoList ArrayList에 저장된
//	데이터를 텍스트 파일로 출력하는 메소드
	public void writeMemo(String filename) {
		
		PrintWriter printWriter = null;
		
//		텍스트 파일의 경로와 이름을 연결한다.
//		String filepath = ".\\src\\memoList\\" + filename + ".txt";
		String filepath = String.format(".\\src\\memoList\\%s.txt", filename);
//		System.out.println(filepath);
		
		try {
			printWriter = new PrintWriter(filepath);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			
//			ArrayList에 저장된 데이터를 텍스트 파일로 출력한다.
//			ArrayList에 저장된 데이터를 공백으로 구분해서 텍스트 파일에 1줄로 연결해서 출력한다.
			
			/*
//			일반 for
			for(int i=0; i<memoList.size(); i++) {
//				System.out.println(memoList.get(i));
				MemoVO vo = memoList.get(i);
//				System.out.println(vo.getIdx());
//				System.out.println(vo.getName());
//				System.out.println(vo.getPassword());
//				System.out.println(vo.getMemo());
//				System.out.println(vo.getWriteDate());
				
//				String str = "";
//				str += vo.getIdx() + " ";
//				str += vo.getName().replace(" ", "`") + " ";
//				str += vo.getPassword() + " ";
//				str += vo.getMemo().replace(" ", "`") + " ";
//				str += sdf.format(vo.getWriteDate());
				String str = String.format("%d %s %s %s %s", vo.getIdx(), vo.getName().replace(" ", "`"), 
						vo.getPassword(), vo.getMemo().replace(" ", "`"), sdf.format(vo.getWriteDate()));
//				System.out.println(str);
				printWriter.write(str + "\n");
			}
			*/ // 일반 for 끝
			
//			향상된 for
			for(MemoVO vo : memoList) {
				String str = String.format("%d %s %s %s %s", vo.getIdx(), vo.getName().replace(" ", "`"), 
						vo.getPassword(), vo.getMemo().replace(" ", "`"), sdf.format(vo.getWriteDate()));
				printWriter.write(str + "\n");
			}
			
			System.out.println(filename + ".txt 파일에 쓰기 완료!");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		} finally {
			if(printWriter != null) {
				printWriter.close();
			}
		}
		
		
	}

//	MemoMain 클래스에서 호출되는 텍스트 파일의 이름을 넘겨받아 텍스트 파일의 데이터를 읽어
//	memoList ArrayList에 저장하는 메소드
	public void readMemo(String filename) {
		
		Scanner sc = null;
		
//		텍스트 파일의 경로와 이름을 연결한다.
		String filepath = String.format(".\\src\\memoList\\%s.txt", filename);
		
		try {
			sc = new Scanner(new File(filepath));
			
//		텍스트 파일에 저장된 데이터를 마지막 줄까지 읽어서 memoList ArrayList에 저장한다.
			while(sc.hasNextLine()) {
//				텍스트 파일에서 1줄을 읽는다.
				String str = sc.nextLine().trim();
//				System.out.println(str);
				
//				읽어들인 데이터를 공백을 경계로 나누어서 각각의 변수에 저장한다.
				Scanner scan = new Scanner(str);
				int idx = scan.nextInt();
				String name = scan.next().replace("`", " ");
				String password = scan.next();
				String memo = scan.next().replace("`", " ");
				String temp = scan.nextLine().trim(); // 마지막 데이터는 enter까지 읽어들임 // writeDate
				
//				텍스트 파일에서 읽어들인 문자열로 변환돼서 저장된 날짜 데이터를 Date 클래스 객체를
//				사용해서 날짜 데이터로 변한한다.
//				System.out.println(temp.substring(0, 4)); // 문자열의 0~3까지 읽어들임 
//				int year = Integer.parseInt(temp.substring(0, 4)) - 1900;
//				int month = Integer.parseInt(temp.substring(5, 7)) - 1;
//				int day = Integer.parseInt(temp.substring(8, 10));
//				int hour = Integer.parseInt(temp.substring(11, 13));
//				int minute = Integer.parseInt(temp.substring(14, 16));
//				int second = Integer.parseInt(temp.substring(17));
				
//				split() 메소드의 구분자를 "."으로 지정하면 제대로 동작되지 않는다.
//				split() 메소드의 구분자로 "."을 사용해야 한다면 "\\." 또는 "[.]" 형태로 구분자를 지정한다.
//				String[] date = temp.split("\\.");
				String[] date = temp.split("[.]");
				
//				System.out.println(Arrays.toString(date));
				int year = Integer.parseInt(date[0]) - 1900;
				int month = Integer.parseInt(date[1]) - 1;
				int day = Integer.parseInt(date[2]);
				int hour = Integer.parseInt(date[3]);
				int minute = Integer.parseInt(date[4]);
				int second = Integer.parseInt(date[5]);
				
				Date writeDate = new Date(year, month, day, hour, minute, second);
//				System.out.println(writeDate);
				
//				ArrayList에 저장하기 위해 MemoVO 클래스 객체를 만들어 넣어준다.
//				MemoVO vo = new MemoVO();
//				vo.setIdx(idx);
//				vo.setName(name);
//				vo.setPassword(password);
//				vo.setMemo(memo);
//				vo.setWriteDate(writeDate);
				
//				MemoVO vo = new MemoVO(name, password, memo);
//				vo.setIdx(idx);
//				vo.setWriteDate(writeDate);

				MemoVO vo = new MemoVO(idx, name, password, memo, writeDate);
//				System.out.println(vo);
				
//				MemoVO 클래스 객체에 저장된 데이터를 memoList ArrayList에 저장한다.
				memoList.add(vo);
				System.out.println(filename + ".txt 파일에서 읽기 완료!");
				
			}
			
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 또는 경로 이름이 올바르지 않습니다.");
		} // 파일.close()는 안 써도 됨
		
	}
	
	
	
}
