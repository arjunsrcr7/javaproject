package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import basepackage.Datadrivenbase;
import pagepackage.Datadrivenpage;
import utilitypackage.FBDateDrivenutilitypackage;

public class FBDataDriventest extends Datadrivenbase 
{
	@Test
	public void test()throws IOException,InterruptedException{
		Datadrivenpage fb=new Datadrivenpage(driver);
		FBDateDrivenutilitypackage excel=new FBDateDrivenutilitypackage("D:\\New folder (3)\\face book.xlsx");
		int rowCount=excel.getrowcount();
		for(int i=1;i<=rowCount;i++)
		{
			String userName=excel.getCellDate(i,0);
			System.out.println("userName:"+userName);
			String passWord=excel.getCellDate(i,1);
			System.out.println("password:"+passWord);
			fb.newclick(userName);
			fb.clickpass(passWord);
			Thread.sleep(3000);
			fb.loginl();
		
		}
	}
}