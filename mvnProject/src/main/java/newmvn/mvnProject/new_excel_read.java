package newmvn.mvnProject;



import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class new_excel_read {
	
	public static void main(String[] args) {
		try {
			//File file = new File("E:\\software\\think\\src\\Excel\\sheet.xlsx"); \
			File file = new File(System.getProperty("user.dir") +"\\Excel"+"\\e_file.xlsx");		
			FileInputStream fis = new FileInputStream(file); 
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); 
			Iterator<Row> itr = sheet.iterator(); 
			while (itr.hasNext()) 
			{
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator(); 
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue() + " | | ");
						break;
					case NUMERIC: 
						System.out.print(cell.getNumericCellValue() + " | | ");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + " | | ");
					default:
					}
				}
				System.out.println("");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}