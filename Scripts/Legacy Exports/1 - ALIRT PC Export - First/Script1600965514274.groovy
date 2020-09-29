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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

WebUI.openBrowser('')

WebUI.navigateToUrl('https://grid.nga.mil/testgrid/accounts/login/?next=/testgrid/export/aoi/38123/')

WebUI.click(findTestObject('Page_Login  GRiD/btn_CAC  GEOAxIS Login'))

WebUI.click(findTestObject('Page_AT-Pointcloud  GRiD/a_Export pointcloud data'))

WebUI.click(findTestObject('Page_AT-Pointcloud  GRiD/div_PC 20111014_41R751348 UNCLASSIFIEDFOUO _4b9ac9'))

WebUI.setText(findTestObject('Page_AT-Pointcloud  GRiD/input_Display Name_name'), 'Katalon - ALIRT PC Export')

WebUI.click(findTestObject('Page_AFE  GRiD/div_Cancel    Generate'))

Thread.sleep(35000)

WebUI.verifyElementClickable(findTestObject('Page_AT-Pointcloud  GRiD/button_Download'))

WebUI.click(findTestObject('Page_AT-Pointcloud  GRiD/button_Download'))

