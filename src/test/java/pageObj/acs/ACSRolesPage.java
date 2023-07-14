package pageObj.acs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACSRolesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(xpath = "//span/a[.='Roles']")
    private WebElement rolesMenu;
    @FindBy(xpath = "//button/span[.='Add']")
    private WebElement addButton;
    @FindBy(xpath = "//input[@id='addRoleForm:operatorNameInput']")
    private WebElement name;

    // roles
    @FindBy(xpath = "//ul/li[@data-item-value='SUPER_USER']")
    private WebElement superUserPermission;
    @FindBy(xpath = "//ul/li[@data-item-value='ACCESS_TO_ALL_PROFILES']")
    private WebElement allProfilesPermission;
    @FindBy(xpath = "//ul/li[@data-item-value='OTHER_PROFILES_USERS_MANAGEMENT']")
    private WebElement otherProfilesUsersManagement;

    @FindBy(xpath = "//button/span[@class='ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e']")
    private WebElement addSinglePermissionIcon;

    @FindBy(xpath = "//button/span[.='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//span/a[@aria-label='Page 3']")
    private WebElement thirdPage;

    @FindBy(xpath = "//button/span[.='Delete']")
    private WebElement deleteButton;
    @FindBy(xpath = "//button/span[.='Yes']")
    private WebElement confirmDeletion;



    public ACSRolesPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    public void clickOnRolesMenu() {
        this.rolesMenu.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnAddButton() {
        this.addButton.click();
    }

    public void setName(String name) {
        this.name.clear();
        this.name.sendKeys(name);
    }

    public void addPermissionsToARole() {
        this.superUserPermission.click();
        this.addSinglePermissionIcon.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.allProfilesPermission.click();
        this.addSinglePermissionIcon.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.otherProfilesUsersManagement.click();
        this.addSinglePermissionIcon.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnSaveButton() {
        this.saveButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean searchForAddedRole(String role) {
        this.thirdPage.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String roleName = "//tbody[@id='rolesForm:operatorsTable_data']//tr[";
        String roleNumbers = "//tbody[@id='rolesForm:operatorsTable_data']//tr";

        int numRoles = driver.findElements(By.xpath(roleNumbers)).size();
        int i;
        for(i = 1; i <= numRoles; i++) {
            String rolee = driver.findElement(By.xpath(roleName + "" + i + "]/td[2]")).getText();
            if(rolee.equalsIgnoreCase(role)) {
                System.out.println("index is " + i);
                break;
            }
        }

        if(i < 11) {
            System.out.println(role + " is found at " + i + "th position");
            return true;
        } else {
            return false;
        }
    }

    public boolean searchForARole(String role) {
        String pagination = "//span[@class='ui-paginator-pages']/a";
        int numPagination = driver.findElements(By.xpath(pagination)).size();
        boolean found = false;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i, j;
        for (i = 1; i <= numPagination; i++) {
            driver.findElement(By.xpath(pagination + "[" + i + "]")).click();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String roleName = "//tbody[@id='rolesForm:operatorsTable_data']//tr[";
            String roleNumbers = "//tbody[@id='rolesForm:operatorsTable_data']//tr";
            int numRoles = driver.findElements(By.xpath(roleNumbers)).size();

            j = 1;
            for(j = 1; j <= numRoles; j++) {
                String rolee = driver.findElement(By.xpath(roleName + "" + j + "]/td[2]")).getText();
                if(rolee.equalsIgnoreCase(role)) {
                    found = true;
                    break;
                }
            }
            if(found) {
                System.out.println("Role " + role + " is found at the " + j + "th position" + " of the " + i + "th pagination");
                break;
            }
        }
        if(!found) {
            System.out.println("Role " + role + " is not found!");
        }
        return found;
    }

    public void searchAndDeleteRole(String role) {
        String pagination = "//span[@class='ui-paginator-pages']/a";
        int numPagination = driver.findElements(By.xpath(pagination)).size();
        boolean found = false;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i, j;
        for (i = 1; i <= numPagination; i++) {
            driver.findElement(By.xpath(pagination + "[" + i + "]")).click();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String roleName = "//tbody[@id='rolesForm:operatorsTable_data']//tr[";
            String roleNumbers = "//tbody[@id='rolesForm:operatorsTable_data']//tr";
            int numRoles = driver.findElements(By.xpath(roleNumbers)).size();

            j = 1;
            for(j = 1; j <= numRoles; j++) {
                String rolee = driver.findElement(By.xpath(roleName + "" + j + "]/td[2]")).getText();
                if(rolee.equalsIgnoreCase(role)) {
                    found = true;
                    driver.findElement(By.xpath(roleNumbers + "[" + j + "]")).click();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.deleteButton.click();
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.confirmDeletion.click();
                    break;
                }
            }
            if(found) {
                System.out.println("Role " + role + " is found at the " + j + "th position" + " of the " + i + "th pagination and deleted");
                break;
            }
        }
        if(!found) {
            System.out.println("Role " + role + " is not found!");
        }
    }


}
