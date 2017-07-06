package gk;

import java.util.Arrays;
import java.util.Scanner;

public class kk {
	 public static void main(String args[]) {
		   Scanner scan=new Scanner(System.in);
	       System.out.println("ENTER THE NUMBER TO BE CONVERTED TO STRING:");
	       int n1=scan.nextInt();
	       int b[]=new int[(String.valueOf(n1)).length()];
	       int len=(String.valueOf(n1)).length();
	       int rem,j=0;
	       while((n1>0)&&(j<len)){
	           rem=n1%10;
	           b[j]=rem;
	           n1=n1/10;
	           j++;
	       }
	       Arrays.sort(b);
	       String s1="";
	       for(int i=0;i<len;i++){
	       s1=s1+Character.toString((char)(96+b[i]));
	       }
	       System.out.println("THE CONVERTED STRING IS:"+s1);
	   }
	}

