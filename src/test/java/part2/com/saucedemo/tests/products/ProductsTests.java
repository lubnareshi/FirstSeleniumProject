package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTests extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage;
        productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");

        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(),
                "\n Products Header Is Not Displayed \n");

    }
}
