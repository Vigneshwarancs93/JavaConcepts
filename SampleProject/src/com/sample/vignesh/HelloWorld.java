/**
 * 
 */
package com.sample.vignesh;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Vignesh
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyMorphExm2 a1 =  new PolyMorphExm2();
		PolyMorphExample b1 = new PolyMorphExm2();
		
		
		System.out.println(b1.methodA(1, 2));
		System.out.println(a1.methodA(1, 2));
		System.out.println("java 2 system");
		//int[] valueSet = {21,1,31,43,44,55,63,71,81};
		ArrayList<Integer> data = new ArrayList<Integer>();
		String a = "1231241412412";
		Float data1 = new Float( 1.23124123123);
		Integer data2 = new Integer(31);
		data.add(add(32));
		data.add(add(31));
		data.add(add(21));
		data.add(add(61));
		data.add(add(71));
		data.add(add(21));
		
		String b=" whr is my cll phon";
		//b=b.replace(" ","");sl///////////////0-
		//System.out.println(" where is my cell phon");
		char[] c = b.toCharArray();
		
		//ArrayList<Integer> dataLista = new ArrayList<Integer>(Arrays.asList(1, 2, 3,4, 5, 6, 7, 8, 9));
		//ArrayList<Integer> dataListb = new ArrayList<Integer>(Arrays.asList(1,2,3,5,7,6,5,8,9));
		
		//ArrayList<Integer> alist1 = new ArrayList<Integer>();
		int[][] array123= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {	
				if(array123[i][j] == 5)
				array123[i][j] = 7;
				if(array123[i][j] == 7)
				array123[i][j] = 5;
				
			}
		}
		ArrayList<Character> data3 = new ArrayList<Character>();
		for(int i =0; i < c.length; i++) {
			data3.add(new Character(c[i]));
		}
		
		int e = 0;
		
		while (data3.contains(new Character('e')))  {
			e = e + 1;
			//data3.get(data3.indexOf(new Character('e')));
			data3.remove(data3.indexOf(new Character('e')));
		} 
		
		System.out.println(e);
	}
	
	
	public static Integer add(int e) {
		return new Integer(e);
	}

}
