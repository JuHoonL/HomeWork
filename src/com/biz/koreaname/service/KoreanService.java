package com.biz.koreaname.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KoreanService {

	List<String> fList;
	List<String> nList;
	List<String> fullList;
	
	String strFF;
	String strNF;
	String strP;
	
	
	
	public KoreanService(String strFF, String strNF, String strP) {
		fList = new ArrayList();
		nList = new ArrayList();
		fullList = new ArrayList();
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
	
	
	
	public void shuffleFN(int Number) {
		for(int i = 0 ; i < Number ; i ++) {
			int k = (int)(Math.random() * fList.size());
			int j = (int)(Math.random() * nList.size());
			String strName= fList.get(k) + nList.get(j);
//			System.out.println(strName);
			fullList.add(strName);
		}
	}
	

	
	public void writerN() {
		
		PrintWriter pw;
		
		try {
			pw = new PrintWriter(this.strP);
			
			for(String s : fullList) {
				pw.println(s);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
