package com.tomfrans.spring.spring5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration

public class PropertyConfig {

	@PropertySource(value = { "classpath:resource-club.properties" })
	@Profile("club")
	public static class ClubConfig {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();			
			return pspc;
		}
	}

	@PropertySource(value = { "classpath:resource-player.properties" })
	@Profile("player")
	public static class TestConfig {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();			
			return pspc;
		}
	}



}
