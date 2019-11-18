package pac;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Createcustomertest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\Test Case.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row row=sh.getRow(2);
		String customername=row.getCell(2).getStringCellValue();
		String projectname=row.getCell(3).getStringCellValue();
		System.out.println(customername);
		System.out.println(projectname);
		wb.close();

	}

}
