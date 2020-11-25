package eu.ricardocabral.fileprocessor.processor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostUsedWords {


  public Map<String, Long> getMostRepeatedWord(String s)  {

    Map <String, Long> result =
      Arrays.stream(s.split("\\s+")).sorted()
        .collect(Collectors.groupingBy(Function.identity(),
          Collectors.counting() ));

    Map<String, Long> finalMap = new LinkedHashMap<>();

    result.entrySet().stream()
      .sorted(Map.Entry.<String, Long>comparingByValue()
        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

    return finalMap;
  }
}
