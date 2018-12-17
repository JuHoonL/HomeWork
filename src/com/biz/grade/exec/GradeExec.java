package com.biz.grade.exec;

import com.biz.grade.service.GradeService;

public class GradeExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String printF = "src/com/biz/grade/vo/성적표정리.txt";
		String StudentF = "src/com/biz/grade/vo/학생리스트.txt";
		String GradeF = "src/com/biz/grade/vo/점수표.txt";
		
		GradeService gS = new GradeService(printF);
		
		gS.readInStu(StudentF);
		gS.readGrade(GradeF);
		gS.matchingList();
		
//		gS.view();
		gS.filePrint();
	}

}
