package com.wkhealth.reusable.resources;

public class Payloads {

	public static String returnCustomerLookupPayload(String clientId) {
		
		String payload = "{\r\n" + 
				"  \"customerLookupRequest\": {\r\n" + 
				"    \"uuidMetaDataRequest\": {\r\n" + 
				"      \"uuid\": \"MOZU-LWW_109d6a21-0637-4c4a-5d27-46ac7aeab438\",\r\n" + 
				"      \"targetSystemName\": \"Advantage\",\r\n" + 
				"      \"callingSystemName\": \"MOZU-LWW\",\r\n" + 
				"      \"uniqueCallingUserId\": \"MOZU-LWW\",\r\n" + 
				"      \"requestDateTime\": \"2020-4-27T19:30:16\",\r\n" + 
				"      \"serviceVersion\": \"V2\",\r\n" + 
				"      \"svcUsername\": \"CustomerLookup\",\r\n" + 
				"      \"svcPassword\": \"Q3VzdG9tZXJMb29rdXBfU1RH\",\r\n" + 
				"      \"serviceName\": \"CustomerLookup\"\r\n" + 
				"    },\r\n" + 
				"    \"customerLookupRequestInfo\": {\r\n" + 
				"      \"clientId\": \"" + clientId+"\",\r\n" + 
				"      \"customerNumber\": \"000000080685\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		
		return payload;
	}
}
