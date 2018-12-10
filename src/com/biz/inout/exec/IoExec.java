package com.biz.inout.exec;

import com.biz.inout.service.*;
import com.biz.inout.vo.*;

public class IoExec {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IoService is = new IoService();
		String ziz = "src/com/biz/inout/exec/iolist.txt";
		is.spliter(ziz);
		is.chuluc();
	}

	
}