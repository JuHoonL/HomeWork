package com.biz.grade.test;

public class Algorithm01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intSum = 0;
		for(int i = 1 ; i <= 100 ; i ++) {
			if(i % 2 == 0)
				intSum += i ;
		}
		
		System.out.println(intSum);
	}

}
