import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;


public class Main {




    public static void main(String[] args)
    {

        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriver x = new FirefoxDriver();


        x.get("https://www.kitapyurdu.com/");

        JTextArea textArea=new JTextArea("roman");

    }
}
