package pom;

import org.openqa.selenium.WebDriver;

public class pojo {
    public static WebDriver driver;
    public static String browser;
    public static String url;
    public String firstname;
    public String lastname;
    public String email;
    public String password;
    public String confirmpassword;
    public String birthmon;
    public String birthyear;
    public String zipcode;


    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getBrowser() {
        return browser;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


    public void setBrowser(String browser) {
        this.browser = browser;
    }


    public String setFirstname(String firstname) {
        return this.firstname = firstname;
    }


    public String setLastname(String lastname) {
        return this.lastname = lastname;
    }


    public String setEmail(String email) {
        return this.email = email;
    }


    public String setPassword(String password) {
        return this.password = password;
    }


    public String setConfirmpassword(String confirmpassword) {
        return this.confirmpassword = confirmpassword;
    }


    public String setBirthmon(String birthmon) {
        return this.birthmon = birthmon;
    }


    public String setBirthyear(String birthyear) {
        return this.birthyear = birthyear;
    }


    public String setZipcode(String zipcode) {
        return this.zipcode = zipcode;
    }


}