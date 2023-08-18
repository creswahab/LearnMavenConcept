package mavenLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class OpenGoogleWeb {

	public static void main(String[] args) {
		
		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Report.html");
		extentReports.attachReporter(sparkReporter);
		ExtentTest testcase = extentReports.createTest("Verify the Google is opened");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Jupiter"+Keys.ENTER);
		testcase.pass("Testcase is passed");
		driver.quit();
		extentReports.flush();

	}

}
