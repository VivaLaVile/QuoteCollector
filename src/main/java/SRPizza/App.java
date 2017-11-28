package SRPizza;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //setup file filter ready for use later
        FileFilter fileFilter = new FileFilter();

        //find all files
        String baseDir = "E:\\Dad Quotes";
        List<String> allFiles = listFilePaths(baseDir);

        System.out.println("Done");

    }
        static List<String> listFilePaths(String directoryPath){
            List<String> quoteFilePaths = new ArrayList<>();


            File dir = new File(directoryPath);


            for (File file:dir.listFiles()) {
                if (file.isDirectory()) {
                    quoteFilePaths.addAll(listFilePaths(file.getAbsolutePath()));
                } else {
                    quoteFilePaths.add(file.getAbsolutePath());
                }
            }

            return quoteFilePaths;

        }
    }
