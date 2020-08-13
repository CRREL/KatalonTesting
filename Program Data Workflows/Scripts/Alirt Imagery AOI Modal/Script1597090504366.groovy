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

WebUI.click(findTestObject('Page_Home  GRiD/Map Button GRiD Home Page'))

WebUI.click(findTestObject('Page_Map  GRiD/Reset Map Layers'))

WebUI.click(findTestObject('Page_Map  GRiD/View Imagery Data Layer GRiD Map'))

WebUI.click(findTestObject('Page_Map  GRiD/Filter Imagery Data Layer GRiD Map'))

WebUI.click(findTestObject('Page_Map  GRiD/span_ALIRT'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Intensity Image'))

WebUI.click(findTestObject('Page_Map  GRiD/Apply Data Layer Filter'))

WebUI.setText(findTestObject('Page_Map  GRiD/Map Search'), 'alirt pc')

WebUI.click(findTestObject('Page_Map  GRiD/a_ALIRT PC (AOI)'))

WebUI.click(findTestObject('Page_Map  GRiD/Program Data to Export Within AOI Modal'))

WebUI.click(findTestObject('Page_Map  GRiD/Export Button AOI Modal'))

WebUI.setText(findTestObject('Page_Map  GRiD/Export Name AOI Modal'), 'Alirt Imagery AOI Modal Katalon')

WebUI.click(findTestObject('Page_Map  GRiD/Finish Export AOI Modal'))

