package eu.ricardocabral.fileprocessor.processor;

public class Accumulator {

  private String value;

  public long getAccumulator() {
    return accumulator;
  }

  public void setAccumulator(long accumulator) {
    this.accumulator = accumulator;
  }

  private long accumulator;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
