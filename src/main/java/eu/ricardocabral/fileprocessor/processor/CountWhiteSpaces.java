package eu.ricardocabral.fileprocessor.processor;

public class CountWhiteSpaces {

  public long countSpaces(String s){

    return  s.chars().filter(c -> c == (long)' ').count();
  }
}
