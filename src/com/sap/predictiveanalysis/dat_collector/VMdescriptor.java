package com.sap.predictiveanalysis.dat_collector;

public class VMdescriptor {
	  private String state;
	  private int processId;
	  private String name;
	  private  int version;
	  private int releasedate;
	  private int expirydate;
	   
	  VMdescriptor(){
	    	}
	    
	  public VMdescriptor(String state,int processId,String name,int version,int releasedate,int expirydate)
	  {   
	    this.state=state;
	    this.processId=processId;
	    this. name= name;
	    this.version=version;
	    this.releasedate=releasedate;
	    this.expirydate=expirydate;}
	  
	 
	  
	    public String state() {
	        return state;
	    }
	    
	    public int processId() {
	        return processId;
	    }
	    public String name() {
	        return name;
	    }
	   
	    public int version() {
	        return version;
	    }
	    public int releasedate() {
	        return releasedate ;
	    }
	    public int expirydate() {
	        return expirydate;
	    }
	    public void printDetails(){
	    	System.out.println( "STATE OF A VM IS   : "+state);
	    
	    	System.out.println( "PROCESSID OF A VM IS   :"+processId);
	 
	    	System.out.println( "NAME  OF A VM IS : "+name);
	   
	    	System.out.println( "VERSION OF A VM IS   :"+version);
	 
	    	System.out.println( "RELEASE_DATE OF A VM IS   :"+releasedate);
	    	
	    	System.out.println( "EXPIRY_DATE OF A VM IS   :"+expirydate);
	    	System.out.println();
	    	}
}
