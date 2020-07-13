package com.oogie.discographyvelocity;

import com.oogie.discographyvelocity.service.ServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiscographyvelocityApplication implements ApplicationRunner{

	@Autowired
	private ServiceFacade songListService;
	public static void main(String[] args) {
		SpringApplication.run(DiscographyvelocityApplication.class, args);
	}

	public void run(ApplicationArguments arg0) throws Exception {
		songListService.doService("insert");
	}
}
