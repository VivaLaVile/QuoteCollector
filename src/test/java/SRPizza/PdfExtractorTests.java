package SRPizza;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.File;

/**
 * Created by Adam on 06/11/2017.
 */
public class PdfExtractorTests {

    String filePath = "E:\\Coding Projects\\QuoteCollector\\src\\main\\resources\\testDoc.pdf";

    @Test
    public void ourRefExtractorTest(){

        PdfExtractor extractor = new PdfExtractor();
        extractor.setup();
        extractor.processFile(new File(filePath));
        extractor.extractCustomer();


    }



}
