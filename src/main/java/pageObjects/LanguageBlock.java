package pageObjects;

import core.MethodFactory;
import org.openqa.selenium.By;

/**
 * Created by Alex Astakhov on 02.07.2016.
 */
public class LanguageBlock extends MethodFactory{
    private By englishLanguage = By.xpath("//a[contains(text(),'English')]");
    private By portuguesLanguage = By.xpath("//ul[@class='languages']/li/a[contains(text(),'Português')]");
    private By spanishLanguage = By.xpath("//ul[@class='languages']/li/a[contains(text(),'Español')]");
    private By russianLanguage = By.xpath("//ul[@class='languages']/li/a[contains(text(),'Русский')]");


    public boolean chooseEnglish(){
        driver.findElement(englishLanguage).click();
        return waitForUrlContains("en.kismia", 1);
    }

    public boolean chooseSpanish(){
        driver.findElement(spanishLanguage).click();
        return waitForUrlContains("es.kismia", 1);
    }

    public boolean choosePortugal(){
        driver.findElement(portuguesLanguage).click();
        return waitForUrlContains("pt.kismia", 1);
    }

    public boolean chooseRussian(){
        driver.findElement(russianLanguage).click();
        return waitForUrlContains("//kismia", 1);
    }
}
