package com.sap.predictiveanalysis.dat_collector;

import static java.lang.Math.sin;

import java.util.Random;

public class DUMMYVMPOOL extends VMpooldescriptor implements VMpoolgenerator
{
	
public double dummyGen(int t)
{ 
	{Random r=new Random();
       int Amplitude=10+r.nextInt(90);  //Amplitude of the generated wave
       int phase=10+r.nextInt(90);  // phase of the generated wave
       int omega=10+r.nextInt(90);    //
	double cpu_load=Math.abs(Amplitude*(Math.sin(omega*t+phase)));
	return(cpu_load);
	}
}


}
