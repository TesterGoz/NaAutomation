import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    static WebDriver gozel;

    public static void main(String[] args) throws InterruptedException {
        invokeChromeBrowser();
        gozel.get("https://www.turkishairlines.com/");
        Thread.sleep(3000);
    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GozelMyrat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        gozel = new ChromeDriver();
    }
}
