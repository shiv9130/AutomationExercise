package UtilityAE;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import FrameworkExceptionsAE.fileNotFoundException;

public class excelUtil {
	
	public String ExcelFileUtil(String sheet, int row, int cell) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Links\\AutomationExercise\\src\\main\\resources\\dataAutomation.xlsx");
			Workbook  wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
			return data;
			
		} catch (Exception e) {
			
			throw new fileNotFoundException("fileNotfound" + e.getMessage());
		}
		
		
		
	}

}
