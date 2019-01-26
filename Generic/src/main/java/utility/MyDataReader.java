package utility;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyDataReader {
	
	 XSSFSheet ExcelWSheet;
	 XSSFWorkbook ExcelWBook;
	 XSSFCell Cell;
	 XSSFRow Row;
	 static Workbook book;
	 static Sheet sheet;
	 public static String Path = "/Users/MacUser/IdeaProjects/comseleniumfrmwrk/eBay/src/test/java/test/pages/TestFiles/TestData.xlsx";

	
	public void setExcelFile(String Path) throws Exception {
		 
			try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			///ExcelWSheet = ExcelWBook.getSheet(SheetName);
			} catch (Exception e){
				throw (e);
			}

	}// end of setexcelfile
	
	@SuppressWarnings("null")
	public String[][] getExcelSheetData(String sheetname) throws Exception {
		String[][] data = null;
		String[][] mydata = null;

		if (ExcelWBook != null) {
			XSSFSheet sheet = ExcelWBook.getSheet(sheetname);
			if (sheet != null) {
				int rows = sheet.getLastRowNum();
				int cols = sheet.getRow(sheet.getLastRowNum()).getPhysicalNumberOfCells();
				int arrayrow = rows+1;
				data = new String[arrayrow][cols];
				mydata = new String[rows][cols];


				for (int i = 0; i < arrayrow; i++) {
					for (int j = 0; j < cols; j++) {
						org.apache.poi.ss.usermodel.Cell cell = sheet.getRow(i).getCell(j);
						String cellData = cell.getStringCellValue();
						data[i][j] = cellData;
					}
					}
					// copied array to get rid of header row
					for(int m=0; m<rows; m++){
						for (int n=0; n<cols; n++){
							mydata[m][n] = data[m+1][n];

						}
					}

				}
			}
			
			return mydata;
		} //// end of getexcel sheet data

	public static Object[][] getTestData(int sheetIndex){
		//FileInputStream file = null;
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(Path));
			//file = new FileInputStream(Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(bis);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
		sheet = book.getSheetAt(sheetIndex);
		//Object[][] data = new  Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()+1];
		Object [][] parsedData = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0;i<parsedData.length;i++){
			for (int k = 0; k < sheet.getRow(i).getLastCellNum();k++){
				parsedData[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return parsedData;
	}
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

} // end of class
