package gk;
import java.util.*;
public class array {
  public static void main(String args[]) {
	  int i,t=3;
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int a[]=new int[n];
	  for(i=0; i<n;i++) {
		  a[i]=s.nextInt();
		  }
	  for(i=0; i<n; i++) {
		  t=t^a[i];
	  }
	  System.out.println(t);
  }
}
