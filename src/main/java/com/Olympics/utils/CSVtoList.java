package com.Olympics.utils;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Olympics.model.MedalsByEdition;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class CSVtoList {
	        
    @SuppressWarnings("unchecked")
	public List<MedalsByEdition> readCSVFile(String caminhoArquivo) {
        List<MedalsByEdition> medalsList;

        try (
        	CSVReader reader = new CSVReader(new FileReader(caminhoArquivo))) {
    
            
        	medalsList = new CsvToBeanBuilder<MedalsByEdition>(reader)
                    .withType(MedalsByEdition.class)
                    .withSeparator(',')
                    .withIgnoreLeadingWhiteSpace(true)
                    .withIgnoreEmptyLine(true)
                    .build()
                    .parse();
        	
        	System.out.println(medalsList.stream().findFirst());
            return medalsList;
            
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
            medalsList = Collections.emptyList(); // Or handle exceptions differently
        } catch (RuntimeException e) {
            System.err.println("Unexpected error parsing CSV: " + e.getMessage());
            medalsList = Collections.emptyList(); // Or handle exceptions differently
        } finally {
           // Resource cleanup (optional)
        }
		return medalsList;
  
    }

}
