package CustomerLookupPojoClasses;

public class UuidMetaDataResponse {
	
	private String uuid;
	private String providerSystemName;
	private String responseDateTime;
	private String authenticationSuccessfulFlag;
	private String esbHostName;
	private String esbNodeName;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getProviderSystemName() {
		return providerSystemName;
	}
	public void setProviderSystemName(String providerSystemName) {
		this.providerSystemName = providerSystemName;
	}
	public String getResponseDateTime() {
		return responseDateTime;
	}
	public void setResponseDateTime(String responseDateTime) {
		this.responseDateTime = responseDateTime;
	}
	public String getAuthenticationSuccessfulFlag() {
		return authenticationSuccessfulFlag;
	}
	public void setAuthenticationSuccessfulFlag(String authenticationSuccessfulFlag) {
		this.authenticationSuccessfulFlag = authenticationSuccessfulFlag;
	}
	public String getEsbHostName() {
		return esbHostName;
	}
	public void setEsbHostName(String esbHostName) {
		this.esbHostName = esbHostName;
	}
	public String getEsbNodeName() {
		return esbNodeName;
	}
	public void setEsbNodeName(String esbNodeName) {
		this.esbNodeName = esbNodeName;
	}

}
