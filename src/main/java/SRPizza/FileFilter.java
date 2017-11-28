package SRPizza;

import org.apache.tika.Tika;

import java.io.File;
import java.io.IOException;

/**
 * Created by Adam on 26/11/2017.
 */
public class FileFilter {
    Tika tika;

    FileFilter(){
        tika = new Tika();
    }

    File decideIfFileIsValid(File file) throws IOException {

        if (tika.detect(file)=="pdf"){
            return file;
        }
        else {
            return null;
        }

    }

}
