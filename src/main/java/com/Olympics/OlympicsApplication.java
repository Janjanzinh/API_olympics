package com.Olympics;

import com.Olympics.utils.CsvGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OlympicsApplication {


	public static void main(String[] args) {
		SpringApplication.run(OlympicsApplication.class, args);

		new CsvGame().readCSVFile();
	}


}
