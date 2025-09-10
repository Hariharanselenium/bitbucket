package com.anhtester.hooks;

import com.anhtester.driver.DriverManager;
import com.anhtester.driver.TargetFactory;

import com.anhtester.utils.LogUtils;
import com.thinktimetechno.projects.website.Multipages.CorporateCartPage;
import com.thinktimetechno.projects.website.Multipages.CorporateDashboardPage;
import com.thinktimetechno.projects.website.Multipages.CorporateDistributionPage;
import com.thinktimetechno.projects.website.Multipages.CorporateEmployeePage;
import com.thinktimetechno.projects.website.Multipages.CorporateInvoicePage;
import com.thinktimetechno.projects.website.Multipages.CorporateLoginPage;
import com.thinktimetechno.projects.website.Multipages.CorporatePaymentPage;
import com.thinktimetechno.projects.website.Multipages.CorporateRegistrationPage;
import com.thinktimetechno.projects.website.pages.CartPage;
import com.thinktimetechno.projects.website.pages.CoursePage;
import com.thinktimetechno.projects.website.pages.DashboardPage;
import com.thinktimetechno.projects.website.pages.InvoicePage;
import com.thinktimetechno.projects.website.pages.LoginPage;
import com.thinktimetechno.projects.website.pages.PaymentPage;
import com.thinktimetechno.projects.website.pages.RegistrationPage;
import com.thinktimetechno.projects.website.pages.StorePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

    private WebDriver driver;

    public TestContext() {
        driver = ThreadGuard.protect(new TargetFactory().createInstance());
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);
    }
    private DashboardPage dashboardPage;
	private LoginPage loginPage;
	private RegistrationPage registrationPage;
	private CartPage cartPage;
	private CoursePage coursePage;
	private PaymentPage paymentPage;
	private InvoicePage invoicePage;
	private StorePage storePage;
	private CorporateLoginPage corporateloginPage;
	private CorporateDashboardPage corporatedashboardPage;
	private CorporateRegistrationPage corporateregistrationPage;
	private CorporateCartPage corporatecartPage;
	private CorporatePaymentPage corporatepaymentPage;
	private CorporateEmployeePage corporateemployeePage;
    private CorporateInvoicePage corporateinvoicePage;
    private CorporateDistributionPage corporatedistributionPage;
 

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }
    
    public DashboardPage getDashboardPage() {
		if (dashboardPage == null) {
			dashboardPage = new DashboardPage();
		}
		return dashboardPage;
	}

	public StorePage getStorePage() {
		if (storePage == null) {
			storePage = new StorePage();
		}
		return storePage;
	}
	
	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}

	public RegistrationPage getRegistrationPage() {
		if (registrationPage == null) {
			registrationPage = new RegistrationPage();
		}
		return registrationPage;
	}
	
	public InvoicePage getInvoicePage() {
		if (invoicePage == null) {
			invoicePage = new InvoicePage();
		}
		return invoicePage;
	}
	
	public CartPage getCartPage() {
		if (cartPage == null) {
			cartPage = new CartPage();
		}
		return cartPage;
	}

	public PaymentPage getPaymentPage() {
		if (paymentPage == null) {
			paymentPage = new PaymentPage();
		}
		return paymentPage;
	}

	public CoursePage getCoursePage() {
		if (coursePage == null) {
			coursePage = new CoursePage();
		}
		return coursePage;
	}
	public CorporateDashboardPage getCorporateDashboardPage() {
		if (corporatedashboardPage == null) {
			corporatedashboardPage = new CorporateDashboardPage();
		}
		return corporatedashboardPage;
	}

	public CorporateLoginPage getCorporateLoginPage() {
		if (corporateloginPage == null) {
			corporateloginPage = new CorporateLoginPage();
		}
		return corporateloginPage;
	}

	public CorporateRegistrationPage getCorporateRegistrationPage() {
		if (corporateregistrationPage == null) {
			corporateregistrationPage = new CorporateRegistrationPage();
		}
		return corporateregistrationPage;
	}

	public CorporatePaymentPage getCorporatePaymentPage() {
		if (corporatepaymentPage == null) {
			corporatepaymentPage = new CorporatePaymentPage();
		}
		return corporatepaymentPage;
	}

	public CorporateDistributionPage getCorporateDistributionPage() {
		if (corporatedistributionPage == null) {
			corporatedistributionPage = new CorporateDistributionPage();
		}
		return corporatedistributionPage;
	}
	
	public CorporateEmployeePage getCorporateEmployeePage() {
		if (corporateemployeePage == null) {
			corporateemployeePage = new CorporateEmployeePage();
		}
		return corporateemployeePage;
	}
	
	public CorporateInvoicePage getCorporateInvoicePage() {
		if (corporateinvoicePage == null) {
			corporateinvoicePage = new CorporateInvoicePage();
		}
		return corporateinvoicePage;
	}

	public CorporateCartPage getCorporateCartPage() {
		if (corporatecartPage == null) {
			corporatecartPage = new CorporateCartPage();
		}
		return corporatecartPage;
	}

}
