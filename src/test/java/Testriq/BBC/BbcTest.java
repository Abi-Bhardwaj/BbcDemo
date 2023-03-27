package Testriq.BBC;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BbcTest {
//	WebDriver driver;
	ChromeDriver driver;
	BbcObjects bbcobjects;
	public static List <String> linklist;
	public static List <String> titlelist;
	public static List <String> desclist;
	public  HSSFWorkbook workbook;
	public  HSSFSheet worksheet;
	public  FileOutputStream fileOut;
	public  HSSFRow row;
	public  HSSFCell cell;

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Softwares & Tools\\BrowserDrivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		driver = new ChromeDriver(options);
		bbcobjects = new BbcObjects(driver);
		linklist = new ArrayList<String>();
		titlelist = new ArrayList<String>();
		desclist = new ArrayList<String>();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void testBBC() throws IOException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for(int i = 0; i < bbcobjects.getBbcLinksList().size(); i++) {
			String link = bbcobjects.getBbcLinksList().get(i).getAttribute("href");
			//System.out.println(link);
			linklist.add(bbcobjects.getBbcLinksList().get(i).getAttribute("href"));
		}
		System.out.println(linklist);

		for(int i = 0; i < bbcobjects.getBbcTitlesList().size(); i++) {
			String title = bbcobjects.getBbcTitlesList().get(i).getText();
			//System.out.println(title);
			titlelist.add(bbcobjects.getBbcTitlesList().get(i).getText());
		}
		System.out.println(titlelist);
		
		for(int i = 0; i < bbcobjects.getBbcDescList().size(); i++) {
			String desc = bbcobjects.getBbcDescList().get(i).getText();
			//System.out.println(title);
			desclist.add(bbcobjects.getBbcDescList().get(i).getText());
		}
		System.out.println(desclist);
		
		String newFileName = new SimpleDateFormat("HHmm_ddMMyyyy'.xlsx'").format(new Date());
		//return newFileName;
		
		fileOut = new FileOutputStream(System.getProperty("user.dir") + "\\ExeclFiles" + "\\"+ newFileName);
		workbook = new HSSFWorkbook();
		worksheet = workbook.createSheet("POI Worksheet");
		System.out.println("Sheet creadted successfully");
		
		AddRecord(linklist,0);
		AddRecord(titlelist,1);
		AddRecord(desclist,2);
		
		workbook.write(fileOut);
		
	}

	/*public void operations() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for(int i = 0; i < bbcobjects.getBbcLinksList().size(); i++) {
			String link = bbcobjects.getBbcLinksList().get(i).getAttribute("href");
			//System.out.println(link);
			linklist.add(bbcobjects.getBbcLinksList().get(i).getText());
		}
		System.out.println(linklist);

		for(int i = 0; i < bbcobjects.getBbcTitlesList().size(); i++) {
			String title = bbcobjects.getBbcTitlesList().get(i).getText();
			//System.out.println(title);
			titlelist.add(bbcobjects.getBbcTitlesList().get(i).getText());
		}
		System.out.println(titlelist);
	}

	public String generateFileName() {
		String newFileName = new SimpleDateFormat("HHmm_ddMMyyyy'.xlsx'").format(new Date());
		return newFileName;
	}

	public void createRecord()throws IOException {
		fileOut = new FileOutputStream("D:\\BBC\\"+generateFileName());
		workbook = new HSSFWorkbook();
		worksheet = workbook.createSheet("POI Worksheet");
		System.out.println("Sheet creadted successfully");
	}

	public void AddRecord(List<String> values, int col) throws IOException {
		for (int i = 0; i < values.size(); i++) {
			row = worksheet.getRow(i); if (row == null) row = worksheet.createRow(i);
			cell = row.createCell(col);
			cell.setCellValue(values.get(i));
			//System.out.println(cellAj.getStringCellValue());  
		}
	}

	public void Add() throws IOException {
		workbook.write(fileOut);

	}

	@Test (priority = 1)
	public void testBbc() throws IOException {
		BbcTest testit= new BbcTest();
		testit.init();
		testit.operations();
		testit.createRecord();
		testit.AddRecord(linklist,0);
		testit.AddRecord(titlelist,1);
		testit.Add();
	}
	*/
	public void AddRecord(List<String> values, int col) throws IOException {
		for (int i = 0; i < values.size(); i++) {
			row = worksheet.getRow(i); 
			if (row == null) 
			row = worksheet.createRow(i);
			cell = row.createCell(col);
			cell.setCellValue(values.get(i));
			//System.out.println(cellAj.getStringCellValue());  
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
