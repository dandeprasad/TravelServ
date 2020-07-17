package com.travelService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ImportResource({"/spring/context.xml"})
@ComponentScan({"com.travelService.*","com.travelApi.*"})
public class TravelStartApplication extends SpringBootServletInitializer{

	//Url to test ----  http://localhost:8080/v1/sampleresource/hello
	//http://localhost:8080/common
	//http://localhost:8080/admins
	//postman collection data-  https://www.getpostman.com/collections/eb9e67f0b8b4d86b02f7
	//git commits procedure: https://docs.github.com/en/github/managing-files-in-a-repository/adding-a-file-to-a-repository-using-the-command-line
	//Git credentials: dandeprasad Dandeprasad@982
	//git clone -b develop https://github.com/dandeprasad/TravelServ                   my repo
	public static void main(String[] args) {
		SpringApplication.run(TravelStartApplication.class, args);
	}
}


//either TravelStartApplication & jersy config should on same path
//Travel application should be on the top and give component scan which scans jersy as well.(hibernate internal components are not scanned for autowiring)
