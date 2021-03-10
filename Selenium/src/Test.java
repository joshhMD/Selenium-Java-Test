import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
    public static void main(String args[]) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D://Java//Selenium//Drivers//ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();
        Thread.sleep(1000);

        //First Name
        driver.findElement(By.id("firstName")).sendKeys("Josh");
        Thread.sleep(1000);

        //Last Name
        driver.findElement(By.id("lastName")).sendKeys("McD");
        Thread.sleep(1000);

        //Email
        driver.findElement(By.id("userEmail")).sendKeys("TestEmail@gmail.com");
        Thread.sleep(1000);

        //Gender
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
        Thread.sleep(1000);

        //Phone Number
        driver.findElement(By.id("userNumber")).sendKeys("0123456789");
        Thread.sleep(1000);

        //Birth Date
        driver.findElement(By.xpath(".//input[@id='dateOfBirthInput']")).click();
        driver.findElement(By.xpath(".//select[@class='react-datepicker__month-select']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//option[@value='8']")).click();
        driver.findElement(By.xpath(".//select[@class='react-datepicker__year-select']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//option[@value='1997']")).click();
        driver.findElement(By.xpath(".//div[text()='24']")).click();
        Thread.sleep(1000);

        //Subjects
        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Automated Test with Java");
        Thread.sleep(1000);

        //Address
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("112233 Main St");
        Thread.sleep(1000);

        driver.findElement(By.id("submit")).submit();
        Thread.sleep(3000);

        driver.close();
    }
}