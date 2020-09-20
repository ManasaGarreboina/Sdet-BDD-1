package reusableMethods;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.qameta.allure.Step;
import pom.pojo;

import java.util.concurrent.TimeUnit;
public class SetDataForWebsite {
	pojo object = new pojo();
    public WebDriver driver = object.getDriver();

    public String firstName, lastName, Email, Password, Confirmpassword, Birthmonth, Birthyear, Zipcode, BROWSER;

    @Step("Redirecting to url {0}....")
    public void getUrl(String url) {

        object.setUrl(url);
        driver.get(object.getUrl());

    }
    @Step("Connected to Browser {0}....")
    public void getDriver(String brow, Logger log) {
        object.setBrowser(brow);
        BROWSER = object.getBrowser();


        if (BROWSER.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            object.setDriver(driver);
            driver = object.getDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            log.info("Chrome driver got loaded");

        } else if (BROWSER.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C://Users//MA20089955//Downloads//FirefoxDriver//geckodriver.exe");
            driver = new FirefoxDriver();
            object.setDriver(driver);
            driver = object.getDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            log.info("Firefox driver got loaded");
        }

    }
    @Step("Clicked on Registration....")
    public void clickOnRegistration(Logger log) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        if (object.getUrl().matches("https://www.gillette.de/")) {
            driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/div[2]/div/div[1]/a/span")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/form/button")).click();

        } else if (object.getUrl().matches("https://www.gillette.fr")) {
            driver.findElement(By.xpath("//*[@id=\"user_link\"]/li[1]/a")).click();


        } else if (object.getUrl().matches("https://www.gillette.co.in/en-in")) {

            driver.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[2]")).click();
        }
        log.info("Clicked on registration");
    }
    @Step("Entering Registration Details....")
    public void registrationDetails(String firstname, String lastname, String email, String password, String confirmpassword, String birthmonth, String birthyear, String zipcode, Logger log) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        firstName = object.setFirstname(firstname);
        lastName = object.setLastname(lastname);
        Email = object.setEmail(email);
        String ConfirmEmail = Email;
        Password = object.setPassword(password);
        Confirmpassword = object.setConfirmpassword(confirmpassword);
        Birthmonth = object.setBirthmon(birthmonth);
        Birthyear = object.setBirthyear(birthyear);
        Zipcode = object.setZipcode(zipcode);
        if (object.getUrl().matches("https://www.gillette.de/")) {

            driver.findElement(By.xpath("//*[@id=\"customerName\"]")).sendKeys(firstName);
            driver.findElement(By.xpath("//*[@id=\"customerEmail\"]")).sendKeys(Email);
            driver.findElement(By.xpath("//*[@id=\"confirmCustomerEmail\"]")).sendKeys(ConfirmEmail);
            driver.findElement(By.xpath("//*[@id=\"customerPassword\"]")).sendKeys(Password);
            driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys(Confirmpassword);
            driver.findElement(By.xpath("//*[@class=\"accountSignUp_optOutLabel_RadioButtons\"]/input")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement e = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
            e.click();

        } else if (object.getUrl().matches("https://www.gillette.fr")) {

            driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys(Email);
            driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys(firstName);
            driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys(lastName);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Email);
            driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(Password);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/font/font")).click();


        } else if (object.getUrl().matches("https://www.gillette.co.in/en-in")) {


            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[firstname]\"]")).sendKeys(firstName);
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[lastname]\"]")).sendKeys(lastName);
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[emails][0][address]\"]")).sendKeys(Email);
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][password]\"]")).sendKeys(Password);
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][confirm]\"]")).sendKeys(Confirmpassword);
            Select m = new Select(driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][month]\"]")));
            m.selectByVisibleText("" + Integer.parseInt(Birthmonth));
            Select y = new Select(driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][year]\"]")));
            Birthyear = Birthyear.substring(0, 4);
            y.selectByVisibleText(Birthyear);
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[addresses][0][postalarea]\"]")).sendKeys(Zipcode);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_submit\"]")).click();
        }
        log.info("Details entered for registration");
        driver.close();
    }

    @Step("Clicked on Login....")
    public void clickOnlogin(Logger log) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        if (object.getUrl().matches("https://www.gillette.de/")) {

            driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/div[2]/div/div[1]/a/span")).click();


        } else if (object.getUrl().matches("https://www.gillette.fr")) {
            driver.findElement(By.xpath("//*[@id=\"user_link\"]/li[1]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"viewLoginForm\"]/a/strong/font/font")).click();

        } else if (object.getUrl().matches("https://www.gillette.co.in/en-in")) {
            driver.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[1]")).click();
        }
        log.info("clicked on Sign In page");
    }
    @Step("Loging In with details {0} and {1}....")
    public void loginWithDetails(String email, String password, Logger log) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        if (object.getUrl().matches("https://www.gillette.de/")) {

            driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();

        } else if (object.getUrl().matches("https://www.gillette.fr")) {
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(password);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

        } else if (object.getUrl().matches("https://www.gillette.co.in/en-in")) {
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_username\"]")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Container\"]/div[2]/input")).sendKeys(password);
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Sign In\"]")).click();

        }
        log.info("Entered details for  login");
        driver.close();

    }
    @Step("Clicked on Forgot Password....")
    public void forgotPassword(Logger log) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        if (object.getUrl().matches("https://www.gillette.de/")) {
            driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/div[2]/div/div[1]/a/span")).click();
            driver.findElement(By.xpath("//*[@class=\"forgottenPasswordModal_trigger\"]")).click();


        } else if (object.getUrl().matches("https://www.gillette.fr")) {
            driver.findElement(By.xpath("//*[@id=\"user_link\"]/li[1]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"viewLoginForm\"]/a/strong/font/font")).click();
            driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/p[1]/a/font/font")).click();


        } else if (object.getUrl().matches("https://www.gillette.co.in/en-in")) {
            driver.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_forgotpassword\"]")).click();
        }
        log.info("ForgotPassword validation");

    }
    @Step("Reseting Password with details {0} ....")
    public void resetPassword(String email, Logger log) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Email = object.setEmail(email);
        if (object.getUrl().matches("https://www.gillette.de/")) {
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"forgotten-password-email-field\"]")).sendKeys(Email);

        } else if (object.getUrl().matches("https://www.gillette.fr")) {
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Email);
        } else if (object.getUrl().matches("https://www.gillette.co.in/en-in")) {
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_username\"]")).sendKeys(Email);
        }
        log.info("Password Reset validation email entered");
    }
    @Step("Clicked on Reset....")
    public void reset(Logger log) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        if (object.getUrl().matches("https://www.gillette.de/")) {
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@class=\"forgottenPasswordModal_dialog_form_submit\"]")).click();
        } else if (object.getUrl().matches("https://www.gillette.fr")) {
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/p[2]/button")).click();

        } else if (object.getUrl().matches("https://www.gillette.co.in/en-in")) {
            driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Create Your New Password\"]")).click();

        }
        log.info("Password Reset validation done");
        driver.close();
        driver.quit();
    }

}
