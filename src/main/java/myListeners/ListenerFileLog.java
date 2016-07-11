package myListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.reporters.Files;

import java.io.File;
import java.io.IOException;

/**
 * Created by Alex Astakhov on 12.06.2016.
 */
public class ListenerFileLog implements ITestListener {
    File f = new File(System.getProperty("user.dir") + "\\testLog.txt");

    @Override
    public void onTestStart(ITestResult iTestResult) {
        try {
            updateFileLn(f, iTestResult.getMethod().getMethodName() + " is started...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        try {
            updateFileLn(f, iTestResult.getMethod().getMethodName() + " successfully completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        try {
            updateFileLn(f, iTestResult.getMethod().getMethodName() + " FAILED.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        try {
            updateFileLn(f, iTestResult.getMethod().getMethodName() + " skipped.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        try {
            updateFileLn(f, "END");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateFileLn(File f, String s) throws IOException {
        String current = Files.readFile(f);
        Files.writeFile(current + s, f);
    }
}
