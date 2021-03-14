package excelReading;

import java.io.IOException;

public class ExcelCallingMain {

	public static void main(String[] args) throws IOException {
		
		ExcelReader.readTestData("F:\\EclipseWorkspace\\CGPracticeProject\\", "TestData.xlsx", "Sheet1");
		ExcelReader.getData("TC1", "LastName");
		ExcelReader.getData("TC2", "FirstName");
		ExcelReader.getData("TC1", "FirstName");


	}

}
