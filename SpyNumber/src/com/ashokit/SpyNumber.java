package com.ashokit;

import java.util.Scanner;

public class SpyNumber {
      public static void main(String[] args) {
    	  int num =123;
    	  
    	  int status = num;
    	  int sum =0,product=1;
          while(num > 0) {
       	   int digit =num % 10;
       	   sum+=digit;
       	   product*=digit;
       	   num=num/10;
          }
    	if(sum == product) {
    		System.out.println(status+":  is Spy number");
    	}else {
    		System.out.println(status+":  is not Spy  number");
    	}
      }
    }

	

