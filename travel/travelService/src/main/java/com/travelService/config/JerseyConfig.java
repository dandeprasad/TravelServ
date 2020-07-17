package com.travelService.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("v1")
@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		packages("com.travelService");
		packages("com.travelApi");
		// register(SampleResource.class);
	}
}
