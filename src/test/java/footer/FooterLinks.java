package footer;

import core.BrowserFactory;
import myListeners.ListenerWithBrowserShot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import pageObjects.FooterBlock;
import pageObjects.IndexPage;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by Alex Astakhov on 21.05.2016.
 */
@Listeners({ListenerWithBrowserShot.class})
@Features({"Footer links"})
@Stories({"Possibility to move ot pages from the footer"})
public class FooterLinks extends BrowserFactory {
    private FooterBlock fb = new FooterBlock();



    @BeforeClass
    public void start(){
        IndexPage indexPage = new IndexPage();
        indexPage.openPage();
    }

    @Test
    public void testAboutProject(){
        assertEquals(true, fb.clickAboutProject());
    }

    @Test
    public void testSupport(){

        assertEquals(true, fb.clickSupport());
    }

    @Test
    public void testTips(){
        ;
        assertEquals(true, fb.clickTips());
    }

    @Test
    public void testStories(){

        assertEquals(true, fb.clickHappyStories());
    }

    @Test
    public void testContacts(){
        assertEquals(true, fb.clickContacts());
    }

    @Test
    public void testPrivacy(){

        assertEquals(true, fb.clickPrivacyPolicy());
    }

    @Test
    public void testPartnershipProg(){

        assertEquals(true, fb.clickPartnershipProgram());
    }
}
