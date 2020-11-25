package eu.ricardocabral.fileprocessor.processor;

import java.util.HashMap;
import java.util.Map;

public class Statistics {


  private Map<String,  Long> results;

  public Statistics(){

    this.results =  new HashMap<>();
    results.put("spaces", 0l);
    results.put("countWords", 0l);
    results.put("countDots", 0l);
  }



  /**
   * Process each line
   *
   * @param line
   */
  public void processLine(String line) {

    CountWhiteSpaces cws = new CountWhiteSpaces();
    results.computeIfPresent("spaces", (key, val) -> val + cws.countSpaces(line));

    System.out.println(" Count with spaces " +  cws.countSpaces(line));

    CountWords cw = new CountWords();
    results.computeIfPresent("countWords", (key, val) -> val + cw.countWords(line));

    System.out.println(" Count Words " +  cw.countWords(line));

    CountDots cd = new CountDots();
    results.computeIfPresent("countDots", (key, val) -> val + cd.countDots(line));

    System.out.println(" Count dots " +  cd.countDots(line));



    MostUsedWords muw = new MostUsedWords();
    System.out.println(" Most User Words " +  muw.getMostRepeatedWord(line));
  }

  public Map<String,  Long> getResults(){
    return results;
  }

}
