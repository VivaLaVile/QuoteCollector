package SRPizza;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Adam on 06/11/2017.
 */
public class PdfExtractorTests {

    //String filePath = "E:\\Coding Projects\\QuoteCollector\\src\\main\\resources\\testDoc.pdf";
    String filePath = "D:\\Coding Projects\\QuoteCollector\\src\\main\\resources\\testDoc.pdf";

    @Test
    public void ourRefExtractorTest() throws IOException {

        PdfExtractor extractor = new PdfExtractor();
        extractor.setup();
        extractor.processFile(new File(filePath));
        String customerString = extractor.extractCustomer();
        System.out.println("Done..I think.");




    }



}
