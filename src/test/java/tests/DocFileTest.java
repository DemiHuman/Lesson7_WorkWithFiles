package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class DocFileTest {

    @Test
    public void docxTest() throws IOException {
        String docxFilePath = "./src/test/resources/files/test.docx";
        String expectedData = "Rather than reveal the true source of his power";

        assertThat(readDocxFromPath(docxFilePath), containsString(expectedData));
    }

    @Test
    public void docTest() throws IOException {
        String docFilePath = "./src/test/resources/files/test.doc";
        String expectedData = "Rather than reveal the true source of his power";

        assertThat(readDocFromPath(docFilePath), containsString(expectedData));
    }
}
