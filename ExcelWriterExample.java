import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriterExample {
    public static void main(String[] args) {
        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet
        Sheet sheet = workbook.createSheet("Sample Data");

        // Create a row at index 0
        Row headerRow = sheet.createRow(0);

        // Create cells in the header row
        Cell cell1 = headerRow.createCell(0);
        cell1.setCellValue("ID");

        Cell cell2 = headerRow.createCell(1);
        cell2.setCellValue("Name");

        Cell cell3 = headerRow.createCell(2);
        cell3.setCellValue("Age");

        // Add some sample data rows
        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue(1);
        row1.createCell(1).setCellValue("Pravin");
        row1.createCell(2).setCellValue(28);

        Row row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue(2);
        row2.createCell(1).setCellValue("Sneha");
        row2.createCell(2).setCellValue(25);

        // Auto-size columns for neatness
        for (int i = 0; i < 3; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream("SampleExcel.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Excel file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}