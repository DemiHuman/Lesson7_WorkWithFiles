package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.*;

public class ZipFileTest {

    @Test
    public void ZipTest() throws IOException {
        String zipFilePath = "./src/test/resources/files/test.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String txtFilePath = "./src/test/resources/files/unzip/test.txt";
        String password = "";
        String expectedData = "Rather than reveal the true source of his power";

        unzip(zipFilePath, unzipFolderPath, password);

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
