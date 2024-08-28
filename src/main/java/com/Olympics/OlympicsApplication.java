package com.Olympics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Olympics.utils.CSVtoList;

@SpringBootApplication
public class OlympicsApplication {


	public static void main(String[] args) {
		SpringApplication.run(OlympicsApplication.class, args);
		
		final String path = ".\\dados\\world_olympedia_olympics_game_medal_tally.csv";
		new CSVtoList().readCSVFile(path);
	}


}
