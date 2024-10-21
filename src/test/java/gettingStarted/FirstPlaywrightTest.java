package gettingStarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirstPlaywrightTest {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        BrowserType browserType = pw.chromium();
        Browser browser = browserType.launch();
        Page page = browser.newPage();
        page.navigate("https://playwright.dev/java/docs/intro");
        System.out.println(page.title());
    }

}
