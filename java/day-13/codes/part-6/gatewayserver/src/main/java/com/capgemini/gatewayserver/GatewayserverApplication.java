package com.capgemini.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public RouteLocator CgBankRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
	 return routeLocatorBuilder.routes()
				.route(p -> p
					     .path("/cgbank/accounts-ms/**")
					     .filters( f -> f.rewritePath("/cgbank/accounts-ms/(?<segment>.*)","/${segment}"))
					.uri("lb://ACCOUNTS-MS")) 

				.route(p -> p
					     .path("/cgbank/loans-ms/**")
					     .filters( f -> f.rewritePath("/cgbank/loans-ms/(?<segment>.*)","/${segment}"))
					.uri("lb://LOANS-MS")) 

				.route(p -> p
					     .path("/cgbank/cards-ms/**")
					     .filters( f -> f.rewritePath("/cgbank/cards-ms/(?<segment>.*)","/${segment}"))
					.uri("lb://CARDS-MS")) 

		.build();			
	}

}
