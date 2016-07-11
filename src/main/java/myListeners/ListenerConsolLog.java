package myListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by Alex Astakhov on 12.06.2016.
 */
public class ListenerConsolLog implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("\n" + iTestResult.getMethod().getMethodName() + " is started...");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(iTestResult.getMethod().getMethodName() + " successfully completed.");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(iTestResult.getMethod().getMethodName() + " FAILED.");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println(iTestResult.getMethod().getMethodName() + " skipped.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("---------------- CONSOLE LOGGING: -----------------");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("----------------------- END OF CONSOLE LOGGING ------------------");
    }
}
