package com.Olympics.utils;

import com.Olympics.model.MedalsByEdition;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class CsvGame {

    private static final String caminhoArquivo = "C:\\Users\\ja-ni\\OneDrive\\Documentos\\dados\\game_medal_tally.csv";

    public void readCSVFile() {

        ColumnPositionMappingStrategy<MedalsByEdition> strategy = new ColumnPositionMappingStrategy<MedalsByEdition>();
        strategy.setType(MedalsByEdition.class);


        try (CSVReader reader = new CSVReader(new FileReader(caminhoArquivo))) {
            List<MedalsByEdition> list = new CsvToBeanBuilder<MedalsByEdition>(reader)
                    .withMappingStrategy(strategy)
                    .build()
                    .parse();

            MedalsByEdition medalByEdition = list   .stream()
                                                    .findFirst()
                                                    .orElseThrow( ()  -> new RuntimeException("Deu ruim"));

            System.out.println(medalByEdition);

        } catch (IOException e) {
            e.printStackTrace();

        } catch (RuntimeException e) {
            System.out.println("Ocorreu um erro ao retonar primeiro elemmento");
        }


    }

}
