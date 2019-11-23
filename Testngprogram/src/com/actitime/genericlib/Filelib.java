package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 
 * @author Sangita
 *
 */
public class Filelib {
		String ppath="./testdata/new.properties";
		String epath="./testdata/TestCase.xlsx";
		/** 
		 * get the properties file key value based on your argument
		 * @param key
		 * @return
		 * @throws Throwable
		 */
		public String getpropertyfiledata(String key) throws Throwable {
			FileInputStream fis=new FileInputStream(ppath);
			Properties pobj=new Properties();
			pobj.load(fis);
			String data=pobj.getProperty(key);
			return data;	
		}
		/**
		 * it is use to read the data from excelsheet(testdata/Test Case.xlsx)
		 * based on your arguments
		 * @param sheetname
		 * @param rownum
		 * @param cellnum
		 * @return
		 * @throws Throwable
		 */
		   /* public String getExcelData(String sheetname, int rownum, int cellnum) throws Throwable{
			FileInputStream fis=new FileInputStream(epath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetname);
			Row row=sh.getRow(rownum);
			Cell cel=row.getCell(cellnum);
			String data=cel.getStringCellValue();
			return data;
		}*/
		    /**
		     * write databook to excelworkbook based on your arguments
		     * @param sheetname,rownum, cellnum, data
		     * @param rownum
		     * @param cellnum
		     * @param data
		     * @throws Throwable
		     */
		    /*public void setexceldata(String sheetname,int rownum, int cellnum ,int data) throws Throwable {
		    	FileInputStream fis=new FileInputStream(epath);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(sheetname);
				Row row=sh.getRow(rownum);
				Cell cel=row.getCell(cellnum);
				cel.setCellValue(data);
				FileOutputStream fos=new FileOutputStream(epath);
				wb.write(fos);
				wb.close();
		    }*/
		public String getpropertykeyvalue(String string) {
			// TODO Auto-generated method stub
			return null;
		}
	}