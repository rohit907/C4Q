import java.util.Arrays;
import java.util.Scanner;

public class C4Q {
	

	  public static String convertBinary(int num){
		  if (num == 0) 
		  {
	           return "0";
		  }
	       String binary = "";
	       while (num > 0)
	       	{
	           int rem = num % 2;
	           binary = rem + binary;
	           num = num / 2;
	       	}
	       
		
	    String bitformat = String.format("%08d", Integer.parseInt(binary));
		 return bitformat;
		 }
	    
	  
	  public static void main(String args[])
	     { 
	    	String ip1="";
	    	String ip2="";
	    	String flag="in block";
	     
	    if(args.length==2){
	    
	    	 
	    	 String[] ipblock = args[0].split("/");
	    	 int blocksize=Integer.parseInt(ipblock[1]);//BlockSize
	    	 
	    	 String[] ipaddress=ipblock[0].split("\\.");//Array of first ip address
	    	 String[] ipaddress2=args[1].split("\\."); //Array of second ip address
	      for(int i=0;i<4;i++)
	    	ip1+=convertBinary(Integer.parseInt(ipaddress[i]));
	      for(int i=0;i<4;i++)
	    	  ip2+=convertBinary(Integer.parseInt(ipaddress2[i]));

	     
	      int count=0;
	    
	     
	    		 while(blocksize>0)
	    		 {
	    			 char a=ip1.charAt(count);
	    			 char b=ip2.charAt(count);
	    		
	    			 if(a!=b)
	    		 { 		
	    				 flag="not in block";
	    				 break;
	    					
	    		 }
	    			 count++;
	    			 blocksize--;
	    				 
	    		 }
	    		 System.out.println(flag);
	    		
	    		
	    }
	    else{
	    	System.out.println("Please enter the two ip address");
	    }
	     }
}
