package CustomerLookupPojoClasses;

public class UuidMetaDataRequest {
	
	private String uuid;
	private String targetSystemName;
	private String callingSystemName;
	private String uniqueCallingUserId;
	private String requestDateTime;
	private String serviceName;
	private String serviceVersion;
	private String svcUsername;
	private String svcPassword;
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public String getTargetSystemName() {
		return targetSystemName;
	}
	public void setTargetSystemName(String targetSystemName) {
		this.targetSystemName = targetSystemName;
	}
	public String getCallingSystemName() {
		return callingSystemName;
	}
	public void setCallingSystemName(String callingSystemName) {
		this.callingSystemName = callingSystemName;
	}
	public String getUniqueCallingUserId() {
		return uniqueCallingUserId;
	}
	public void setUniqueCallingUserId(String uniqueCallingUserId) {
		this.uniqueCallingUserId = uniqueCallingUserId;
	}
	public String getRequestDateTime() {
		return requestDateTime;
	}
	public void setRequestDateTime(String requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceVersion() {
		return serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}
	public String getSvcUsername() {
		return svcUsername;
	}
	public void setSvcUsername(String svcUsername) {
		this.svcUsername = svcUsername;
	}
	public String getSvcPassword() {
		return svcPassword;
	}
	public void setSvcPassword(String svcPassword) {
		this.svcPassword = svcPassword;
	}
	
}
