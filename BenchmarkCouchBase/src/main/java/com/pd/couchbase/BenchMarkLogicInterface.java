package com.pd.couchbase;

public interface BenchMarkLogicInterface {

	public String setup();
	
	public String doInserts(String benchMarkTarget, int setKeyId);
	
	public String doReadUpdate(String benchmarkTarget, int setKeyId);
	
	public String reportStats();

}
