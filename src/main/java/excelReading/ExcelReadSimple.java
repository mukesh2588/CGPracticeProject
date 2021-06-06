package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadSimple {

	public static void main(String[] args) throws IOException , NullPointerException
	{
		String filePath= "C:\\Users\\mkhedkar\\eclipse-workspace\\CGPracticeProject\\TestData.xlsx";
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);

		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		XSSFSheet sheet=workbook.getSheetAt(0);
		
	/*	int rowFirst=sheet.getFirstRowNum();
		System.out.println("Row Count is:-"+rowFirst);*/

		int rowCount=sheet.getLastRowNum();
		System.out.println("Row Count is:-"+rowCount);

		for(int i=0 ; i<rowCount;i++)
		{
			Row row=sheet.getRow(i);
			for (int j = 0; j <row.getLastCellNum(); j++) 
			{
				System.out.print(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}
		
		
		workbook.close();



	}

}
