package com.java.practice.encapsulation;

public class TextBook {
	private int pageno;
	 public void setpageno(int x)
	 {
		 if(x>=0)
		 {
			 pageno = x;
		 }
		 else
		 {
			 System.out.println("inavid page no");
		 }
	 }
	 public int getpageno()
	 {
		 return pageno;
	 }

}
