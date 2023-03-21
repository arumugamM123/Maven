package org.test;

import java.util.Arrays;

public class Excer {
	public static void main (String args[]) {
		int b;
	int a[]= {10,20,30,50,40,60,90,70};
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j]) {
				b=a[i];
				a[i]=a[j];
				a[j]=b;
				
			}
			
		}
		
	}
	for (int i = 0; i < a.length;i++) {
		System.out.println(a[i]);
	}
		

		}

}
