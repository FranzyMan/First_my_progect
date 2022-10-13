package auto_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class auto_test_web_dr {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new GoogleDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://tech.leroymerlin.ru/values/technology/");
        driver.findElement(By.id("<a class=\"logo\" href=\"/\" aria-label=\"Перейти на Главную\">Леруа Мерлен<br><span>Цифровые Технологии</span></a>")).click();
        driver.quit();
    }
}
