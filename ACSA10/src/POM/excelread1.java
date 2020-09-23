package POM;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excelread1 {


	
//WAP to fetch data from excel and print it in console
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		String path = "./data/Book2.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String a = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(a);
		String b = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(b);
	}}