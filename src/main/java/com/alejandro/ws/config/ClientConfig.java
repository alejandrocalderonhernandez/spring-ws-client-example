package com.alejandro.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.alejandro.ws.client.ProductSoapClient;

@Configuration
public class ClientConfig {

	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.alejandro.ws.resources");
		return marshaller;
	}
	
	@Bean
	public ProductSoapClient productClient(Jaxb2Marshaller marshaller) {
		ProductSoapClient productClient = new ProductSoapClient();
		productClient.setDefaultUri("http://localhost:8080/ws/product.wsdl");
		productClient.setMarshaller(marshaller);
		productClient.setUnmarshaller(marshaller);
		return productClient;
	}
}
