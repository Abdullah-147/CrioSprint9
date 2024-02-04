package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	static int rowCount=0;
	public void onTestSuccess(ITestResult r) {
		try {
			writeDataIntoExcel(r.getName(),r.getParameters(),"PASS");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestFailure(ITestResult r) {
		try {
			writeDataIntoExcel(r.getName(),r.getParameters(),"FAIL");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeDataIntoExcel(String MethodName,Object [] obj,String Status) throws IOException {
		XSSFWorkbook book=new XSSFWorkbook();
		String path="./Output.xlsx";
		if(rowCount==0) {
		File file=new File(path);
		file.createNewFile();
		book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Results");
		Row row=sheet.createRow(rowCount);
		row.createCell(0).setCellValue("Test case");
		row.createCell(1).setCellValue("Parameters");
		row.createCell(2).setCellValue("Status");
		FileOutputStream fos=new FileOutputStream(file);
		book.write(fos);
		rowCount++;
		}
		String astr=Arrays.toString(obj);
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Results");
		Row row=sheet.createRow(rowCount);
		rowCount++;
		row.createCell(0).setCellValue(MethodName);
		row.createCell(1).setCellValue(astr);
		row.createCell(2).setCellValue(Status);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		fos.close();
		
	}
}
