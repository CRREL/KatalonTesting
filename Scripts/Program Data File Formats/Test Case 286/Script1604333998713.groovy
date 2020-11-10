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

WebUI.click(findTestObject('Page_Home  GRiD/a_Map'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Reset All'))

WebUI.click(findTestObject('Page_Map  GRiD/Vectors Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Vectors filter'))

WebUI.click(findTestObject('Page_Map  GRiD/span_US Cities'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Buildings - 2D'))

WebUI.click(findTestObject('Page_Map  GRiD/a_Apply Filter'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'us cities 1')

WebUI.click(findTestObject('Page_Map  GRiD/a_US Cities 1 (AOI)'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Selection area or layers have been mo_90fb99'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Export'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Export Name_name'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Export Name_name'), '286')

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Vector File Format'), '9', true)

WebUI.click(findTestObject('Page_Map  GRiD/button_Finish'))

WebUI.closeBrowser()

