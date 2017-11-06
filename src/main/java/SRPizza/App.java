package SRPizza;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //find all files
        //String baseDir = "Enter base dir";
        //List<String> allFiles = listFilepaths

        PdfExtractor myFirstExtractor = new PdfExtractor();
        try {
            myFirstExtractor.setUpPDFStripper();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            myFirstExtractor.extractTextFromPDDoc("E:\\Dad Quotes\\K1017 Sherford PS, Plymouth-20171102T193156Z-001\\K1017 Sherford PS_ Plymouth\\Culvert Quote\\K1017_2016_002SherfordFCG260416.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");

    }
}
