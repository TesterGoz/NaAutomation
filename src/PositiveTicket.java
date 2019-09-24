import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTicket {

    public static void main(String[] args) throws InterruptedException{
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gozel@ukr.net");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Turkmenistan");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'mai'")).sendKeys("contains mai");

    }
}

//These are in the browser method:

   // public WebDriver invokeChromeBrowser(){
     //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\GozelMyrat\\Downloads\\chromedriver_win32\\chromedriver.exe");

       // WebDriver gozel = new ChromeDriver();
        //return gozel;
    //}