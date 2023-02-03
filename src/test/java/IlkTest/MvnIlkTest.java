package IlkTest;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MvnIlkTest {

    WebDriver driver = new ChromeDriver();
    @Before
    public void junitSayfaAcmaBir () {

        driver.get("https://www.openthesaurus.de/");
        //driver.getWindowHandle();

        Dimension d = new Dimension(300,300);

        driver.manage().window().setSize(d);


        driver.manage().window().maximize();
    }

    @After
    public void sayfayiKapat() {
        driver.close();
   }
    @Test
    public void junitSayfaAcma () throws InterruptedException {

        WebElement searchBox = driver.findElement(By.xpath("//input  [@onkeyup='return doSearchOnKeyUp(event);']"));
        searchBox.sendKeys("untersuchen");
        Thread.sleep(1000);


        WebElement searchBotton = driver.findElement(By.xpath(" //input [@style='border-width:0px']"));
        searchBotton.click();
        Thread.sleep(1000);


        WebElement erweitereSuche = driver.findElement(By.xpath(" //a[@href='/search/index']"));
        erweitereSuche.click();
        Thread.sleep(1000);
        //driver.close();

        WebElement icerenKelime = driver.findElement(By.xpath(" //*[@id='contains']"));
        icerenKelime.click();
        icerenKelime.sendKeys("kommen");
        Thread.sleep(2000);

        WebElement baslayan = driver.findElement(By.xpath(" //*[@id='startsWith']"));
        baslayan.click();
        baslayan.sendKeys("an");
        Thread.sleep(2000);

        WebElement ara_Button= driver.findElement(By.xpath(" //*[@id='powerSearchForm']/div/table/tbody/tr[8]/td[2]/input"));

        Assert.assertTrue(ara_Button.isDisplayed());

        ara_Button.click();

        Thread.sleep(2000);





    }


}
