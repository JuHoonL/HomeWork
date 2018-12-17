package com.biz.grade.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<PayListVO> pList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		String strPF = "src/com/biz/test/algorithm03/급여명세.txt";
		
		while(true) {
			System.out.println("명세입력(1) / 리스트보기(2) / 끝내기(0)");
			System.out.print(">> ");
			String strmenu = scan.nextLine();
			if(strmenu.equals("1")) {
				PayListVO vo = new PayListVO();
				System.out.println("사원의 이름을 입력해주세요 ");
				System.out.println(">>");
				String wName = scan.nextLine();
				vo.setwName(wName);
				System.out.print("금여금액 >> ");
				String wPay = scan.nextLine();
				vo.setwPay(wPay);
				int intPay = Integer.valueOf(wPay);
				vo.setIntFMCount(intPay/50000); 	 	// 5만원권의 개수 셋팅
				int intFM = intPay % 50000;		
				
				vo.setIntMCount(intFM/10000);			// 1만원권의 개수 셋팅
				int intM = intFM % 10000;
				
				vo.setIntFThCount(intM/5000);			// 5천원권의 개수 셋팅
				int intFTh = intM % 5000;
				
				vo.setIntThCount(intFTh/1000);			// 1천원권의 개수 셋팅
				int intTh = intFTh % 1000;
				
				vo.setIntFHCount(intTh/500);			// 500원의 개수 셋팅
				int intFH = intTh % 500;
				
				vo.setIntHCount(intFH/100);				// 100원의 개수 셋팅
				int intH = intFH % 100;
				
				vo.setIntFTCount(intH/50);				// 50원의 개수 셋팅
				int intFT = intH % 50;
				
				vo.setIntTCount(intFT/10);				// 10원의 개수 셋팅
				
				vo.setIntOCount(intFT % 10);			// 1원의 개수 셋팅
				
				pList.add(vo);
				
				System.out.println("입력이 완료되었습니다.");
			}
			
			if(strmenu.equals("2")) {
				for(PayListVO vv : pList) {
					System.out.println(vv);
				}
			}
			
			if(strmenu.equals("0")) return;
		}
		
	}

}
