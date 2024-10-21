package gettingStarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirstPlaywrightTest {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        BrowserType browserType = pw.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
        Page page = browser.newPage();
        page.navigate("https://www.google.com/");
        System.out.println(page.title());
        page.close();
        browser.close();
        pw.close();
    }

}
