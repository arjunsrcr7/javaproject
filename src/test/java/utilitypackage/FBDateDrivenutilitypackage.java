package utilitypackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FBDateDrivenutilitypackage {
XSSFWorkbook workbk;
XSSFSheet Sheet;
public FBDateDrivenutilitypackage(String excelPath)throws IOException
{
	try 
	{
		FileInputStream files=new FileInputStream("D:\\New folder (3)\\face book.xlsx");
		workbk=new XSSFWorkbook(files);
		Sheet=workbk.getSheetAt(0);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}


}
public String getCellDate(int row,int col)
{
return Sheet.getRow(row).getCell(col).getStringCellValue();
}
public int getrowcount(){
	return Sheet.getLastRowNum();
}
public void closeWorkBook(){
	try {workbk.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

{
	
}
 
}
