package learnpoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlsx {
	static XSSFRow row;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ArrayList<Employee> employeeInfo;
		
		
		
		FileInputStream in = new FileInputStream(new File("data/employeeinfo.xlsx"));
		
		XSSFWorkbook wb = new XSSFWorkbook(in);
		XSSFSheet spreadSheet = wb.getSheet("Employee Info");
		
		Iterator <Row> rowIterator = spreadSheet.iterator();
		while(rowIterator.hasNext()){
			row = (XSSFRow) rowIterator.next();
			Iterator <Cell> cellIterator = row.iterator();
			while(cellIterator.hasNext()){
				Cell cell = cellIterator.next();
				switch(cell.getCellType()){
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t\t");
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue() + "\t\t");
					break;
					
				}
			}
			System.out.println();

		}
		wb.close();
		in.close();
		

	}

}
