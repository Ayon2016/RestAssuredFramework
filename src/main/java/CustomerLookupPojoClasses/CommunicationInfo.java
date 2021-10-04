package CustomerLookupPojoClasses;

public class CommunicationInfo {

	private int uniqueCommunicationId;
	private String communicationDetails;
	private String communicationSubType;
	private String communicationType;
	private String communicationSubTypeCode;
	private String communicationTypeCode;
	private String effectiveFromDate;
	private String effectiveThruDate;
	
	public int getUniqueCommunicationId() {
		return uniqueCommunicationId;
	}
	public void setUniqueCommunicationId(int uniqueCommunicationId) {
		this.uniqueCommunicationId = uniqueCommunicationId;
	}
	public String getCommunicationDetails() {
		return communicationDetails;
	}
	public void setCommunicationDetails(String communicationDetails) {
		this.communicationDetails = communicationDetails;
	}
	public String getCommunicationSubType() {
		return communicationSubType;
	}
	public void setCommunicationSubType(String communicationSubType) {
		this.communicationSubType = communicationSubType;
	}
	public String getCommunicationType() {
		return communicationType;
	}
	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}
	public String getCommunicationSubTypeCode() {
		return communicationSubTypeCode;
	}
	public void setCommunicationSubTypeCode(String communicationSubTypeCode) {
		this.communicationSubTypeCode = communicationSubTypeCode;
	}
	public String getCommunicationTypeCode() {
		return communicationTypeCode;
	}
	public void setCommunicationTypeCode(String communicationTypeCode) {
		this.communicationTypeCode = communicationTypeCode;
	}
	public String getEffectiveFromDate() {
		return effectiveFromDate;
	}
	public void setEffectiveFromDate(String effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}
	public String getEffectiveThruDate() {
		return effectiveThruDate;
	}
	public void setEffectiveThruDate(String effectiveThruDate) {
		this.effectiveThruDate = effectiveThruDate;
	}
}
