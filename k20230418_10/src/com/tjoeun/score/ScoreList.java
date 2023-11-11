package com.tjoeun.score;

import java.util.ArrayList;

public class ScoreList {

	private ArrayList<ScoreVO> scoreList = new ArrayList<>();
	
	public ScoreList() {
		// TODO Auto-generated constructor stub
	}	

	public ArrayList<ScoreVO> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<ScoreVO> scoreList) {
		this.scoreList = scoreList;
	}

//	ArrayList에 성적 데이터를 추가하는 메소드
	public void addScore(ScoreVO score) {
		
		String str = "";
		str += "========================================================\n";
		str += " 아이디 이름 java jsp spring 총점 평균 석차\n";
		str += "========================================================\n";
		
		for(ScoreVO vo : scoreList) {
			str += vo + "\n";
			
		}
		
//		for(int i=0; i<scoreList.size()-1; i++) {
//			for(int j=i+1; j<scoreList.size(); j++) {
//				if(scoreList.get(i) > scoreList.get(j)) {
//					int temp = scoreList.get(i).getMean();
//				}
//			}
//		}
		


	}
	
	
	
	
}
