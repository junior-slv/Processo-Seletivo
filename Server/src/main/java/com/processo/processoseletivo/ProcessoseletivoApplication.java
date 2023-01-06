package com.processo.processoseletivo;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.io.IOException;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ProcessoseletivoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessoseletivoApplication.class, args);
	}

	@Component
	public class MyFilter extends OncePerRequestFilter {

		@Override
		public void destroy() {

		}

		private String getAllowedDomainsRegex() {
			return "individual / customized Regex";
		}

		@Override
		protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
				throws ServletException, IOException {

			final String origin = "http://localhost:4200";

			response.addHeader("Access-Control-Allow-Origin", origin);
			response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
			response.setHeader("Access-Control-Allow-Credentials", "true");
			response.setHeader("Access-Control-Allow-Headers",
					"content-type, x-gwt-module-base, x-gwt-permutation, clientid, longpush");

			filterChain.doFilter(request, response);

		}
	}



}
