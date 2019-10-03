package stepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBasico {
    private WebDriver driver;

    @Given("launch Chrome browser")
    public void launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "D:\\practica cucumber\\Cucumber_PageObject\\chromedriver.exe");
        driver = new ChromeDriver();
        throw new cucumber.api.PendingException();
    }

    @Given("go to http:\\/\\/www.calculoimc.com\\/")
    public void go_to_http_www_calculoimc_com() {
        driver.get("http://www.calculoimc.com/");
        throw new cucumber.api.PendingException();
    }

}
