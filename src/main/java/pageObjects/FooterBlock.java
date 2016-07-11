package pageObjects;

import core.MethodFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 21.05.2016.
 */
public class FooterBlock extends MethodFactory {
    private By aboutProject = By.xpath("//a[contains(@href,'/info/about')]");
    private By support = By.xpath("//a[contains(@href,'/support')]");
    private By tips = By.xpath("//a[contains(@href,'/info/tips')]");
    private By happyStories = By.xpath("//a[contains(@href,'/info/stories')]");
    private By contacts = By.xpath("//a[contains(@href,'/info/contacts')]");
    private By privacyPolicy = By.xpath("//a[contains(@href,'/info/privacy')]");
    private By partnershipProgram = By.xpath("//a[contains(@href,'/info/partners')]");

    @Step
    public boolean clickAboutProject(){
        driver.findElement(aboutProject).click();
        return waitForUrlContains("1about", 1);
    }

    @Step
    public boolean clickSupport(){
        driver.findElement(support).click();
        return waitForUrlContains("support", 1);
    }

    @Step
    public boolean clickTips(){
        driver.findElement(tips).click();
        return waitForUrlContains("tips", 1);
    }

    @Step
    public boolean clickHappyStories(){
        driver.findElement(happyStories).click();
        return waitForUrlContains("stories", 1);
    }

    @Step
    public boolean clickContacts(){
        driver.findElement(contacts).click();
        return waitForUrlContains("contacts", 1);
    }

    @Step
    public boolean clickPrivacyPolicy(){
        driver.findElement(privacyPolicy).click();
        return waitForUrlContains("privacy", 1);
    }

    @Step
    public boolean clickPartnershipProgram(){
        driver.findElement(partnershipProgram).click();
        return waitForUrlContains("partners", 1);
    }

}
