package POM;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelread2 {



	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path = "./data/Book2.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String usn = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(usn);
		String pwd = wb.getSheet("Sheet1").getRow(0).getCell(1).toString();
		System.out.println(pwd);
		wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("qspiders");
		wb.getSheet("Sheet1").getRow(0).getCell(1).setCellValue("JSPIDERS");
		wb.write(new FileOutputStream(path));
		wb.close();
	}

}
