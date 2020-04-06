package com.qadays.pagefactory;

public class LoginPageFactory {

    public LoginPage getInstance() {
        String osName = System.getProperty("os.name");
        if (osName.equals("win") || osName.equals("mac")) {
            return new WebLoginPage();
        } else if (osName.equals("ios") || osName.equals("android")) {
            return new MobileLoginPage();
        }

        throw new IllegalStateException("Currnet OS is not supported");
    }
}
