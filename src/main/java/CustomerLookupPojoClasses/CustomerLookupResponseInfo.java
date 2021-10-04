package CustomerLookupPojoClasses;

import java.util.List;

import CustomerLookupPojoClasses.AddressInfo;
import CustomerLookupPojoClasses.CommunicationInfo;
import CustomerLookupPojoClasses.CompanyInfo;
import CustomerLookupPojoClasses.CustomerInfo;
import CustomerLookupPojoClasses.EducationInfo;
import CustomerLookupPojoClasses.PromotionFlags;

public class CustomerLookupResponseInfo {
	private CustomerInfo customerInfo;
	private List<CommunicationInfo> communicationInfo;
	private CompanyInfo companyInfo;
	private EducationInfo educationInfo;
	private List<AddressInfo> addressInfo;
	private PromotionFlags promotionFlags;
	private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	public List<CommunicationInfo> getCommunicationInfo() {
		return communicationInfo;
	}
	public void setCommunicationInfo(List<CommunicationInfo> communicationInfo) {
		this.communicationInfo = communicationInfo;
	}
	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}
	public EducationInfo getEducationInfo() {
		return educationInfo;
	}
	public void setEducationInfo(EducationInfo educationInfo) {
		this.educationInfo = educationInfo;
	}
	public List<AddressInfo> getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}
	public PromotionFlags getPromotionFlags() {
		return promotionFlags;
	}
	public void setPromotionFlags(PromotionFlags promotionFlags) {
		this.promotionFlags = promotionFlags;
	}

	//{String1, String2, String3}
	//{CommunicationInfo1, CommunicationInfo2, CommunicationInfo3}
	
	
}
