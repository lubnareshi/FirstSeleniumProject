package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class DropDownTest extends BaseTest {

    @Test
    public void testDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();

        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti("Saab");
        selectMenuPage.selectStandardMulti(2);
//        selectMenuPage.selectStandardMulti(3);
        selectMenuPage.deselectStandardMulti("saab");

        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();

        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
    }
}
