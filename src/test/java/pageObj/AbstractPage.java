package pageObj;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
    public static String parentWindow;
    public static WebDriver driver;
    public static boolean folderCreated=false;
    public static boolean userLoginStatus=false;
    public static EPGLoginPage epgLoginPage;
    public static ACSLoginPage acsLoginPage;
    public static EPGAdminDashboardPage epgAdminDashboardPage;
    public static ACSAdminDashboardPage acsAdminDashboardPage;

    public static void setDriver(WebDriver driverObj){
        driver=driverObj;
    }
    public static void setParentWindow(String windowID){
        parentWindow=windowID;
    }
    public static String getParentWindow(){
        return parentWindow;
    }
}