package config;

public class Config {
    public static final String browser="chrome"; // chrome, firefox
    public static String epgURL="https://192.168.20.45:7045/epg_gui";
    public static String acsURL="https://192.168.20.45:7111/acsconsole/login.xhtml";
    public static String epgUsername="testingteam1";
    public static String epgPassword="testingteam1";
    public static String acsUsername="testingteam";
    public static String acsPassword="Testingteam_12@!";

    public static String epgLogoutPageURL="https://192.168.20.45:7045/epg_gui/#login";

    public static String epgAdminDashboard="https://192.168.20.45:7045/epg_gui/";
    public static String orderPageURL="https://192.168.20.45:7045/epg_gui/#orders";
    public static String refundPageURL="https://192.168.20.45:7045/epg_gui/#refunds";
    public static String auditPageURL="https://192.168.20.45:7045/epg_gui/#useractions";

    public static String acsAdminDashboard="https://192.168.20.45:7111/acsconsole/";

    public static String merchantPageURL="https://192.168.20.45:7045/epg_gui/#merchants";

}
