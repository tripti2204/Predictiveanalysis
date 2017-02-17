package com.sap.predictiveanalysis.dat_collector;

import static java.lang.Math.sin;

import java.util.Random;

public class DUMMYVMPOOL extends VMpooldescriptor implements VMpoolgenerator
{
	
public double dummyGen(int t)
{ 
	{Random r=new Random();
       int Amplitude=10+r.nextInt(90);
       int phase=10+r.nextInt(90);
       int omega=10+r.nextInt(90);
	double k=Math.abs(Amplitude*(Math.sin(omega*t+phase)));
	return(k);
	}
}


}
