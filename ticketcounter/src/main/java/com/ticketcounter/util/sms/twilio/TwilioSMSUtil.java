package com.ticketcounter.util.sms.twilio;

import java.net.URI;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSMSUtil {
	private final static String ACCOUNT_SID = "ACe9edfde88d902d1f79034deac297ffd1";
	private final static String AUTH_ID = "baf0b9601065900ab4b524936655e35b";
	
	/*LIVE ACCOUNT*/
//	private final static String ACCOUNT_SID = "AC9918884e7d9edd0f6a198ccac8634688";
//	private final static String AUTH_ID = "ba71d10879916884a89066ea406d3b91";

	static {
		Twilio.init(ACCOUNT_SID, AUTH_ID);
	}

	public static void main(String[] args) {
		Message message = Message.creator(new PhoneNumber("+16414514512"), new PhoneNumber("+15005550006"),
				"Message from Spring Boot Application - Chandra")
				 .setStatusCallback(URI.create("http://postb.in/1234abcd")).create();
		
//		Message.creator(new PhoneNumber("+16414514512"), new PhoneNumber("+16412443275"),
//				"Message from Spring Boot Application - Chandra").create();
	}

}
