package com.alejandro.ws.client;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.alejandro.ws.resources.ObjectFactory;
import com.alejandro.ws.resources.ProductRequest;
import com.alejandro.ws.resources.ProductResponse;

public class ProductSoapClient extends WebServiceGatewaySupport {

	@SuppressWarnings("unchecked")
	public ProductResponse getProductByName(int action, String name) {
		ObjectFactory objectFactory = new ObjectFactory();
		ProductRequest requestFactory = objectFactory.createProductRequest();
		requestFactory.setAction(action);
		requestFactory.setName(name);
		JAXBElement<ProductRequest> request = objectFactory.createProductRequest(requestFactory);
		JAXBElement<ProductResponse> response = (JAXBElement<ProductResponse>) 
				getWebServiceTemplate().marshalSendAndReceive(request, new SoapActionCallback("http://www.example.org/Product"));
		return response.getValue();
	}
}
