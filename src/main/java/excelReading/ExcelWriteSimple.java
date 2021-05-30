package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWriteSimple {

	public static void main(String[] args) throws IOException , NullPointerException
	{
		String filePath= "C:\\Users\\mkhedkar\\eclipse-workspace\\CGPracticeProject\\TestData.xlsx";
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);

		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		XSSFSheet sheet=workbook.getSheetAt(0);
		
		sheet.getRow(1).createCell(3).setCellValue(filePath);
		
		sheet.getRow(2).createCell(3).setCellValue("MKtest");
		
		FileOutputStream fout=new FileOutputStream(file);
		
		workbook.write(fout);
		
		
		workbook.close();



	}

}
