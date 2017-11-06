package SRPizza;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/**
 * Created by Adam on 05/11/2017.
 */
public interface IExtractor {

    //initialise any pre-req classes necessary for that file type
    void setup();

    void processFile(File file);

    //need an extract method for every field of quotedoc
    String extractOurRef() throws IOException;

    String extractProjectCode() throws IOException;

    String extractYourRef() throws IOException;

    String extractMerchant() throws IOException;

    String extractTelephoneNumber() throws IOException;

    String extractMobileNumber() throws IOException;

    String extractEmail() throws IOException;

    String extractCustomer() throws IOException;



}
