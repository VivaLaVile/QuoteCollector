package SRPizza;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Adam on 01/11/2017.
 */
public class PdfExtractor implements IExtractor{

    private PDFTextStripper stripper;

    private File currentFile;

    @Override
    public void setup(){
        try {
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(1);
            stripper.setEndPage(1);
            this.stripper = stripper;
        } catch (IOException e){
            System.out.println("Failed to create PDFTextStripper: " + e.getMessage());
        }
        //if try block fails, this will be null - will that make things fail gracefully later on?
        //this.stripper = stripper;

    }

    @Override
    public void processFile(File file) {
        this.currentFile = file;
    }

    @Override
    public String extractOurRef() throws IOException {
        PDDocument pdDoc = PDDocument.load(this.currentFile);
        return stripper.getText(pdDoc);
    }

    @Override
    public String extractProjectCode() throws IOException {
        return null;
    }

    @Override
    public String extractYourRef() throws IOException {
        return null;
    }

    @Override
    public String extractMerchant() throws IOException {
        return null;
    }

    @Override
    public String extractTelephoneNumber() throws IOException {
        return null;
    }

    @Override
    public String extractMobileNumber() throws IOException {
        return null;
    }

    @Override
    public String extractEmail() throws IOException {
        return null;
    }

    @Override
    public String extractCustomer() throws IOException {
        PDDocument pdDoc = PDDocument.load(this.currentFile);
        return stripper.getText(pdDoc);
    }


//    @Override
//    public QuoteDoc createQuoteDocFromPath(String filePath) throws IOException {
//        File file = new File(filePath);
//        System.out.println("Loading PDF from" + filePath);
//        PDDocument pdDoc = PDDocument.load(file);
//
//        return stripper.getText(pdDoc);
//
//        QuoteDoc quoteDoc = new QuoteDoc();
//
//
//
//
//
//
//        return quoteDoc;
//
//    }
//
//    @Override
//    public QuoteDoc addFieldsToQuoteDoc(QuoteDoc quoteDoc) {
//
//
//        //need an extract method for every field of quotedoc
//
//
//
//
//
//    }
}
