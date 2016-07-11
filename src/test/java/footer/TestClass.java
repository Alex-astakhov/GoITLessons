package footer;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by Alex Astakhov on 04.07.2016.
 */
@Features("")
@Stories("")
public class TestClass {

    @Step
    public void step1DoingLoginOnMainPage(){
    }
    @Step
    public void step2CheckResult(){
    }
    @Step("Делаем что-то другое : {0}")
    public void step3(String site){
    }

    @Attachment(value = "{1}", type = "text/plain")
    public static String txtAttachment(String text, String name){
        return text;
    }


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @TestCaseId("21")  // в основном не используется
    @Issue("")      // в основном не используется
    @Features({"Login", ""})
    @Stories({"Залогиниться под админом и проверить наличие..."})
    @Description("")
    public void loginUserInAdminka(){
        System.out.println("test1");
        step1DoingLoginOnMainPage();
        step2CheckResult();
        txtAttachment("text", "login");
    }


    @Title("Оплата картой")
    @Test
    @Features({"Payment"})
    @Stories({"Оплатить с помощью кредитной карты"})
    public void payByCreditCard(){
        System.out.println("test2");
        step3("mail.ru");
    }
}
