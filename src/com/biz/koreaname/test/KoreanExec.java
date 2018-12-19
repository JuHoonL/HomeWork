package com.biz.koreaname.test;

public class KoreanExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFF = "src/com/biz/koreaname/test/한국인성씨.txt";
		String strNF = "src/com/biz/koreaname/test/이름리스트.txt";
		String strP = "src/com/biz/koreaname/test/한국인이름리스트.txt";
		
		KoreanService01 ks = new KoreanService01(strFF, strNF, strP);
		
		ks.readFF();
		ks.readNF();
//		ks.shuffleFN();
		ks.viewN2();
//		ks.writerN();
	}

}
