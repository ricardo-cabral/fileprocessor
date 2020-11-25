package eu.ricardocabral.fileprocessor.processor;

import java.io.File;

public abstract class FileProcessorFactory implements FileProcessor {

  public abstract void read(File file);
  public abstract void process(File file) ;
}
