package pagepackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Datadrivenpage {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement New;
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"u_0_5_a4\"]")
	WebElement login;
	
	
	
	public Datadrivenpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	public void newclick(String username)
	{
		New.sendKeys(username);
	}
	public void clickpass(String password)
	{
		pass.sendKeys(password);
	}
	
	public void loginl()
	{
		login.click();
		
	}
	
}
