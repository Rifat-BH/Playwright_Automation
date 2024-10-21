package gettingStarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class LoginLogout {
    public static void main(String[] args) {
        Browser browser= Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        try {
           page.navigate("https://freelance-learn-automation.vercel.app/login");
            String title = page.title();
            PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
            page.locator("#email1").fill("admin@email.com");
            page.locator("#password1").fill("111");
            page.waitForTimeout(3000);

        }finally {
            page.close();
            browser.close();
        }

    }
}
