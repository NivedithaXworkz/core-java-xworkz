class JVM{
	private String purpose;
	private String version;
	private String platform;
	
	public JVM(){
		
	}
	public void setPurpose(String purpose){
		this.purpose=purpose;
	}
	public String getPurpose(){
		return purpose;
	}
	
	public void setVersion(String version){
		this.version=version;
	}
	public String getVersion(){
		return version;
	}
	public void setPlatform(String platform){
		this.platform=platform;
	}
	public String getPlatform(){
		return platform;
	}
	
}