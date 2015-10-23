package learnpoi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXlsx {
	public static void main(String args[]) throws IOException{
		//Create a blank workbook
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//Create a blank worksheet
		XSSFSheet spreadsheet = wb.createSheet("Employee Info");
		
		XSSFRow row ;
		
		Map <String, Employee> employeeInfo = new TreeMap<String, Employee>();
		
		employeeInfo.put("1", new Employee("tp01", "Gopal", "Technical Manager" ));
		employeeInfo.put("2", new Employee("tp02", "Manisha", "Proof Reader" ));
		employeeInfo.put("3", new Employee("tp03", "Masthan", "Technical Writer" ));
		employeeInfo.put("4", new Employee("tp04", "Satish", "Technical Writer" ));
		employeeInfo.put("5", new Employee("tp05", "Krishna", "Technical Writer" ));
		
		Set<String> keyid = employeeInfo.keySet();
		
		
		row = spreadsheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Employee ID");
		cell = row.createCell(1);
		cell.setCellValue("Name");
		cell = row.createCell(2);
		cell.setCellValue("Designation");
		
		int rowid = 1;
		for(String key : keyid){
			row = spreadsheet.createRow(rowid++);
			Employee employee = employeeInfo.get(key);
			cell = row.createCell(0);
			cell.setCellValue(employee.getID());
			cell = row.createCell(1);
			cell.setCellValue(employee.getName());
			cell = row.createCell(2);
			cell.setCellValue(employee.getDesignation());
		}
		
		//write the workbook to disk
		FileOutputStream out = new FileOutputStream(new File("data/employeeinfo.xlsx"));
		wb.write(out);
		wb.close();
		out.close();
		System.out.println("employeeinfo.xlsx createad successfully.");
	}
}
