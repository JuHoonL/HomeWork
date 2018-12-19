package com.biz.koreaname.exec;

import com.biz.koreaname.service.KoreanService;

public class KoreanExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFF = "src/com/biz/koreaname/한국인성씨.txt";
		String strNF = "src/com/biz/koreaname/이름리스트.txt";
		String strP = "src/com/biz/koreaname/한국인이름리스트.txt";
		
		KoreanService ks = new KoreanService(strFF, strNF, strP);
		
		ks.readFF();
		ks.readNF();
		ks.shuffleFN(100);
//		ks.viewN();
		ks.writerN();
	}

}
