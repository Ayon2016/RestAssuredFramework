package com.wkhealth.pojo.kt;

public class CustomerLookupRequest {
	
	private UuidMetaDataRequest uuidMetaDataRequest;
	private CustomerLookupRequestInfo customerLookupRequestInfo;

	public UuidMetaDataRequest getUuidMetaDataRequest() {
		return uuidMetaDataRequest;
	}
	public void setUuidMetaDataRequest(UuidMetaDataRequest uuidMetaDataRequest) {
		this.uuidMetaDataRequest = uuidMetaDataRequest;
	}
	public CustomerLookupRequestInfo getCustomerLookupRequestInfo() {
		return customerLookupRequestInfo;
	}
	public void setCustomerLookupRequestInfo(CustomerLookupRequestInfo customerLookupRequestInfo) {
		this.customerLookupRequestInfo = customerLookupRequestInfo;
	}

}
