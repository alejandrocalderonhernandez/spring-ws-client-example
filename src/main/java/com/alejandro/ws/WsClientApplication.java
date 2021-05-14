package com.alejandro.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alejandro.ws.client.ProductSoapClient;
import com.alejandro.ws.config.ClientConfig;
import com.alejandro.ws.resources.ProductResponse;

@SpringBootApplication
public class WsClientApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(WsClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WsClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			context.register(ClientConfig.class);
			context.refresh();
			ProductSoapClient client = context.getBean(ProductSoapClient.class);
			ProductResponse response = client.getProductByName(1, null);
			response.getProductDetails().forEach(p -> log.info(p.getName()));
		}
	}

}
