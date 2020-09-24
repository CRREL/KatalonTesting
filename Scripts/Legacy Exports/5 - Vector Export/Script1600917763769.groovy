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

WebUI.click(findTestObject('Page_AT-Pointcloud  GRiD/a_AT-Vectors'))

WebUI.click(findTestObject('Page_AT-Vectors  GRiD/a_Export vector data'))

WebUI.click(findTestObject('Page_AT-Vectors  GRiD/div_Trees 20071205_18S460440 UNCLASSIFIED 2_e3896d'))

WebUI.click(findTestObject('Page_AT-Vectors  GRiD/div_Buildings - 2D 20071205_18S460440 UNCLA_a8513e'))

WebUI.click(findTestObject('Page_AT-Vectors  GRiD/div_Forests 20120919_18S444438 UNCLASSIFIED_5f8221'))

WebUI.click(findTestObject('Page_AT-Vectors  GRiD/div_Buildings - 3D 20071205_18S460440 UNCLA_1bd346'))

WebUI.setText(findTestObject('Object Repository/Page_AT-Vectors  GRiD/input_Display Name_name'), 'Katalon - Vector data')

WebUI.click(findTestObject('Page_AFE  GRiD/div_Cancel    Generate'))

WebUI.waitForElementClickable(findTestObject('Page_AT-Pointcloud  GRiD/button_Download'), 15)

WebUI.click(findTestObject('Object Repository/Page_AT-Vectors  GRiD/button_Download'))

WebUI.closeBrowser()

