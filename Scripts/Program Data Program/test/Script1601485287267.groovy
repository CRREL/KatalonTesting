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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://grid.nga.mil/testgrid/')

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_CAC  GEOAxIS Login'))

WebUI.click(findTestObject('Page_Home  GRiD/a_Map'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Reset All'))

WebUI.click(findTestObject('Page_Map  GRiD/i_Resume View_jstree-icon jstree-checkbox'))

WebUI.click(findTestObject('Page_Map  GRiD/path'))

WebUI.click(findTestObject('Page_Map  GRiD/span_LIDAR Pointcloud'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.setText(findTestObject('Object Repository/Page_Map  GRiD/input_Search Vectors_map-search'), 'alirt pc')

WebUI.click(findTestObject('Page_Map  GRiD/a_ALIRT PC (AOI)'))

WebUI.setText(findTestObject('Object Repository/Page_Map  GRiD/input_Search Vectors_map-search'), 'ALIRT PC')

