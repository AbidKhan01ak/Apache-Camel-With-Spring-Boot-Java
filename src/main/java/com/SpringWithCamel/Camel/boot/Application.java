package com.SpringWithCamel.Camel.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(Application.class, args);
//		Main main = new Main();
//		main.configure().addRoutesBuilder(new XmlToJsonRoute());
//		main.run(args);
	}

}
