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

WebUI.click(findTestObject('Page_AT-Pointcloud  GRiD/a_AT-Imagery'))

WebUI.click(findTestObject('Object Repository/Page_AT-Imagery  GRiD/a_Export DEMsimagery'))

WebUI.click(findTestObject('Object Repository/Page_AT-Imagery  GRiD/input_ALIRT_library'))

WebUI.click(findTestObject('Page_AT-Imagery  GRiD/div_Intensity - 20111014_41R751348 UNCLASSI_1a1436'))

WebUI.setText(findTestObject('Object Repository/Page_AT-Imagery  GRiD/input_Display Name_name'), 'Katalon - ALIRT Intensity Export')

WebUI.click(findTestObject('Page_AFE  GRiD/div_Cancel    Generate'))

Thread.sleep(30000)

WebUI.verifyElementClickable(findTestObject('Page_AT-Pointcloud  GRiD/button_Download'))

WebUI.click(findTestObject('Page_AT-Imagery  GRiD/button_Download'))


