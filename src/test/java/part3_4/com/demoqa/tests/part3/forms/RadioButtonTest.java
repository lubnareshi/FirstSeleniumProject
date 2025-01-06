package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {


    @Test
    public void testRadioButton() {

        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = practiceFormPage.isFemaleSelected();

        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female Radio Button is Not Selected \n");


    }

}
