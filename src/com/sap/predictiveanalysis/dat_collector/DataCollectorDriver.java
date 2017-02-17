package com.sap.predictiveanalysis.dat_collector;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class DataCollectorDriver extends Thread{
	
	
	public static void main(String args[])
	    {  
		
		 
		DataCollectorDriver t=new DataCollectorDriver();
		System.out.println( "VM CPU LOAD STATS ");
		System.out.println();
	          t.start();
          
	        
	 }
	
	//    @overrided method
	
	public void run(){  
		HashMap<Integer, Double[]> hmap = new HashMap<Integer, Double[]>();
		int count;
		 VMpooldescriptor vm=new VMpooldescriptor();
	    	count=vm.getNumberOfVM();
	    	System.out.println( "Total No Of VM's "+ count);
	    	System.out.println();
	   
	    	
	    	 for(int j=1;j<=count;j++)
	    	 {  
	    		 
	    		try{
	    		  
	    		 Thread.sleep(5000);
	    	 
	    	  	 }
	    	 
	    	 
	    	 catch(InterruptedException e){
	    		 
	    	 }
	    	 
	    	 
	    	 hmap=vm.getVMId();
	    	 }
	    	 	
	}
	
}