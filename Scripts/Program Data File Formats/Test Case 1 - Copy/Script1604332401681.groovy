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

WebUI.click(findTestObject('Page_Map  GRiD/Pointclouds Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Pointclouds filter'))

WebUI.click(findTestObject('Page_Map  GRiD/span_ALIRT'))

WebUI.click(findTestObject('Page_Map  GRiD/span_PC'))

WebUI.click(findTestObject('Page_Map  GRiD/a_Apply Filter'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'alirt')

WebUI.click(findTestObject('Page_Map  GRiD/a_ALIRT (AOI)'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Selection area or layers have been mo_90fb99'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Export'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Export Name_name'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Export Name_name'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Map  GRiD/select_BPF  CSV  LAS 12  LAS 14  PDF  Sourc_c9fa4c'), 
    '1', true)

WebUI.click(findTestObject('Page_Map  GRiD/button_Finish'))

