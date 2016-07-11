package pageObjects;

import core.MethodFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 02.07.2016.
 */

//  kismia.com/profile/settings

public class ProfileSettingsPage extends MethodFactory {

    private By generalSettings = By.xpath("//a[@href='/profile/settings']");
    private By notifications = By.xpath("//a[@href='/profile/settings/notifications']");
    private By premium = By.xpath("//a[@href='/profile/settings/premium']");
    private By deleteProfile = By.xpath("//a[@href='/profile/settings/delete']");
    private By nameField = By.id("settingsName");
    private By dateOfBirthField = By.id("settingsBDate");
    private By setPasswordField = By.id("settingsPassword");
    private By passwordConfirmField = By.id("settingsPassword2");
    private By genderField = By.id("settingsGender");
    public final String GENDER_MALE_XPATH = "//*[@id='settingsGender']/option[@value='m']";
    public final String GENDER_FEMALE_XPATH = "//*[@id='settingsGender']/option[@value='f']";
    private By searchGenderField = By.id("settingsSearchGender");
    private By searchAgeFromField = By.id("settingsSearchAgeFrom");
    private By getSearchAgeToField = By.id("settingsSearchAgeTo");
    private By PhoneCountryField = By.xpath("//*[@class='flag-container']");
    private By phoneNumberField = By.id("change-phone");
    private By saveButton = By.xpath("//button[@class='btn btn_medium']");
    private By changeCityButton = By.xpath("//button[@class='btn btn_medium change_city']");

    @Step
    public void openPage(){
        driver.get("https://kismia.com/profile/settings/");
    }

    @Step
    public void pressSave(){
        driver.findElement(saveButton).click();
    }

    @Step
    public void chooseMaleGender(){
        driver.findElement(genderField).click();
        driver.findElement(By.xpath("//*[@id='settingsGender']/option[@value='m']")).click();
    }

    @Step
    public void chooseFemaleGender(){
        driver.findElement(genderField).click();
        driver.findElement(By.xpath("//*[@id='settingsGender']/option[@value='f']")).click();
    }

    @Step
    public void setDateOfBirth(String year, String month, String day){
        type(dateOfBirthField, year + "-" + month + "-" + day);
    }

    @Step("Read current date od birth")
    public String getDateOfBirth(){
        return driver.findElement(dateOfBirthField).getAttribute("value");
    }


}
