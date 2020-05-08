package hash;

import java.util.HashMap;
import data.Record;
import dataset.Dataset;

public class HashTable extends HashMap<String, Bucket> {

	private static final int NUM_BUCKETS = 500;
	
	private Dataset dataset;
	
	public HashTable() {
		
	}
	
	
	
	public void put(Record record) {
		int randomValue = record.getRandomValue();
		String key = Integer.toBinaryString(randomValue);
		
		Bucket bucket = super.get(key);
		
		if(bucket == null) bucket = new Bucket();
		
		bucket.add(record);
		
		super.put(key, bucket); 
	}
	
	public String getKey(Record record) {
		int randomValue = record.getRandomValue();
		String key = Integer.toBinaryString(randomValue);
		
		return key;
	}
	
	
	public Bucket getBucket(Record record) {
		return get(getKey(record));
	}
	
	
	
}
