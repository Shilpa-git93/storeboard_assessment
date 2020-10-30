package com.storeboard.generic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary 
{
	public String getKeyPropValue(String propath,String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(propath);
		Properties prop=new Properties();
		prop.load(fis);
		String propvalue=prop.getProperty(key,"inncorrectkey");
		return propvalue;
	}

	public double getIntCellData(String excelpath,String sheet,int r,int c ) throws EncryptedDocumentException, Throwable
	{
			FileInputStream fis=new FileInputStream(excelpath);
			Workbook wb= WorkbookFactory.create(fis);
			double excelvalue=wb.getSheet(sheet).getRow(r).getCell(c).getNumericCellValue();
			return excelvalue;		
	}
	public String getCellData(String excelpath,String sheet,int r,int c ) throws EncryptedDocumentException, Throwable
	{
			FileInputStream fis=new FileInputStream(excelpath);
			Workbook wb= WorkbookFactory.create(fis);
			String excelvalue=wb.getSheet(sheet).getRow(r).getCell(c).toString();
			return excelvalue;		
	}
	public int getRowCount(String excelpath,String sheet) throws Throwable, IOException
	{
			FileInputStream fis=new FileInputStream(excelpath);
			Workbook wb=WorkbookFactory.create(fis);
			int rowCount=wb.getSheet(sheet).getLastRowNum();
			return rowCount;
	}
	public void setCellData(String excelpath,String sheet,int r,int c,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb =WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
		
	}

}
