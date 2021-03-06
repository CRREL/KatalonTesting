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

WebUI.click(findTestObject('Page_Home  GRiD/a_Share'))

WebUI.click(findTestObject('Page_Workgroups  GRiD/a_FG3D'))

//for (def row = 1; row <= findTestData('FG3D Test Data').getRowNumbers(); row++) {
Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/Page_FG3D  GRiD/button_AOI Options'))

WebUI.click(findTestObject('Object Repository/Page_FG3D  GRiD/a_View on map'))

WebUI.closeWindowIndex('0')

Thread.sleep(500)

WebUI.switchToWindowTitle('Map – GRiD')

WebUI.click(findTestObject('Page_Map  GRiD/input_Selection area or layers have been mo_90fb99'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Export'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Export Name_name'), id_name)

WebUI.selectOptionByLabel(findTestObject('Page_Map  GRiD/select_GeoTiff  GeoPackage  ERDAS Imagine  --- No Output ---'), 
    id_imagery, true)

WebUI.selectOptionByLabel(findTestObject('Page_Map  GRiD/select_GeoTiff  GeoPackage  DTED  --- No Output ---'), id_elevation, 
    true)

WebUI.selectOptionByLabel(findTestObject('Page_Map  GRiD/select_ESRI Shapefile  GeoPackage  KML  ESRI File Geodatabase  --- No Output ---'), 
    id_vectors, true)

WebUI.selectOptionByLabel(findTestObject('Page_Map  GRiD/select_OpenFlight  Collada  KMZ  GLB  FBX  _469f7c'), id_models, 
    true)

WebUI.click(findTestObject('Page_Map  GRiD/button_Finish'))

WebUI.verifyElementText(findTestObject('Page_FG3D  GRiD/td_T- FG3D CADRG - --- No Output --- - --- No Output --- - --- No Output --- - 16'), 
    id_name)

