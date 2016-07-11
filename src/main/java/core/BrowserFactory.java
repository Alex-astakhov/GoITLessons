package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 18.05.2016.
 */
public class BrowserFactory extends MethodFactory{


    @BeforeTest
    public void setupChrome() {                              // установки браузера
        driver = new ChromeDriver();                    // для Фаерфокс
        driver.manage().window().maximize();            // максимизация окна
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //время ожидания загрузки ннужного элемента
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // время ожидания загрузки страницы
    }

    @AfterTest
    public void tearDown() {  // закрытие браузера
        driver.close();  // закрываем окно браузера
        driver.quit();   // закрываем процесс
    }
}
