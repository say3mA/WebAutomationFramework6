package test.pages;

import com.relevantcodes.extentreports.ExtentReports;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.HomePage;
import reporting.ExtentManager;
import utility.MyDataReader;

public class HomePageTest extends HomePage {

    HomePage homepage=null;
    ExtentReports report;
    MyDataReader reader;
    String path = "/Users/MacUser/IdeaProjects/comseleniumfrmwrk/eBay/src/test/java/test/pages/TestFiles/TestData.xlsx";

    @BeforeMethod
    public void initialization() throws Exception {
        this.homepage = new HomePage();
        report = ExtentManager.getInstance();
        this.reader = new MyDataReader();
        reader.setExcelFile(path);

    }

  /**  @Test
    public void properTitle(){
        Assert.assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
    }
    @Test
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
    }
   @Test
   public void eBayLogoValidation(){
        Assert.assertTrue(homepage.ebayLogoIsThere());
   }
    @Test
    public void careerLinkTest(){
        homepage.careersPageClick();
    }
    @Test
    public void searchLinkTest(){
        homepage.searchClick();
    }
    @Test
    public void homeAndGardenLinkTest() throws InterruptedException {
        homepage.HomeAndGardenClick();
    }
    @Test
    public void sellLinkTest(){
        homepage.sellPageClick();
    }
    @Test
    public void signInLinkTest(){
        homepage.signInPageClick();
    }
    @Test
    public void categoryDropDownTest(){
        homepage.categoryDropDownSelect();
    }
    @Test
    public void categoryNumberOfItemsTest(){
        int count = homepage.categoryDropDownNumberOfItems();
        Assert.assertEquals(count, 36);
    }
    @Test
    public void eBaySitesTest(){
        homepage.eBayKazakhstanSelect();
    }
  @Test
  public void eBayKazakhstanUrlTest()throws InterruptedException{
      homepage.eBayKazakhstanSelect();
      Thread.sleep(2000);
      String title = driver.getCurrentUrl();
      Assert.assertEquals(title, "https://kz.ebay.com/");
  }**/
  @Test
  public void registerPageTest(){
      homepage.registerPageClick();
  }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
