package com.biz.grade.test;

import java.util.Scanner;

public class Algorithm02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("검색할 연도를 입력하세요 >> ");
		String mW = scan.nextLine();
		int intmW = Integer.valueOf(mW);
		if(intmW % 4 == 0 ) {
			if(intmW % 100 == 0) {
				if(intmW % 400 == 0) {
					System.out.println(mW + "는 윤년입니다.");
					return;
				}
				System.out.println(mW + "는 평년입니다.");
				return;
			}
			System.out.println(mW + "는 태양력의 윤년입니다.");
			return;
		}
		System.out.println(mW + "는 태양력의 평년입니다(윤년이 아닙니다).");
	}

}
