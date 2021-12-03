package com.crio.session1.activity1;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

class Main {

  public void parseJsonJacksomatically(File inputFile, File outputFile) throws JsonParseException, JsonMappingException, IOException {
   // Initialize ObjectMapper
   // De-Serialize and print the POJOs
   // Serialize the POJOs to outputFile
   ObjectMapper objectMapper = new ObjectMapper();
   Trade[] trades = objectMapper.readValue(inputFile, Trade[].class);
   System.out.println("Deserialized(read) successfully");
   for (Trade trade : trades) {
     System.out.println(trade);
    }
    objectMapper.writeValue(outputFile, trades);
    System.out.println("Serialized(wrote) successfully");

  }



  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    Main main = new Main();

    // Input JSON files to be deserialized
    File trades = new File("src/main/java/com/crio/session1/activity1/trades.json");

    // POJO to be serialized to Output File
    File outputFile = new File("src/main/java/com/crio/session1/activity1/readOutput.json");

    main.parseJsonJacksomatically(trades, outputFile);


    System.out.println("Running completed");
  }
}

