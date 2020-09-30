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

'Click on Map from banner.\r\n'
for (def row = 1; row <= findTestData('FG3D Test Data').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Page_Home  GRiD/a_Map'))

    'Reset filters on Map screen.'
    WebUI.click(findTestObject('Page_Map  GRiD/Reset Map Layers'))

    WebUI.click(findTestObject('Page_Map  GRiD/View Pointcloud Data Layer GRiD Map'))

    WebUI.click(findTestObject('Page_Map  GRiD/Filter Pointcloud Data GRiD Map'))

    WebUI.click(findTestObject('Page_Map  GRiD/span_ALIRT'))

    WebUI.click(findTestObject('Page_Map  GRiD/span_LIDAR Pointcloud'))

    WebUI.click(findTestObject('Page_Map  GRiD/Apply Data Layer Filter'))

    WebUI.setText(findTestObject('Page_Map  GRiD/Map Search'), findTestData('GRiD Map Export/GRiD Map Export').getValue(
            'map-search', row))

    WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_ALIRT PC (AOI)'))

    WebUI.click(findTestObject('Page_Map  GRiD/Program Data to Export Within AOI Modal'))

    WebUI.click(findTestObject('Page_Map  GRiD/Export Button AOI Modal'))

    WebUI.setText(findTestObject('Page_Map  GRiD/Export Name AOI Modal'), findTestData('GRiD Map Export/GRiD Map Export').getValue(
            'id_name', row))

    WebUI.click(findTestObject('Page_Map  GRiD/Finish Export AOI Modal'))
}

