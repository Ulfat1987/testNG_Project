package techproed.tests.smoketest.logintests;

import org.testng.annotations.Test;
import techproed.page.HomePage;
import techproed.page.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;
public class Day18_PositiveLoginTest {

    /*
Given
    https://www.bluerentalcars.com/
When
    Click on login button
And
    Type john@doe.com into email input
And
    Type John.123 into password input
And
    Click on login submit button
Then
    Verify user logged in
 */
    HomePage homePage;
    LoginPage loginPage;
    @Test
    public void US100201_Admin_Login(){
//going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click on home page login link
        homePage = new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);
        loginPage.userName.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("12345");
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);
//        Verify login is successful
        //ReusableMethods.verifyElementDisplayed(homePage.userID);
        ReusableMethods.verifyElementNotDisplayed(homePage.homePageLoginLink);
    }
}