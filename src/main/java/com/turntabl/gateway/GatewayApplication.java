package com.turntabl.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("trades", r -> r.path("/trades/**")
						.filters(f -> f.rewritePath("/trades/(?<segment>.*)", "/${segment}"))
						.uri("http://trades:8081"))
				.route("positions", r -> r.path("/positions/**")
						.filters(f -> f.rewritePath("/positions/(?<segment>.*)", "/${segment}"))
						.uri("http://positions:8082"))
				.route("products", r -> r.path("/products/**")
						.filters(f -> f.rewritePath("/products/(?<segment>.*)", "/${segment}"))
						.uri("http://products:8083"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
