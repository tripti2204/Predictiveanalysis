package com.sap.predictiveanalysis.dat_collector;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class VMperformancemetricdescriptor extends VMdescriptor
	{
	
	public VMperformancemetricdescriptor(String STATE,int PROCESSID,String NAME,int VERSION,int RELEASE_DATE,int EXPIRY_DATE)
		{ super(STATE,PROCESSID,NAME,VERSION,RELEASE_DATE,EXPIRY_DATE);
		 
		}
		 
		
		
	Double CPU_LOAD[]=new Double[12];
	  int REQUEST_PER_MIN[]=new int[12];
	  float DISK_IO[]=new float[12];
	  int AVERAGE_RESPONSE_TIME[]=new int[12];
	  float OS_MEMORY_USAGE[]=new float[12];
	  int BUSY_THREADS[]=new int[12];
	 
	  
	  public HashMap<Integer,Double[]> initializePerformanceMetric(Integer VMid)
	  { HashMap<Integer, Double[]> h = new HashMap<Integer, Double[]>();
		 DUMMYVMPOOL dvm=new DUMMYVMPOOL();
		 
	        for(int i=1;i<=12;i++)
			 {
			 CPU_LOAD[i-1]=dvm.dummyGen(5*i);
			
		 System.out.println("CPU_LOAD at "+5*i+"minutes is   "+CPU_LOAD[i-1]);
		 }
	  
	        h.put(VMid,CPU_LOAD );
			 return(h);
	  }

	 
	}


