package pac;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedatatoexcel {

	public static void main(String[] args) throws Throwable {
		String path="C:\\Users\\user\\Desktop\\Test Case.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet2");
		Row row=sh.getRow(1);
		Cell cel=row.getCell(4);
		cel.setCellValue("PASS");
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}

}
