import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

    public static WebDriver gozel;

    public static void main(String[] args) throws InterruptedException {
        String expectedValue="Sizin Içın Buradayız!";
        NameLocator.invokeChromeBrowser();
        gozel.manage().window().maximize();
        gozel.get("http://www.flypgs.com");
        //Thread.sleep("");

        gozel.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();
        Thread.sleep(2000);
        gozel.findElement(By.linkText("BIZE YAZIN")).click();
        Thread.sleep(2000);

        System.out.println("Validation"+isTextTrue(expectedValue));
    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GozelMyrat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        gozel = new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue){
        String resultValue=gozel.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}

