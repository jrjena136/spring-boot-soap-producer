package com.soap.produce.repository;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.soap.produce.jaxb.Greeting;

@Component
public class GreetingRepository {
	private static final String templateGreeting = "Hello, %s!";

	public Greeting getGreeting(String name) {
		Assert.notNull(name,"Name is mandatory and should not be null");

		Greeting result = null;

		Date d = new Date();

		String content = String.format(templateGreeting, name);

		result = new Greeting();
		result.setContent(content);
		result.setDate(d.toString());

		return result;
	}

}
