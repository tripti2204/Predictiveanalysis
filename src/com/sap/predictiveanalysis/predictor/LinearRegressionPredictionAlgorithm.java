package com.sap.predictiveanalysis.predictor;

public class LinearRegressionPredictionAlgorithm {
	private double cpuLoadHistory[]=new double[12] ;
	private double observedCpuLoad;
	private double predictedCpuLoad[]=new double[12];
	private double error;
	//Regression Coefficients.
	float B0,B1;
	
  public void predictCpuTime(double cpuLoad[],int size){
	  
	for(int i=0;i<size;i++) {
		 cpuLoadHistory[i]=cpuLoad[i];
		 observedCpuLoad=cpuLoad[i+1];
		 predictedCpuLoad[i]=B0+B1*cpuLoadHistory[i];
		
			 error=calculateLoss(i+1);
		}
  }
  public double calculateLoss(int num){
	  double sum=0.0;
	  for(int j=1;j<=num;j++)
	  {
		  sum=sum+(cpuLoadHistory[j]- predictedCpuLoad[j])*(cpuLoadHistory[j]- predictedCpuLoad[j]);
	  }
	  
 return(sum);
 
  }
  

  

}
