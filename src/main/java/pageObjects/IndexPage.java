package pageObjects;

import core.MethodFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 21.05.2016.
 */

// kismia.com

public class IndexPage extends MethodFactory {

    private By login = By.id("user-email");
    private By passwd = By.id("user-password");
    private By Submit = By.cssSelector(".submit"); //By.xpath("/*//*[@id='sign-in-form']/button");
    private By androidIcon = By.xpath("//img[@class='abase-android-link__img']");
    private By downloadForAndroid = By.xpath("//span[@class='android-link__text']");
    private By iosIcon = By.xpath("//img[@class='abase-ios-link__img']");
    private By downloadForIOS = By.xpath("//span[@class='ios-link__text']");
    private By loginForm = By.id("form-log-in");
    private By registrationForm = By.id("sign-in-form");
    private By enterByMailru = By.xpath("//a[@class='mailru in_popup']");
    private By enterByVk = By.xpath("//a[@class='vk in_popup']");
    private By enterByFb = By.xpath("//a[@class='facebook in_popup']");
    private By enterByOdnoklasniki = By.xpath("//a[@class='odnoklassniki in_popup']");
    private By rotateGallery = By.id("rotate_gallery");
    private By rotateLeft = By.id("to_left");
    private By rotateRight = By.id("to_right");
    private By iamBoy = By.id("iam-boy");
    private By iamGirl = By.id("iam-girl");
    private By findBoy = By.id("find-boy");
    private By findGirl = By.id("find-girl");
    private By userRegName = By.id("user-reg-myname");




  @Step("Login procedure with email: {0} and password: {1}")
  public boolean login(String email, String password){
        openPage();
        type(login, email);
        type(passwd, password);
        clickSubmit();
        return waitForUrlContains("kismia.com/u", 1);
    }

    public boolean waitForUrlContains(String text, int sec){
        for(int i = 0; i<=sec*10; i++){
            if(driver.getCurrentUrl().contains(text)) {
                return true;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Step("Open index page")
    public void openPage(){
        driver.get("https://kismia.com");
    }

    @Step("Click SUBMIT button")
    public void clickSubmit(){
        driver.findElement(Submit).click();
    }
}
