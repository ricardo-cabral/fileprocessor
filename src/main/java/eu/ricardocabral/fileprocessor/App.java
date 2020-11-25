/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package eu.ricardocabral.fileprocessor;

import eu.ricardocabral.fileprocessor.exception.ApplicationException;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;

public class App {


    public static void main(String[] args) {


       Path dir = validateInput(args);

//        try {
//
//            WatchService watchService = FileSystems.getDefault().newWatchService();
//
//            WatchKey key = dir.register(watchService,
//              ENTRY_CREATE,
//              ENTRY_DELETE,
//              ENTRY_MODIFY);
//
//            while ((key = watchService.take()) != null) {
//                for (WatchEvent<?> event : key.pollEvents()) {
//                    System.out.println(
//                      "Event kind:" + event.kind()
//                        + ". File affected: " + event.context() + ".");
//                }
//                key.reset();
//            }
//        } catch (IOException | InterruptedException x) {
//            System.out.println("Unexpected Error");
//            System.exit(0);
//        }

    }

    private static Path validateInput(String[] args) {
        if(args == null || args.length != 1) {
            throw new ApplicationException("Application Expects at list one valid directory argument!");
        }
        String directory = args[0];

        Path path = Paths.get(directory);
        if( (!path.toFile().exists()) || (path.toFile().isDirectory())){
            throw new ApplicationException( String.format("Directory %s was not found, please check the Path", directory));
        }

        return path;
    }


}
