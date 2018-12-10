package com.biz.inout.vo;

public class IoVO {
	private String strDate;
	private String strInout;
	private String strPum;
	private int intSu;
	private int intDan;
	private int intMI;
	private int intMC;

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public String getStrInout() {
		return strInout;
	}

	public void setStrInout(String strInout) {
		this.strInout = strInout;
	}

	public String getStrPum() {
		return strPum;
	}

	public void setStrPum(String strPum) {
		this.strPum = strPum;
	}

	public int getIntSu() {
		return intSu;
	}

	public void setIntSu(int intSu) {
		this.intSu = intSu;
	}

	public int getIntDan() {
		return intDan;
	}

	public void setIntDan(int intDan) {
		this.intDan = intDan;
	}

	public int getIntMI() {
		return intMI;
	}

	public void setIntMI(int intMI) {
		this.intMI = intMI;
	}

	public int getIntMC() {
		return intMC;
	}

	public void setIntMC(int intMC) {
		this.intMC = intMC;
	}

	@Override
	public String toString() {
		return "IoVO [strDate=" + strDate + ", strInout=" + strInout + ", strPum=" + strPum + ", intSu=" + intSu
				+ ", intDan=" + intDan + ", intMI=" + intMI + ", intMC=" + intMC + "]";
	}

}
