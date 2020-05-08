package main;

import data.Record;
import dataset.DataFileReader;
import dataset.Dataset;

public class Main {

	public static void main(String[] args) {
	
		DataFileReader reader = new DataFileReader(Dataset.A, 32);
		
		Record record = reader.getRecord(99);
	
	}

}
