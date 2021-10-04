package CustomerLookupPojoClasses;

import CustomerLookupPojoClasses.CustomerLookupResponseInfo;
import CustomerLookupPojoClasses.UuidMetaDataRequest;
import CustomerLookupPojoClasses.UuidMetaDataResponse;

public class CustomerLookupResponse {
	

	private UuidMetaDataRequest uuidMetaDataRequest;
	private UuidMetaDataResponse uuidMetaDataResponse;
	private CustomerLookupResponseInfo customerLookupResponseInfo;
	
	public UuidMetaDataRequest getUuidMetaDataRequest() {
		return uuidMetaDataRequest;
	}
	public void setUuidMetaDataRequest(UuidMetaDataRequest uuidMetaDataRequest) {
		this.uuidMetaDataRequest = uuidMetaDataRequest;
	}
	public UuidMetaDataResponse getUuidMetaDataResponse() {
		return uuidMetaDataResponse;
	}
	public void setUuidMetaDataResponse(UuidMetaDataResponse uuidMetaDataResponse) {
		this.uuidMetaDataResponse = uuidMetaDataResponse;
	}
	public CustomerLookupResponseInfo getCustomerLookupResponseInfo() {
		return customerLookupResponseInfo;
	}
	public void setCustomerLookupResponseInfo(CustomerLookupResponseInfo customerLookupResponseInfo) {
		this.customerLookupResponseInfo = customerLookupResponseInfo;
	}
	
}
