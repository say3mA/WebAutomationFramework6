package test.pages;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import pages.TableTennisEquipmentPage;
import reporting.ExtentManager;
import utility.DataReader;
import utility.MyDataReader;

public class TableTennisEquipmentPageTest extends TableTennisEquipmentPage {

    HomePage homepage;
    SearchPage searchpage;
    TableTennisEquipmentPage ttepage;
    MyDataReader dataReader;
    public static String Path = "/Users/MacUser/IdeaProjects/comseleniumfrmwrk/eBay/src/test/java/test/pages/TestFiles/TestData.xlsx";
    DataReader dreader;
    ExtentReports report;

    @BeforeMethod
    public void initialization(){
        this.homepage = new HomePage();
        searchpage = homepage.searchClick();
        ttepage = searchpage.pingPongLinkClick();
        report = ExtentManager.getInstance();

    }

    @Test
    public void properUrlTest(){
        ttepage.properUrl();
    }
    @Test
    public void checkTitleTest()throws InterruptedException{
        ttepage.checkTitle();
    }
    @DataProvider
    public Object[][] getExcelTestData() throws Exception {
        Object data[][] = dataReader.getTestData(0);
        return data;
    }

    @Test
    public void under25DollarsTest(){
        ttepage.under25DollarsClick();
    }
    @Test
    public void _25to60DollarsTest(){
        ttepage._25to60DollarsClick();
    }
    @Test
    public void _60andAboveTest(){
        ttepage._60AndAboveClick();
    }
    @Test
    public void dropDownSearchTest(){
        ttepage.dropDownEquipmentSearch();
    }
    @Test
    public void dropDownNumOfOptionsTest(){
        ttepage.dropDownSearchCount();
    }
    @Test
    public void checkBoxTest(){
        ttepage.checkBox();
    }
    @Test
    public void brandOfTableTennisTest(){
        ttepage.brandsOfTableTennis();
    }
    @Test
    public void shopByCategoryTest(){
        ttepage.shopByCategoryLink();
    }
    @Test
    public void yourShoppingCartTest(){
        ttepage.yourShoppingCart();
    }
    @Test
    public void yourNotificationsTest(){
        ttepage.yourNotifications();
    }
    @Test
    public void selectMensShoesTest() throws InterruptedException {
        ttepage.selectMensShoes();
    }

    @Test(dataProvider = "getExcelTestData")
    public void searchTableTennisTest(String item, String item2)throws InterruptedException{
        ttepage.tableTennisSearch(item);
        ttepage.tableTennisSearch(item2);
    }


}
