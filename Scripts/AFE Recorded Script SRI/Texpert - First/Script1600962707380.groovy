import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.lang.Thread as Thread

WebUI.openBrowser('')

WebUI.navigateToUrl('https://grid.nga.mil/grid/accounts/login/?next=/grid/export/aoi/44825/')

WebUI.click(findTestObject('Page_Login  GRiD/btn_CAC  GEOAxIS Login'))

WebUI.click(findTestObject('Page_GEOAxIS/a_PKI Certificate'))

WebUI.click(findTestObject('Page_GEOAxIS/span_Click here to continue'))

WebUI.click(findTestObject('Object Repository/Page_USGS PC  GRiD/a_Export pointcloud data'))

WebUI.click(findTestObject('Object Repository/Page_USGS PC  GRiD/div_PC USGS_20100408-0510 UNCLASSIFIED 2010_1266e1'))

WebUI.setText(findTestObject('Page_AFE  GRiD/input_Display Name_name'), 'Texpert')

WebUI.click(findTestObject('Page_AFE  GRiD/Filter Drop-down'))

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/Page_USGS PC  GRiD/input_Feature Extraction_filter_afe'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_USGS PC  GRiD/select_PSU 190  TexPert 315-3  SRI 15'), 
    'texpert_3.1.5-3;', true)

Thread.sleep(5000)

WebUI.click(findTestObject('Page_AFE  GRiD/div_Cancel    Generate'))

