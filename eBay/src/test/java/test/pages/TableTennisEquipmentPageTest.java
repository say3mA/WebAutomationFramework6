package test.pages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import pages.TableTennisEquipmentPage;
import utility.DataReader;
import utility.MyDataReader;

public class TableTennisEquipmentPageTest extends TableTennisEquipmentPage {

    HomePage homepage;
    SearchPage searchpage;
    TableTennisEquipmentPage ttepage;
    MyDataReader dataReader;
    public static String Path = "/Users/MacUser/IdeaProjects/comseleniumfrmwrk/eBay/src/test/java/test/pages/TestFiles/TestData.xlsx";
    DataReader dreader;

    @BeforeMethod
    public void initialization(){
        this.homepage = new HomePage();
        searchpage = homepage.searchClick();
        ttepage = searchpage.pingPongLinkClick();
    }

    /**@Test
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Table-Tennis-Equipment/97072/bn_1958176");
    }
    @Test
    public void checkTitle()throws InterruptedException{
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Table Tennis Equipment | eBay");
    }**/
    @DataProvider
    public Object[][] getExcelTestData() throws Exception {
        Object data[][] = dataReader.getTestData(0);
        return data;
    }
    @Test(dataProvider = "getExcelTestData")
    public void searchTableTennisTest(String item, String item2)throws InterruptedException{
        ttepage.tableTennisSearch(item);
        ttepage.tableTennisSearch(item2);
    }


}
