package profileSettings;

import core.BrowserFactory;
import myListeners.ListenerWithBrowserShot;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.HeaderBlock;
import pageObjects.IndexPage;
import pageObjects.ProfileSettingsPage;
import ru.yandex.qatools.allure.annotations.Features;

/**
 * Created by Alex Astakhov on 02.07.2016.
 */
@Listeners({ListenerWithBrowserShot.class})
@Features({"Editing profile settings"})
public class ChangeProfileSettings extends BrowserFactory {
    ProfileSettingsPage ps = new ProfileSettingsPage();

    /*@BeforeMethod
    public void login(@Optional("bevov@divismail.ru") String email, @Optional("ahtung")  String password){
        IndexPage indexPage = new IndexPage();
        indexPage.login(email, password);
        ps.openPage();
    }*/

    @Parameters({"email", "passwd"})
    @BeforeClass
    public void login(@Optional("bevov@divismail.ru") String email, @Optional("ahtung") String passwd){
        IndexPage indexPage = new IndexPage();
        indexPage.login(email, passwd);    //("bevov@divismail.ru", "ahtung");
        ps.openPage();
    }



    @Test(priority = 2)
    public void changeGenderToMale(){
        ps.chooseMaleGender();
        boolean result = attributeIsPresent(By.xpath(ps.GENDER_MALE_XPATH), "selected");
        Assert.assertTrue(result);
    }

    @Test(priority = 1)
    public void changeGenderToFemale(){
        ps.chooseFemaleGender();
        boolean result = attributeIsPresent(By.xpath(ps.GENDER_FEMALE_XPATH), "selected");
        Assert.assertTrue(result);
    }

    @Parameters({"year", "month", "day"})
    @Test
    public void changeBirthDate(@Optional("1995") String year, @Optional("01") String month, @Optional("01") String day){
        ps.setDateOfBirth(year, month, day);
        ps.pressSave();
        Assert.assertEquals(ps.getDateOfBirth(), year + "-" + month + "-" + day);
    }

}
