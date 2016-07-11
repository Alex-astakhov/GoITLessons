package pageObjects;

import core.MethodFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 02.07.2016.
 */
// kismia.com/profile
public class ProfilePage extends MethodFactory {
    private By nameLabel = By.xpath("//div[@class='inform-col']/h1");
    private By statusTextField = By.xpath("//div[@class='status-box edit hidden']//textarea");
    private By saveStatusButton = By.id("saveStatus");
    public By userInfoEditButton = By.id("user_info_edit");
    private By userInfoSaveButton = By.id("user_info_save");
    private By userPhoto = By.xpath("//div[@class='vip-wrapper']//img");
    private By addPhotoButton = By.xpath("//div[@class='add_photo_block']/a[2]");
    private By userInfoForm = By.id("user_info");
    private By showExtInfoLink = By.id("showExtInfo");
    private By selectEducation = By.name("education");
    private By selectPosition = By.name("position");
    private By selectFieldOfActivity = By.name("field_of_activity");
    private By selectIncome = By.name("income");
    private By selectMaritalStatus = By.name("marital_status");
    private By selectChildren = By.name("children");
    private By selectReligion = By.name("religion");
    private By heightTextField = By.name("height");
    private By weightTextField = By.name("weight");
    private By selectBodyType = By.name("bodytype");
    private By selectHealth = By.name("health");
    private By selectLook = By.name("look");
    private By selectSmoking = By.name("smoking");
    private By selectDrugs = By.name("drugs");
    private By selectAlcohol = By.name("alcohol");

    @Step("Open profile page")
    public void openPage(){
        driver.get("https://kismia.com/profile/");
    }

    @Step("Click EDIT USER INFO")
    public void clickEditUserInfo(){
        driver.findElement(userInfoEditButton).click();
    }

    @Step
    public void setNewStatus(String statusText){
        type(statusTextField, statusText);
        driver.findElement(saveStatusButton).click();
    }

    @Step
    public void clickUserInfoSave(){
        driver.findElement(userInfoSaveButton).click();
    }

    @Step
    public void setEducation(String var){
            waitUntilElementIsVisible(selectEducation, 3);
            chooseFromDropList(selectEducation, var);
    }

    @Step("Read current education")
    public String getEducation(){
        return getFieldsAttribute(By.xpath("//*[@name='education']/option[@selected]"), "value");
    }


}
