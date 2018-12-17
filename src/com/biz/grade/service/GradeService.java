package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.GradeVO;

public class GradeService {

	List<GradeVO> stuList ;
	List<GradeVO> gList;
	
	String strprint;
	
	public GradeService(String strprint) {
		stuList = new ArrayList();
		gList = new ArrayList();
		this.strprint = strprint;
	}
	
	public void readInStu(String strInStu) {
		
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strInStu);
			br = new BufferedReader(fr);
			
			while(true) {
				String readStu = br.readLine();	
				if(readStu == null) break;
				String[] splitStu = readStu.split(":");
				GradeVO vo = new GradeVO();
				vo.setStrNum(splitStu[0]);
				vo.setStrName(splitStu[1]);
				vo.setStrTel(splitStu[2]);
				vo.setStrAddr(splitStu[3]);
				
				stuList.add(vo);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void readGrade(String strInGrade) {
		
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strInGrade);
			br = new BufferedReader(fr);
			
			while(true) {
				String readG = br.readLine();
				if(readG == null) break;
				String[] splitG = readG.split(":");
				int intKor = Integer.valueOf(splitG[1]);
				int intEng = Integer.valueOf(splitG[2]);
				int intMth = Integer.valueOf(splitG[3]);
				int intSum = intKor + intEng + intMth;
				float floatAvg = (intKor + intEng + intMth)/3.0f;
				GradeVO vo = new GradeVO();
				vo.setStrNum(splitG[0]);
				vo.setIntKor(intKor);
				vo.setIntEng(intEng);
				vo.setIntMth(intMth);
				vo.setIntSum(intSum);
				vo.setFloatAvg(floatAvg);
				
				gList.add(vo);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void matchingList() {
		int sLLen = stuList.size();
		int gLLen = gList.size();
		for(int i = 0 ; i < sLLen ; i ++) {
			for(int j = 0; j < gLLen ; i ++) {
				if(stuList.get(i).getStrNum().equals(gList.get(j).getStrNum())) {
					stuList.get(i).setIntKor(gList.get(j).getIntKor());
					stuList.get(i).setIntEng(gList.get(j).getIntEng());
					stuList.get(i).setIntMth(gList.get(j).getIntMth());
					stuList.get(i).setIntSum(gList.get(j).getIntSum());
					stuList.get(i).setFloatAvg(gList.get(j).getFloatAvg());
				}
			}
		}
	}
	
	public void view() {
		for(GradeVO v : stuList) {
			System.out.printf("%s:%s:%s:%s:%d:%d:%d:%d:%.2f\n",
				v.getStrNum(),
				v.getStrName(),
				v.getStrTel(),
				v.getStrAddr(),
				v.getIntKor(),
				v.getIntEng(),
				v.getIntMth(),
				v.getIntSum(),
				v.getFloatAvg()
			);
		}
			
	}
	
	public void filePrint() {

		FileWriter fw;
		PrintWriter pw ;
		
		try {
			fw = new FileWriter(this.strprint);
			pw = new PrintWriter(fw);
			
			for(GradeVO vo : stuList) {
				pw.printf("%s:%s:%s:%s:%d:%d:%d:%d:%.2f\n",
					vo.getStrNum(),
					vo.getStrName(),
					vo.getStrTel(),
					vo.getStrAddr(),
					vo.getIntKor(),
					vo.getIntEng(),
					vo.getIntMth(),
					vo.getIntSum(),
					vo.getFloatAvg()
				);
			}
			pw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
