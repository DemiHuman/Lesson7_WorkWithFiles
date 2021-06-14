package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class TxtFileTest {

    @Test
    void txtFile() throws IOException {
        String txtFilePath = "./src/test/resources/files/test.txt";
        String expectedData = "Rather than reveal the true source of his power";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
