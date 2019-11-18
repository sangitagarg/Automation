package pac;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readallrowdata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\Test Case.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet2");
		int rowcount=sh.getLastRowNum();
		for(int i=0;i<rowcount;i++){
			Row row=sh.getRow(i);
			String data_1_col=row.getCell(0).getStringCellValue();
			String data_2_col=row.getCell(1).getStringCellValue();
			System.out.println(data_1_col+"\t"+data_2_col);
		}

	}

}
