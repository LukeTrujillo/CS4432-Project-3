package dataset;

public enum Dataset {
	A("Project3Dataset-A"), B("Project3Dataset-B");
	
	private String directory;

	private Dataset(String directory) {
		this.directory = directory;
	}
	
	public String getDirectory() { return this.directory; }
}
