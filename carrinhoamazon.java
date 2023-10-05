package carrinho;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class carrinhoamazon {
    @Test
    public void testCarrinhoAmazon() {
        /*Apontar driver que usará o Chrome*/
        System.setProperty("webdriver.edge.driver", "C:\\Users\\gustavo.lagogrande\\Drivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        /* DETERMINANDO TEMPO DE ESPERA COMO 15 SEGUDOS*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* LINK A SER ACESSADO*/
        driver.get("https://www.amazon.com.br/");

        /* ACESSAR MAIS VENDIDOS*/
        driver.findElement(By.linkText("Mais Vendidos")).click();

        /* ESCOLHER PRIMEIRO ITEM*/
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li/div[2]/div/a[1]")).click();
        driver.findElement(By.id("add-to-cart-button")).click();

        /* ACESSAR CARRINHO*/
        driver.findElement(By.linkText("Ir para o carrinho")).click();

        /* ALTERAR QUANTIDADE*/
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[1]/span/span[1]/span/span/span/span")).click();
        driver.findElement(By.linkText("2")).click();

        /* RECARREGAR CARRINHO*/
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[3]")).click();


        /* EXCLUIR ITEM*/
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[2]/span/input")).click();
        /*driver.findElement(By.linkText("0 (Excluir)")).click();*/

        /*EVIDENCIAS*/

        public void evidece {
            TakesScreenshot ts;
            ts = (TakesScreenshot) driver.get();
            File src = ts.getScreenshotAs(OutputType.FILE);

        }
    }
}
