package com.sap.predictiveanalysis.dat_collector;

public interface VM_performance_metric_query
{    
	
	void GET_CPU_LOAD();
	void GET_REQUEST_PER_MIN();
	void GET_DISK_IO();
	void GET_OS_MEMORY_USAGE();
	void GET_AVERAGE_RESPONSE_TIME();
	void GET_BUSY_THREADS();
	
	}
