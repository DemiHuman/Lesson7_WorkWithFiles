package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.*;

public class PdfFileTest {

    @Test
    void pdfFile() throws IOException {
        String pdfFilePath = "./src/test/resources/files/test.pdf";
        String expectedData = "Concise UI Tests with Java!";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }
}
