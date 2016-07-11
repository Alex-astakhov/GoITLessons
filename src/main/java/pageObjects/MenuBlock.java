package pageObjects;

import core.MethodFactory;
import org.openqa.selenium.By;

/**
 * Created by Alex Astakhov on 02.07.2016.
 */
public class MenuBlock extends MethodFactory {
    private By suitable = By.xpath("//a[@href='/profile/suitable']");
    private By suitableCount = By.xpath("//a[@href='/profile/suitable']/../span");
    private By visitors = By.xpath("//a[@href='/profile/visitors']");
    private By visitorsCount = By.xpath("//a[@href='/profile/visitors']/../span");
    private By messages = By.xpath("//a[@href='/messages']");
    private By messagesCount = By.xpath("//a[@href='/messages']/../span");
    private By favd = By.xpath("//a[@href='/profile/favd']");
    private By favdCount = By.xpath("//a[@href='/profile/favd']/../span");
    private By favs = By.xpath("//a[@href='/profile/favs']");
    private By favsCount = By.xpath("//a[@href='/profile/favs']/../span");
    private By matches = By.xpath("//a[@href='/matches/list']");
    private By matchesCount = By.xpath("//a[@href='/matches/list']/../span");
    private By selected = By.xpath("//a[@href='/profile/selected']");
    private By selectedCount = By.xpath("//a[@href='/profile/selected']/../span");
    private By blocked = By.xpath("//a[@href='/profile/delete']");
    private By blockedCount = By.xpath("//a[@href='/profile/delete']/../span");

}
