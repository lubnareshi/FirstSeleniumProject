package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {


    @Test
    public void testCheckbox() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSportsCheckbox();
        practiceFormPage.clickReadingCheckbox();
        practiceFormPage.clickMusicCheckbox();
        practiceFormPage.unclickReadingCheckbox();

        boolean isReadingCheckboxSelected = practiceFormPage.isReadingSelected();

        Assert.assertFalse(isReadingCheckboxSelected, "\n Reading Checkbox is Selected \n");
    }

}
