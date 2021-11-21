package utils;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.driver.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class Utilities extends Driver {

    public Utilities() {
        PageFactory.initElements(driver, this);
    }

    public void click(WebElement element) {
        waitUntilClickable(scroll(element), System.currentTimeMillis()).click();
    }

    public void fillInput(WebElement inputBox,String inputText) {
        clear(scroll(waitUntilVisible(inputBox, System.currentTimeMillis()))).sendKeys(inputText);
    }

    public WebElement clear(WebElement inputBox) {
        inputBox.clear();
        for (int i = 0; i < inputBox.getAttribute("value").length(); i++) {
            inputBox.sendKeys(Keys.BACK_SPACE);
        }
        return inputBox;
    }

    public WebElement scroll(WebElement element) {
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);
        pause(0.5);
        return element;
    }

    public void pause(double duration) {
        try {
            Thread.sleep((long) (duration * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement waitUntilVisible(WebElement element, long initialTime) {
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        if (System.currentTimeMillis() - initialTime > 15000) {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return null;
        }
        try {
            if (!element.isDisplayed()) {
                waitUntilVisible(element, initialTime);
            }
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException exception) {
            waitUntilVisible(element, initialTime);
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return element;
    }

    public WebElement waitUntilClickable(WebElement element, long initialTime) {
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        if (System.currentTimeMillis() - initialTime > 15000) {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return null;
        }
        try {
            if (!element.isEnabled()) {
                waitUntilClickable(element, initialTime);
            }
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException exception) {
            waitUntilClickable(element, initialTime);
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return element;
    }

    public void existError(WebElement element, String failText) {
        try {
            if (element.isDisplayed()) {
                System.out.println("ERROR (" + element.getText() + ")");
                return;
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println(failText);
            return;
        }
        Assert.fail(failText);
    }

    public void verifyText(WebElement element, String failText) {
        try {
            if (element.isDisplayed()) {
                System.out.println("'" + element.getText() + "' text available on this page");
                if (element.equals("Account")){
                    System.out.println(failText);
                }
                return;
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println(failText);
            return;
        }
        Assert.fail(failText);
    }

    public void existText(String text) {
        try {
            String locator = "//*[contains(text(), '" + text + "')]";
            if (driver.findElement(By.xpath(locator)).isDisplayed()) {
                System.out.println("This page '" + text + "' text is available");
                return;
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("ERROR (This page '" + text + "' text is none)");
            return;
        }
    }

    public void checkURL(String url) {
        String getURL = driver.getCurrentUrl();
        if (Objects.equals(url, getURL)) {
            System.out.println("Correct address reached (" + url + ")");
        } else {
            System.out.println("ERROR (Correct address not found)");
        }
    }

    public void textLoopClick(List<WebElement> list, String buttonName) {
        for (WebElement item : list) {
            if (item.getText().contains(buttonName)) {
                click(item);
                return;
            }
        }
        Assert.fail("No such element was found...");
    }

    public void loopAndVerify(List<WebElement> list) {
        System.out.println("There are "+list.size()+" products in this list");
        for (WebElement item : list) {
            try {
                System.out.println("This page contains text " + item.getText());
            } catch (NoSuchElementException noSuchElementException) {
                System.out.println("Element not found");
            }
        }
    }

    public void rankLoopClick(List<WebElement> list,int rank) {
        int i = 0;
        for (WebElement item : list) {
            int x = i + 1;
            i++;
            if (Objects.equals(x, rank)){
                click(item);
            }
        }
    }

    public void verifyTextVisibiltyOf(String text) {
        String locator = "//*[contains(text(), '" + text + "')]";
        try {
            ExpectedConditions.visibilityOfElementLocated(By.xpath(locator));
            System.out.println("This text verify SUCCESFULL '" + driver.getTitle() + "'");
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("This text verify FAIL");
        }

    }

    public void pressButtonWithText(String buttonText) {
        String locator = "//*[contains(text(), '" + buttonText + "')]";
        click(driver.findElement(By.xpath(locator)));
    }


    public void fillInputVisi(WebElement inputBox,String inputText) {
        clear(scroll(waitUntilVisible(inputBox, System.currentTimeMillis()))).sendKeys(inputText);
    }

    public void windowMaximize() {
        driver.manage().window().maximize();
    }

    public void refreshPage() {
        String url = driver.getCurrentUrl();
        driver.get(url);
    }

    public String switchWindowHandle(String handle) {
        String parentWindowHandle = driver.getWindowHandle();
        if (handle == null)
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equalsIgnoreCase(parentWindowHandle))
                    driver = (RemoteWebDriver) driver.switchTo().window((windowHandle));
                System.out.println(windowHandle);
            }
        else
            driver = (RemoteWebDriver) driver.switchTo().window(handle);
        return parentWindowHandle;
    }

    public void closeWindow(String parentWindowHandle) {
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equalsIgnoreCase(parentWindowHandle))
                driver.close();
            driver.switchTo().window(parentWindowHandle);
        }
    }
    public void newTab(){
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}