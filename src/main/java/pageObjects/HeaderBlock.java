package pageObjects;

import core.MethodFactory;
import org.openqa.selenium.By;

/**
 * Created by Alex Astakhov on 02.07.2016.
 */
public class HeaderBlock extends MethodFactory {
    private By matchesLink = By.xpath("//a[@href='/matches']");
    private By profileLink = By.xpath("//a[@href='/profile']");
    private By profileSettingsLink = By.xpath("//a[@href='/profile/settings']");
    private By premiumLink = By.xpath("//a[@class='show_payment_widget']");
    private By vipStatusLink = By.xpath("//a[contains(Text(),'VIP')]");
    private By languageChoise = By.xpath(".//div[@class='langs']");
    private By englishLanguage = By.xpath("//a[contains(Text(),'English')]");
    private By portugesLanguage = By.xpath("//a[contains(Text(),'Português')]");
    private By spanishLanguage = By.xpath("//a[contains(Text(),'Español')]");
    private By franchLanguage = By.xpath("//a[contains(Text(),'Français')]");
    private By signOut = By.xpath("//a[@href='/sign/out']");

    public void signOut(){
        driver.findElement(signOut).click();
    }
}
