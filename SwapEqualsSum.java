


import java.util.HashSet;

public class swapEqualsSum {
	public static void main(String args[]) {
	//int a[],b[];
	 int a[] = {4, 1, 2, 1, 1, 2};
      int b[] = {3, 6, 3, 3};
      int sum1=0,sum2=0;
      HashSet<Integer> s=new HashSet<Integer>();
      for(int i=0;i<a.length;i++) {
    	  sum1=sum1+a[i];
    	  
    	 
      }
      for(int j=0;j<b.length;j++) {
    	  sum2=sum2+b[j];
    	  s.add(b[j]);
      }
      int flag=0;
     
      int d=(sum2-sum1)/2;
      
      for(int k=0;k<a.length; k++) {
    	  int p=a[k]+d;
    	//  System.out.println(p);
    	  if(s.contains(p)) {
    		  flag=1;
    	      System.out.println("Pair" + p/2+ " " + a[k]/2);

    		  break;
    	  }
      
      
     }
}
}
