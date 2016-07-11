package profile;

import core.BrowserFactory;
import myListeners.ListenerWithBrowserShot;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.IndexPage;
import pageObjects.ProfilePage;

import java.util.LinkedList;

/**
 * Created by Alex Astakhov on 03.07.2016.
 */
@Listeners({ListenerWithBrowserShot.class})
public class ChangeProfileInfo extends BrowserFactory {
    ProfilePage profile = new ProfilePage();

    @Parameters({"email", "passwd"})
    @BeforeClass
    public void login(@Optional("bevov@divismail.ru") String email, @Optional("ahtung") String passwd){
        IndexPage indexPage = new IndexPage();
        indexPage.login(email, passwd);    //("bevov@divismail.ru", "ahtung");
        profile.openPage();
    }

    @DataProvider(name = "educations")
    public static Object[][] educations(){
        return new Object[][]{
                {"0"},
                {"1"},
                {"2"},
                {"3"},
                {"4"},
        };
    }

    @DataProvider(name = "educations1")
    public static Object[][] educations1(){
        return new Object[][]{
                {"0"},
                {"1"},
                {"2"},
                {"3"},
                {"4"},
        };
    }


    @Test(dataProvider = "educations1")
    public void changeEducation(String variant){

            profile.clickEditUserInfo();
            profile.setEducation(variant);
            profile.clickUserInfoSave();
            refresh();
            Assert.assertEquals(profile.getEducation(), variant);
    }
}
