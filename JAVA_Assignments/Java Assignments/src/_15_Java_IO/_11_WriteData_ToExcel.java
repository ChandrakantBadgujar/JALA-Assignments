package _15_Java_IO;

import java.io.FileOutputStream;

public class _11_WriteData_ToExcel {
	
	public static void main(String[] args) throws Exception {
        // Create a new Excel workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a new sheet in the workbook
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create some rows and cells in the sheet
        Row row1 = sheet.createRow(0);
        Cell cellA1 = row1.createCell(0);
        Cell cellB1 = row1.createCell(1);
        cellA1.setCellValue("Name");
        cellB1.setCellValue("Age");

        Row row2 = sheet.createRow(1);
        Cell cellA2 = row2.createCell(0);
        Cell cellB2 = row2.createCell(1);
        cellA2.setCellValue("John");
        cellB2.setCellValue(30);

        Row row3 = sheet.createRow(2);
        Cell cellA3 = row3.createCell(0);
        Cell cellB3 = row3.createCell(1);
        cellA3.setCellValue("Jane");
        cellB3.setCellValue(25);

        // Write the workbook to an Excel file
        FileOutputStream fileOut = new FileOutputStream("data.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Close the workbook
        workbook.close();
    }
}
