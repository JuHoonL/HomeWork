package com.biz.koreaname.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class KoreanService01 {

	List<String> fList;
	List<String> nList;
	
	String strName;
	String strFF;
	String strNF;
	String strP;
	
	
	
	public KoreanService01(String strFF, String strNF, String strP) {
		fList = new ArrayList();
		nList = new ArrayList();
		this.strFF = strFF;
		this.strNF = strNF;
		this.strP = strP;
	}
	
	
	
	public void readFF() {
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strFF);
			br = new BufferedReader(fr);
			
			while(true) {
				String readF = br.readLine();
				if(readF == null) break;
				String[] splitF = readF.split(":");
				fList.add(splitF[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void readNF() {
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strNF);
			br = new BufferedReader(fr);
			
			while(true) {
				String readF = br.readLine();
				if(readF == null) break;
				nList.add(readF);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void shuffleFN() {
		Collections.shuffle(fList);
		Collections.shuffle(nList);
	}
	
	
		
	public void viewN2() {
		for(int i = 0 ; i < 100 ; i ++) {
			int k = (int)(Math.random() * fList.size() -1);
			int j = (int)(Math.random() * nList.size() -1);
			strName= fList.get(k) + nList.get(j);
			System.out.println(strName);
		}
	}
	
	
	
	
	public void writerN() {
		
		PrintWriter pw;
		
		try {
			pw = new PrintWriter(this.strP);
			
			int len = fList.size();		
			for(int i = 0 ; i < len ; i ++) {
				pw.println(i + ". " + fList.get(i) + nList.get(i));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
