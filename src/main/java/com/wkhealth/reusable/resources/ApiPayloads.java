package com.wkhealth.reusable.resources;

public class ApiPayloads {
	
	public static String publishVendorPayload() {
		
		String body = "{\r\n" + 
				"   \"publishVendorRequestInfo\":{\r\n" + 
				"      \"clientId\":\"Firebrand\",\r\n" + 
				"      \"vendorDataList\":{\r\n" + 
				"         \"code\":\"ROH950\",\r\n" + 
				"         \"name\":\"Rohit Nadiger\",\r\n" + 
				"         \"CustomerNumber\":\"\",\r\n" + 
				"         \"paymentInformation\":{\r\n" + 
				"            \"paymentName\":\"Rohit Nadiger\",\r\n" + 
				"            \"contactInformation\":{\r\n" + 
				"               \"address\":{\r\n" + 
				"                  \"line1\":\"161 AVENUE DE SALBRIS\",\r\n" + 
				"                  \"line2\":\"CHICAGO\",\r\n" + 
				"                  \"city\":\"ROMORANTIN\",\r\n" + 
				"                  \"stateCode\":\"IL\",\r\n" + 
				"                  \"countryCode\":\"\",\r\n" + 
				"                  \"postalCode\":\"60069\",\r\n" + 
				"                  \"phoneNumber\":\"+33 2 5421 2949\"\r\n" + 
				"               },\r\n" + 
				"               \"websiteUrl\":\"edison.com\",\r\n" + 
				"               \"faxNumber\":\"\",\r\n" + 
				"               \"emailAddress\":\"COA PER Z SHAPIRO 1/18/13\"\r\n" + 
				"            },\r\n" + 
				"            \"type1099\":\"\"\r\n" + 
				"         },\r\n" + 
				"         \"orderInformation\":{\r\n" + 
				"            \"orderName\":\"James, May, Francis\",\r\n" + 
				"            \"contactInformation\":{\r\n" + 
				"               \"contactName\":\"Richard, June, Perrie\",\r\n" + 
				"               \"address\":{\r\n" + 
				"                  \"line1\":\"161 AVENUE DE SALBRIS\",\r\n" + 
				"                  \"line2\":\"DE SALBRIS\",\r\n" + 
				"                  \"city\":\"ROMORANTIN\",\r\n" + 
				"                  \"stateCode\":\"\",\r\n" + 
				"                  \"countryCode\":\"FRA\",\r\n" + 
				"                  \"postalCode\":\"41200\",\r\n" + 
				"                  \"phoneNumber\":\"212-255-6691\"\r\n" + 
				"               },\r\n" + 
				"               \"websiteUrl\":\"https://lippincottdirect.lww.com/\",\r\n" + 
				"               \"faxNumber\":\"212-255-6691\",\r\n" + 
				"               \"emailAddress\":\"jamesmay@wolters.com\"\r\n" + 
				"            },\r\n" + 
				"            \"isW8BenFormFiled\":true,\r\n" + 
				"            \"w8BenFormFiledDate\":\"2021-03-08\"\r\n" + 
				"         }\r\n" + 
				"      }\r\n" + 
				"   }\r\n" + 
				"}";
		
		return body;
		
	}
	
}
