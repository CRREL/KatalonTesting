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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.navigateToUrl('https://grid.nga.mil/grid/')

WebUI.click(findTestObject('Page_Home  GRiD/a_GEOAxIS'))

WebUI.click(findTestObject('Page_GEOAxIS/a_PKI Certificate'))

WebUI.click(findTestObject('Page_GEOAxIS/span_Click here to continue'))

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_Share'))

WebUI.click(findTestObject('Object Repository/Page_Workgroups  GRiD/a_FG3D'))

for (def row = 1; row <= findTestData('FG3D Test Data').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Object Repository/Page_FG3D  GRiD/button_AOI Options'))

    WebUI.click(findTestObject('Object Repository/Page_FG3D  GRiD/a_View on map'))

    WebUI.switchToWindowTitle('Map – GRiD')

    WebUI.click(findTestObject('Page_Map  GRiD/input__product_id'))

    WebUI.click(findTestObject('Page_Map  GRiD/span_Export'))

    WebUI.setText(findTestObject('Page_Map  GRiD/input_Export Name_name'), findTestData('New Test Data - Strategic').getValue(
            'id_name', row))

    WebUI.selectOptionByLabel(findTestObject('Page_Map  GRiD/select_GeoTiff  GeoPackage  ERDAS Imagine  --- No Output ---'), 
        findTestData('New Test Data - Strategic').getValue('id_geoint_imagery', row), true)

    WebUI.selectOptionByLabel(findTestObject('Page_Map  GRiD/select_GeoTiff  GeoPackage  DTED  --- No Output ---'), findTestData(
            'New Test Data - Strategic').getValue('id_geoint_elevation', row), true)

    WebUI.selectOptionByLabel(findTestObject('Page_Map  GRiD/select_ESRI Shapefile  GeoPackage  KML  --- No Output ---'), 
        findTestData('New Test Data - Strategic').getValue('id_geoint_vectors', row), true)

    WebUI.click(findTestObject('Page_Map  GRiD/button_Finish'))
}

