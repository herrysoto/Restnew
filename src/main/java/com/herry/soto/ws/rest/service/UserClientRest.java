package com.herry.soto.ws.rest.service;



import com.herry.soto.ws.rest.vo.VOUsuario;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class UserClientRest {

	public static void main(String[] args) {
		String UrlValidation = "http://localhost:8080/Restnew/servrest/Serviciologin/Validation";
		System.out.println("Invoke Rest Service : ["+UrlValidation+  "]");
		VOUsuario vo = new VOUsuario();
		vo.setNombre("herry");
		vo.setContrasena("papi");
		vo.setValidacion(false);
		
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource(UrlValidation);
		ClientResponse response = webResource.type("application/json").post(ClientResponse.class,vo);
		vo = response.getEntity(VOUsuario.class);
		
		System.out.println("####### Response : [ Usuario : "+ vo.getNombre()+"]");
		System.out.println("####### Response : [ La validacion es : "+vo.isValidacion() +"]");
	}

}
