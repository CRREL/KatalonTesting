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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://grid.nga.mil/grid/')

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_GEOAxIS'))

WebUI.click(findTestObject('Object Repository/Page_GEOAxIS/a_PKI Certificate'))

WebUI.click(findTestObject('Object Repository/Page_GEOAxIS/span_Click here to continue'))

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_Create AOI'))

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_Create From Geo-Coord'))

WebUI.setText(findTestObject('Object Repository/Page_Create Manual AOI  GRiD/input_Name_name'), 'demo2 Auto')

WebUI.click(findTestObject('Object Repository/Page_Create Manual AOI  GRiD/input_Coordinate - Radius_aoi_type'))

WebUI.setText(findTestObject('Object Repository/Page_Create Manual AOI  GRiD/input_Buffer (m)_buffer_radius'), '1000')

WebUI.setText(findTestObject('Object Repository/Page_Create Manual AOI  GRiD/input_Coordinate(s)_geocoords'), '33SUS2843739565')

WebUI.click(findTestObject('Object Repository/Page_Create Manual AOI  GRiD/input_Cancel_submit-export'))

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/a_Export pointcloud data'))

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/input_BuckEye_library'))

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/div_PC 20170629_33S324360 UNCLASSIFIEDFOUO _eabaf5'))

WebUI.setText(findTestObject('Object Repository/Page_demo2 Auto  GRiD/input_Display Name_name'), 'buckeye PointCloud Demo 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_demo2 Auto  GRiD/select_BPF  CSV  LAS 12  LAS 14  PDF'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/div_Cancel    Generate'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/a_buckeye PointCloud Demo 1'))

WebUI.click(findTestObject('Object Repository/Page_buckeye PointCloud Demo 1  GRiD/button_Download'))

WebUI.click(findTestObject('Page_buckeye PointCloud Demo 1  GRiD/a_demo2 Auto'))

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/button_AOI Options'))

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/a_Delete AOI'))

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/a_Delete'))

WebUI.navigateToUrl('https://grid.nga.mil/grid/export/aoi/list/')

WebUI.click(findTestObject('Object Repository/Page_demo2 Auto  GRiD/a_Map'))

WebUI.setText(findTestObject('Object Repository/Page_Map  GRiD/input_Search Collects_map-search'), '33SUS2843739565')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_33SUS2843639564'))

WebUI.setText(findTestObject('Object Repository/Page_Map  GRiD/input_Search Collects_map-search'), '33SUS2843639564')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/i_Resume View_jstree-icon jstree-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/i_Resume View_jstree-icon jstree-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/path'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/canvas_Loading Layers_ol-unselectable'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/canvas_Loading Layers_ol-unselectable'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/canvas_Loading Layers_ol-unselectable'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/canvas_Loading Layers_ol-unselectable'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/input_Selection area or layers have been mo_90fb99'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Export'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/button_Finish'))

