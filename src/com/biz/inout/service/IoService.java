package com.biz.inout.service;

import java.io.*;
import java.util.*;

import com.biz.inout.vo.*;

public class IoService {

	FileReader fr;
	BufferedReader buffer;
	List<IoVO> ioList;

	public IoService() {
		ioList = new ArrayList();
	}

	public void chuluc() {

		System.out.println("===========================================================================");
		System.out.println("거래일자\t 구분\t 상품명\t 단가\t 수량\t매입금액\t매출금액\t");
		System.out.println("---------------------------------------------------------------------------");

		for (IoVO vo : ioList) {
			if (vo.getStrInout().equals("1")) {
				System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\n", vo.getStrDate(), 
						vo.getStrInout(), vo.getStrPum(),
						vo.getIntDan(), vo.getIntSu(),vo.getIntMI(),vo.getIntMC());
			}
		}

		for (IoVO vo : ioList) {
			if (vo.getStrInout().equals("0")) {
				System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\n", vo.getStrDate(), 
						vo.getStrInout(), vo.getStrPum(),
						vo.getIntDan(), vo.getIntSu(), vo.getIntMI(),vo.getIntMC());
			}
		}
	}

	public void spliter(String ziz) {
		try {
			fr = new FileReader(ziz);
			buffer = new BufferedReader(fr);
			while (true) {
				IoVO vo = new IoVO();
				String line = buffer.readLine();
				if (line == null)
					break;
				String[] lines = line.split(":");
				vo.setStrDate(lines[0]);
				vo.setStrPum(lines[1]);
				vo.setStrInout(lines[2]);
				vo.setIntDan(Integer.valueOf(lines[3]));
				vo.setIntSu(Integer.valueOf(lines[4]));
				
				vo.setIntMI(vo.getIntDan()*vo.getIntSu());
				vo.setIntMC(vo.getIntDan()*vo.getIntSu());
				ioList.add(vo);
			}
			
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}