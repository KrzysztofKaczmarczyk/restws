package com.krzysiek.ws.soap;

import java.util.Arrays;


import com.krzysiek.ws.service.PatnientServiceImp;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestwsApplication.class, args);
	}

	/*@Autowired
	private Bus bus;
	@Bean
	public Server rsServer() {
		// setup CXF-RS
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setBus(bus);
		endpoint.setServiceBeans(Arrays.<Object>asList(new PatnientServiceImp() {
		}));

		return endpoint.create();
	}*/

}
