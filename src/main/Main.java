package main;

import data.Record;
import dataset.DataFileReader;
import dataset.Dataset;

public class Main {

	public static void main(String[] args) {
	
		Query.performHashJoin();
	
		Query.performBlockLevelNestedLoopJoin();
		
		Query.performHashBasedAggregationFunction(Dataset.A,AggregationFunctionType.SUM_RANDOMV);
	}

}
