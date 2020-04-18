package com.position2.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class GenerateUUID {
	
	public String generateUUID() {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
	return id;
	}
}
