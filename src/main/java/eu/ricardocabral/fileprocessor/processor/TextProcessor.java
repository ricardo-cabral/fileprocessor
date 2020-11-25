package eu.ricardocabral.fileprocessor.processor;

import eu.ricardocabral.fileprocessor.exception.ApplicationException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TextProcessor {


  /**
   * Uses java.nio.Files and read it line by line to avoid load the entire file in memory
   * process each line and return the max package weight allowed and its items
   *
   * @return Map of limit weight and items insie
   * @throws ApplicationException
   */
  public void processFile(Path path) throws ApplicationException, IOException {

   Statistics statistics = new Statistics();

    StringBuilder b = new StringBuilder();
    try (Stream<String> lines = Files.lines( path )) {
      lines.forEach( line -> {b.append(line);
              statistics.processLine(line);}); ;
     // lines.forEach( line -> processLine(line));
     // lines.forEach( s -> b.append(s));

    } catch (IOException e) {
      throw new ApplicationException("Unexpected error", e);
    }
    //System.out.println("Accumulator: " +  accumulator.getAccumulator());

    System.out.println("Accumulator Map: " +  statistics.getResults());

    statistics.processLine(b.toString());

  }

  }


