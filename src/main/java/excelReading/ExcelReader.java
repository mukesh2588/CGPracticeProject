package excelReading;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class ExcelReader {
	static String tc;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public static LinkedHashMap<String , LinkedHashMap<String, String>> hm1 = new LinkedHashMap<String, LinkedHashMap<String, String>>();
	
	public static void readTestData(String filePath, String workbookName, String sheetName) throws IOException
	{
		String excelFilePath= "F:\\EclipseWorkspace\\CGPracticeProject\\TestData.xlsx";
		FileInputStream fis= new FileInputStream(excelFilePath);
		wb=new XSSFWorkbook(fis);
		sheet= wb.getSheet(sheetName) ;
		
		Row headerRow=sheet.getRow(0);
		
		int rowCount=0;
		rowCount=sheet.getPhysicalNumberOfRows();
		
		for(int i=0; i<rowCount ; i++)
		{
			Row currentRow=sheet.getRow(i);
			int totalColumns=0;
			totalColumns=currentRow.getPhysicalNumberOfCells();
			
			LinkedHashMap<String, String> currentMap= new LinkedHashMap<String, String>();
			
			for(int j=0; j<totalColumns; j++)
			{
				Cell currentCell1=currentRow.getCell(0);
				/*
				 * switch (currentCell.getCellType()) { case Cell.CELL_TYPE_BLANK: continue;
				 * case Cell.CELL_TYPE_STRING: tc=currentCell.getStringCellValue();
				 * 
				 * }
				 */
				
				tc=currentCell1.getStringCellValue();
				
				Cell currentCell=currentRow.getCell(j);
				
				currentMap.put(headerRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
			}
			hm1.put(tc, currentMap);
		}
		wb.close();
		
		
	}
	public static String getData(String testCase, String key)
	{
		String data= hm1.get(testCase).get(key);
		System.out.println(data);
		return data;
		
	}
	
}
