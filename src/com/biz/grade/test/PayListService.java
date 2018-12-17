package com.biz.grade.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayListService {

	List<PayListVO> pList ;
	
	Scanner scan ;
	
	String strprintF ;
	
	String wName;
	
	
	public PayListService(String strprintF) {
		pList = new ArrayList();
		scan = new Scanner(System.in);
		this.strprintF = strprintF;
	}
	
	public void view() {
		
		for(PayListVO vv : pList)
			System.out.println(vv);
	}
	
	public void scanName() {
		System.out.print("이름 >> ");
		this.wName = scan.nextLine();
	}
	
	public void payCount() {
		
		System.out.print("금여금액 >> ");
		String wPay = scan.nextLine();
		
		PayListVO vo = new PayListVO();
		
		vo.setwName(this.wName);
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
	}
	
	
	
	public void payListPrint() {
		
		FileWriter fw;
		PrintWriter pw;
		
		try {
			fw = new FileWriter(this.strprintF);
			pw = new PrintWriter(fw);
			
			for(PayListVO vo : pList) {
				pw.println("===================================");
				pw.println(vo.getwName() + "의 급여명세내역");
				pw.println("급여액 : " + vo.getwPay());
				pw.println("-----------------------------------");
				pw.println("5만원권 : " + vo.getIntFMCount());
				pw.println("1만원권 : " + vo.getIntMCount());
				pw.println("5천원권 : " + vo.getIntFThCount());
				pw.println("1천원권 : " + vo.getIntThCount());
				pw.println("5백원권 : " + vo.getIntFHCount());
				pw.println("1백원권 : " + vo.getIntHCount());
				pw.println("5십원권 : " + vo.getIntFTCount());
				pw.println("1십원권 : " + vo.getIntTCount());
				pw.println("1원권 : " + vo.getIntOCount());
				pw.println("===================================");
			}
			pw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void menuFile() {
		while(true) {
			System.out.println("명세입력(1) / 리스트보기(2) / 끝내기(0)");
			System.out.print(">> ");
			String strmenu = scan.nextLine();
			if(strmenu.equals("1")) {
				this.scanName();
				this.payCount();
				this.payListPrint();
				System.out.println("입력이 완료되었습니다.");
			}
			if(strmenu.equals("2")) {
				for(PayListVO vv : pList)
					System.out.println(vv);
			}
			if(strmenu.equals("0")) return;
		}
	}
}
