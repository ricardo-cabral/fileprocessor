package eu.ricardocabral.fileprocessor.processor;

import java.io.File;

public interface FileProcessor {

  void read(File file);
  void process(File file);
}
