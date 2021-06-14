package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class XlsFileTest {

    @Test
    public void xlsTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/test.xls";
        String expectedData = "Rather than reveal the true source of his";

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }

    @Test
    void xlsCellTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/test.xls";
        String expectedData = "Rather than reveal the true source of his";

        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(2).getCell(1).toString();
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    public void xlsxTest() {
        String xlsxFilePath = "./src/test/resources/files/test.xlsx";
        String expectedData = "Rather than reveal the true source of his";

        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
