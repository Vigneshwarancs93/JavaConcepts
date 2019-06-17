package com.sample.vignesh;

public class Array {
		public static void main(String args[]) {
		char[] myStr= {'a','b','c','d','e','f','g','h','i','j'};
		System.out.println("");
		for(int i=0;i< myStr.length;i++) {
			if (myStr[i] == 'e') {
				myStr[i]= 'f';
			}
		}
		System.out.println(myStr);
	}

}
