package Practice;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelConnect {

	public static Workbook wb;

	@Test(priority = 1)
	public void readSingleData() throws IOException {
		File fl = new File("F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Excel\\Practice.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		wb = new XSSFWorkbook(fis);
		Sheet sheetOne = wb.getSheetAt(0);
		Row row = sheetOne.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellData = cell.getCellType();
		if (cellData.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		} else {
			double originalValue = cell.getNumericCellValue();
			int value = (int) originalValue;
			System.out.println(value);
		}
	}

	@Test(priority = 2)
	public void readMultipleData() throws IOException {
		File fl = new File("F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Excel\\Practice.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		wb = new XSSFWorkbook(fis);
		Sheet sheetOne = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetOne.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetOne.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else {
					double doubleValue = cell.getNumericCellValue();
					int value = (int) doubleValue;
					System.out.println(value);
				}
			}
		}
	}

//	@Test
	public void writeData() throws InvalidFormatException, IOException {
		File f = new File("F:\\Mani Bharathi\\Eclipse Data\\AdactinTestNG\\Excel\\Practice.xlsx");
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);

		wb.createSheet("TestNG").createRow(0).createCell(0).setCellValue("S.No");
		wb.getSheet("TestNG").getRow(0).createCell(1).setCellValue("NAME");
		wb.getSheet("TestNG").getRow(0).createCell(2).setCellValue("AGE");
		wb.getSheet("TestNG").createRow(1).createCell(0).setCellValue("1");
		wb.getSheet("TestNG").getRow(1).createCell(1).setCellValue("Azeem");
		wb.getSheet("TestNG").getRow(1).createCell(2).setCellValue("21");
		wb.getSheet("TestNG").createRow(2).createCell(0).setCellValue("2");
		wb.getSheet("TestNG").getRow(2).createCell(1).setCellValue("Neeraj");
		wb.getSheet("TestNG").getRow(2).createCell(2).setCellValue("21");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

}
