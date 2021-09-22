package MoneyRediffim;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Cell;
import jxl.Workbook;
import jxl.Sheet;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class LoginPage {


	
		
		private WebDriver driver; 
		private String baseURL;

		@Before
		public void setUp() throws Exception {
			
			
			
					//Setting a path for accessing chrome
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\git\\repository\\Selenium\\driver\\chromedriver.exe"); 
					driver = new ChromeDriver();
					
					//visiting site
					baseURL="https://money.rediff.com/index.html";	
					
					//for maximize window
					driver.manage().window().maximize();	
					
					//wait for next instruction gets execute
					driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);	
		}

		

		@Test
		public void test() {
		
			//Calling baseURL to visit Money.Rediff site
			driver.get(baseURL);
			
			//Clicking On Sign-In Option
			driver.findElement(By.xpath(" //*[@id=\'signin_info\']/a[1] ")).click();
			
			//Code For Sign-in
			driver.findElement(By.xpath("//*[@id=\'useremail\']")).sendKeys("nikitamagar855@gmail.com");
			driver.findElement(By.xpath("//*[@id=\'userpass\']")).sendKeys("Swami@855");
			driver.findElement(By.xpath("//*[@id=\'loginsubmit\']")).click();
			
			
			
		}
		

		@After
		public void tearDown() throws Exception {
		}


	public static String Read_Rediff (int row, String column, String strFilePath)
	{
	Cell c= null;
	int reqCol=0;
	WorkbookSettings ws = null;
	Workbook workbook = null;
	Sheet sheet = null;
	FileInputStream fs = null;
	try{
	fs = new FileInputStream(new File(strFilePath));
	ws = new WorkbookSettings();
	ws.setLocale(new Locale("en", "EN"));

	// opening the work book and sheet for reading data
	workbook = Workbook.getWorkbook(fs, ws);
	sheet = workbook.getSheet(0);

	// Sanitise given data
	String col = column.trim();

	//loop for going through the given row
	for(int j=0; j<sheet.getColumns(); j++)
	{
	Cell cell = sheet.getCell(j,0);
	if((cell.getContents().trim()).equalsIgnoreCase(col))
	{

	/*reqCol= cell.getColumn();
	//System.out.println("column No:"+reqCol);
	c = sheet.getCell(reqCol, row);
	fs.close();
	return c.getContents();*/
	}
	}
	}
	catch(BiffException be)
	{

	System.out.println("The given file should have .xls extension.");
	}
	catch(Exception e)
	{
	e.printStackTrace();

	}
	System.out.println("NO MATCH FOUND IN GIVEN FILE: PROBLEM IS COMING FROM DATA FILE");

	return null;
	}
	public static void writeText(String Module_Name, String Test_Result, String Comments ) throws IOException
	{
						//Creating Text File To Store Test Case Result
						//File f = new File("ResultTestCase.txt");
						
						//Creating Object Of Writing Text File
						FileWriter fw = new FileWriter("ResultTestCase.txt", true);
						
						//Adding Data Into Text File
						fw.write(Module_Name + Test_Result + Comments);
						
						fw.close();
	}
	public static void appendText(String Comments ) throws IOException
	{
		//Creating Text File To Store Test Case Result
		//File f = new File("ResultTestCase.txt");
		
		//Creating Object Of Writing Text File
		FileWriter fw = new FileWriter("ResultTestCase.txt", true);
		
		//Adding Data Into Text File
		fw.write( Comments);
		
		fw.close();
	}
	}





