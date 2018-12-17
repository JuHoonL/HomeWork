package com.biz.grade.test;

public class PayListExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strPF = "src/com/biz/grade/test/급여명세.txt";
		PayListService pLS = new PayListService(strPF);
		
		
		pLS.menuFile();		
	}

}
