package eu.ricardocabral.fileprocessor.processor;

public class CountDots {

  public long countDots(String s){
    return s.chars().filter(c -> c == (long) '.').count();

  }
}
