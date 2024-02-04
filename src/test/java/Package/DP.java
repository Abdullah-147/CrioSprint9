package Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP {

	@DataProvider(name = "dataProvider")
	public Object[][] DpMethod(Method m) throws IOException {
		FileInputStream fis=new FileInputStream("./dataInput.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("data");
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);
		Object[][] obj=new Object[rowCount][1];
		for(int i=0;i<rowCount;i++) {
			Row row=sheet.getRow(i+1);
			Iterator<Cell> itr=row.cellIterator();
			while(itr.hasNext()) {
				obj[i][0]=String.valueOf(itr.next().getStringCellValue());
			}
		}
		return obj;
	}
}
