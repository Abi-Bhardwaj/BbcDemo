package Testriq.BBC;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateExcelFile {

	public static void main(String[] args) throws FileNotFoundException, IOException   
	{   
		//creating an instance of Workbook class   
		Workbook wb = new HSSFWorkbook();   
		//creates an excel file at the specified location  
		OutputStream fileOut = new FileOutputStream("D:\\Media\\BankStatement.xlsx");   
		System.out.println("Excel File has been created successfully.");   
		wb.write(fileOut);   
	}   

	/*
	 * public static void main(String[]args) { try { String filename =
	 * "C:\\Users\\Anubhav\\Desktop\\CustomersDetail.xlsx"; FileOutputStream fileOut
	 * = new FileOutputStream(filename); fileOut.close();
	 * System.out.println("Excel file has been generated successfully."); } catch
	 * (Exception e) { e.printStackTrace(); } }
	 */
}
