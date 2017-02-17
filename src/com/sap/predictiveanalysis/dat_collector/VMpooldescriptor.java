package com.sap.predictiveanalysis.dat_collector;

import java.util.HashMap;
import java.util.Random;

public class VMpooldescriptor implements VMpoolcontroller
{
	private int lowvmcount=1;
	  private int highvmcount=10;
	  public int vmCount;
	  public Integer VMID[]=new Integer[10];
	  public int VMversion[]=new int[10];
	  public int releaseDate[]=new int[10];
	  public int expiryDate[]=new int[10];
	  
	  public int getNumberOfVM()
	  {
		  Random r = new Random();
		  vmCount= r.nextInt(highvmcount-lowvmcount) + lowvmcount;
        return(vmCount);
	  }
	 
	  public HashMap<Integer,Double[]> getVMId()
	  {  HashMap<Integer, Double[]> ht = new HashMap<Integer, Double[]>();
		  Random rnd = new Random();
	     for(int i=1;i<=vmCount;i++)
	 
	     { VMID[i]= 100000 + rnd.nextInt(20000);
	       String name=nameGenerator();
	      VMversion[i]=100+rnd.nextInt(900);
	      releaseDate[i]=1000+rnd.nextInt(9000);
	      expiryDate[i]=1000+rnd.nextInt(9000);
	      VMperformancemetricdescriptor newvm=new VMperformancemetricdescriptor ("active",VMID[i],name,VMversion[i],releaseDate[i], expiryDate[i]);
	      System.out.println();
	      newvm.printDetails();
	   ht=newvm.initializePerformanceMetric(VMID[i]);
	     } return(ht);
	     
	       }
	  
	  public String nameGenerator()  
	  {    int k=6;
		  String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		  StringBuilder builder = new StringBuilder();
		  while (k--!= 0) {
		  int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
		  builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		  }
		  return (builder.toString());
		  }
	  
	


}
