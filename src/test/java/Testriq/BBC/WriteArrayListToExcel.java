package Testriq.BBC;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteArrayListToExcel {

	/*public void generate(OutputStream outputStream, ArrayList arrlist)
	        throws SQLException, IOException {
	    try {
	    	int currentRow = 0;
	        int i = 0;
	        HSSFWorkbook workbook = new HSSFWorkbook(); 
	        HSSFSheet sheet = workbook.createSheet("January"); 
	        for (int counter = 0; counter < arrlist.size(); counter++) {

	            HSSFRow row = sheet.createRow(currentRow);
	            System.out.println("Description is" + arrlist.get(counter));

	            String c = (String) arrlist.get(counter);

	            HSSFCell cell = HSSFCellUtil.createCell(row, i, null);
	            cell.setCellValue(c);

	            i++;
	            workbook.write(outputStream);
	            currentRow++;
	            currentRow++;

	        }
	    } catch (IOException e) {

	    } finally {
	        outputStream.close();
	    }
	}*/
	public  XSSFWorkbook workbook;
	public  XSSFSheet worksheet;
	public  FileOutputStream fileOut;
	public  XSSFRow row;
	public  XSSFCell cell;

	public void createRecord()throws IOException {

		fileOut = new FileOutputStream("D:\\Media\\TestFile.xlsx");
		workbook = new XSSFWorkbook();
		worksheet = workbook.createSheet("POI Worksheet");
		System.out.println("Sheet creadted successfully");

	}

	public  void AddRecord(List<String> values, int col) throws IOException {
		for (int i = 0; i < values.size(); i++) {
			row = worksheet.getRow(i); if (row == null) row = worksheet.createRow(i);
			cell = row.createCell(col);
			cell.setCellValue(values.get(i));
			//System.out.println(cellAj.getStringCellValue());  
		}
	}

	public  void Add() throws IOException {
		workbook.write(fileOut);

	}
	
	public  void main(String[] args) throws IOException, InterruptedException {
        //WriteArrayListToExcel.createRecord();
        //List<String> values1=Arrays.asList("abc","dsd","dsd");
        //List<String> values2=Arrays.asList("abfffc","dsffd","dsfd");
		//BbcTest bbctest = new BbcTest();
        //WriteArrayListToExcel.AddRecord(bbctest.linklist,0);
        //WriteArrayListToExcel.AddRecord(bbctest.titlelist,1);
        //WriteArrayListToExcel.Add();

    }
}
