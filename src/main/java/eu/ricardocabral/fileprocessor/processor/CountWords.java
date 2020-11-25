package eu.ricardocabral.fileprocessor.processor;

import java.util.Arrays;

public class CountWords {


  public long countWords(String line) {

    return
       Arrays.stream(line.split("\\s+") )
        .count();
  }
}
