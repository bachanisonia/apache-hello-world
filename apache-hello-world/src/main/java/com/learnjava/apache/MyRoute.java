package com.learnjava.apache;

import org.apache.camel.builder.RouteBuilder;

public class MyRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		from("...")
		  .to("...");
		
	}
	
}
