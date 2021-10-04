package com.wkhealth.pojo.kt;

public class UuidMetaDataRequest {

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
	private String uuid;
	private String targetSystemName;
	private String callingSystemName;
	private String uniqueCallingUserId;
	private String requestDateTime;
}
