package config;

public class Config {
    public static final String browser="chrome"; // chrome, firefox
    public static String epgURL="https://192.168.20.45:7045/epg_gui/";
//    public static String epgLoutLoginURL="https://192.168.20.45:7045/epg_gui/#login";
    public static String acsURL="https://192.168.20.45:7111/acsconsole/login.xhtml";
    public static String epgUsername="testingteam1";
    public static String epgPassword="testingteam1";
    public static String acsUsername="testingteam";
    public static String acsPassword="Testingteam_12@!";

//    Fraud management related info
    public static String fMURL="http://192.168.20.45:7014/SVFM/login.xhtml";
    public static String fmAdminDashboardPageURL="http://192.168.20.45:7014/SVFM/pages/blank.xhtml";
    public static String fmLogoutPageUrl="http://192.168.20.45:7014/SVFM/login.xhtml";
    public static String fmCasesQueuePageURL="http://192.168.20.45:7014/SVFM/pages/acm/acmAlertsQueue.xhtml";
    public static String operatorFormPageURL="http://192.168.20.45:7014/SVFM/pages/acm/acmOperatorform.xhtml";
    public static String lastReviewedCasesPageURL="http://192.168.20.45:7014/SVFM/pages/acm/acmLastViewedCases.xhtml";
    public static String operatorGroupPageURL="http://192.168.20.45:7014/SVFM/pages/acm/acmOperatorGroup.xhtml";
    public static String caseManagementSettingsPageURL="http://192.168.20.45:7014/SVFM/pages/acm/investigationSettings.xhtml";

    public static String epgLogoutPageURL="https://192.168.20.45:7045/epg_gui/#login/";

    public static String epgAdminDashboard="https://192.168.20.45:7045/epg_gui/";
    public static String orderPageURL="https://192.168.20.45:7045/epg_gui/#orders";
    public static String refundPageURL="https://192.168.20.45:7045/epg_gui/#refunds";
    public static String auditPageURL="https://192.168.20.45:7045/epg_gui/#useractions";

    public static String acsAdminDashboard="https://192.168.20.45:7111/acsconsole/";

    public static String merchantPageURL="https://192.168.20.45:7045/epg_gui/#merchants";

}
