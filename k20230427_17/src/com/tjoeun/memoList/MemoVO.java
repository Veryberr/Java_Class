package com.tjoeun.memoList;

import java.text.SimpleDateFormat;
import java.util.Date;

//	메모 1건을 기억할 클래스
public class MemoVO {

//	클래스의 필드 이름은 데이터베이스 테이블에 정의 필드 이름, html의 form 태그요소의 name 속성에
//	정의한 이름과 반드시 같은 이름으로 만든다.
	private int idx; // 자동으로 1씩 증가하는 글번호
	private String name; // 작성자 이름
	private String password; // 비밀번호
	private String memo; // 메모
	private Date writeDate; // 메모 작성일 => 컴퓨터 시스템의 날짜와 시간으로 자동 설정
		
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	@Override
	public String toString() {
		
//		오늘 입력된 메모는 시각만 표시하고 어제 이전에 입력된 메모는 날짜만 표시한다.
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss"); // 오늘
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)"); // 어제 이전
		
//		메모가 작성된 날짜가 오늘인가 판단한다.
		Date date = new Date();
//		String str = "";
//		
//		if(date.getYear() == writeDate.getYear() && date.getMonth() == writeDate.getMonth() &&
//		date.getDate() == writeDate.getDate()) {
//			str = sdf1.format(writeDate);
//		}else {
//			str = sdf2.format(writeDate);
//		}
//		return String.format("%d. %s(%s)님이 %s에 남긴글\n%s", idx, name, password, str, memo);

		
		boolean isToday = date.getYear() == writeDate.getYear() && date.getMonth() == writeDate.getMonth() &&
				date.getDate() == writeDate.getDate();
		return String.format("%d. %s(%s)님이 %s에 남긴글\n%s", idx, name, password, 
				(isToday ? sdf1 : sdf2).format(writeDate), memo);
	}
	
	
}





