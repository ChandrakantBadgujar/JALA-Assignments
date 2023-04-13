package _15_Java_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _10_ReadData_FromExcel {

public String getcellvalue(int Rownum, int Cellnum) throws IOException {  
		
		//open the file (Java Class in java.io File)
		
		File objfile= new File("C:\\Users\\Admin\\Desktop\\TestData\\TestData.xlsx");
		
		//Read File (Java Class in java.io File)
		
		FileInputStream objfiss= new FileInputStream(objfile);
		
		//Reading Book (Workbook - ApchePOI Library)
		
		Workbook objbook= new XSSFWorkbook(objfiss);
		
		//Read sheet
		String cellvalue=objbook.getSheet("Sheet1").getRow(Rownum).getCell(Cellnum).toString();
		
		return cellvalue;

	}


}
