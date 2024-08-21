package com.Olympics.olympics.arquivocsv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvGame {

    public String caminhoArquivo = "./Dados/game_medal_tally.csv";

   try{
       // Verificar se o arquivo já existe:
        boolean arquivoExiste = new File(caminhoArquivo).exists();

      //abre o escritor para adicionar dados ao arquivo:
        try {
            FileWriter escritor = new FileWriter(caminhoArquivo, arquivoExiste);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    } catch(IOException e){
        e.printStackTrace();
    }
}
