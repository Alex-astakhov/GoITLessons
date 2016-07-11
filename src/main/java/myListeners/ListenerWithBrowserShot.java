package myListeners;


import core.BrowserFactory;
import core.MethodFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alex Astakhov on 12.06.2016.
 */
public class ListenerWithBrowserShot implements ITestListener {
    Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
       // SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH-mm");
       // Date resultdate = new Date(iTestResult.getEndMillis());
       // pngAttachment(iTestResult.getMethod().getMethodName() +  "_failed_" + sdf.format(resultdate));
        MethodFactory.pngAttachment(iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
