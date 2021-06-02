package excelLib;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 
{
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ExcelDataConfig(String excelPath)
	{
		try {
			File file=new File(excelPath);
			FileInputStream fis=new FileInputStream(file);
			workbook=new XSSFWorkbook(fis);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}

	}

	public String getExcelData(int sheetnumber, int row, int column)
	{
		sheet=workbook.getSheetAt(sheetnumber);
		String excelData=sheet.getRow(row).getCell(column).getStringCellValue();
		return excelData;
	}
	
	public int getRowCount(int sheetnumber)
	{
		sheet=workbook.getSheetAt(sheetnumber);
		int rowcount=sheet.getLastRowNum();
		return rowcount;
	}
}
