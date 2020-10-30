package com.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tpo
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",".//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.storeboard.com/?__cf_chl_jschl_tk__=1046438b568b764c8d25bb0fe166cdee5a1dbdb5-1603959475-0-AbtYBL7sPHz9-WhXd0rwrKsIAb9TVTNI02ulC2EO6nfDeG3yyxGUGrxdSR-jiYrpkLO9OK_sOWHezgwXieCxfLwnU_H_fH28CZ62sJOSNf-VVHLsGT_rhJswxbWnlL9Ilb-pBEeUupu-kShTlYhDtnbvYiLpjTMRAOQkc-QmLL0QEmCzmhceJwbyj5MeKHqGNIpjOuIfUFQoy4hNB-z-kZ4caJEOuQOgEH4n_Sl7sUuduLS2hGnV7MVWEzQyb6TWri8XH4FFd0Iyc3VgMk5mbu8");
		//driver.navigate().to("https://www.storeboard.com/premiumpackages/");
		driver.get("https://www.amazon.com/");
		Actions ac=new Actions(driver);
		WebElement dd=driver.findElement(By.xpath("//a[.='Gift Cards']"));
		ac.moveToElement(dd).perform();
		dd.click();
		

}
}
//a[.='Gift Cards']