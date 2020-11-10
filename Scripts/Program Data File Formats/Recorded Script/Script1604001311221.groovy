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

WebUI.navigateToUrl('https://grid.nga.mil/')

WebUI.click(findTestObject('Page_Home  GRiD/a_CAC  GEOAxIS Login'))

WebUI.click(findTestObject('Page_GEOAxIS/a_PKI Certificate'))

WebUI.click(findTestObject('Page_GEOAxIS/span_Click here to continue'))

WebUI.click(findTestObject('Page_Home  GRiD/a_Map'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Reset All'))

WebUI.click(findTestObject('Page_Map  GRiD/Pointclouds Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Elevation Models Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Imagery Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Vectors Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Pointclouds Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Elevation Models Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Imagery Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Vectors Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Pointclouds filter'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_ALIRT'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_BuckEye'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_FEMA'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_NAVFAC'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_NGA Geomatics Terrestrial'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_NOAA Digital Coast'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_US Cities'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_USACE'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_USAF Geobase'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_USGS'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_USMC GEOFidelis'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Vricon'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_PC'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_PC - Gridded (GRD)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_PC - Height Above Ground (HAG)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_PC - First Return'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_PC - Filtered (FLT)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Pointclouds_svg-inline--fa fa-filter fa_82c8fb'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_ALIRT'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_ALIRT'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DTED0'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DTED1'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DTED2'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_FEMA'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_GMTED075'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_GMTED150'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_GMTED300'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_NAVFAC'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_SRT1F'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_SRT2F'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_TERRAFORM'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_TanDEM-X Final'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_TanDEM-X Raw'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_TanDEM-X Temporary'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_TanDEM-X Temporary DTED1'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_TanDEM-X Temporary DTED2'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DSM - Breakline'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DSM - Discrete'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DSM - Maximum'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DSM - Mean'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DSM - Median'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DSM - Minimum'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DSM'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DTM'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Elevation Models_svg-inline--fa fa-filt_844ba3'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Color Infrared (CIR)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_EO - Georeferenced'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_EO - Georeferenced (4 Band)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_EO - Georeferenced (5 Band)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_EO - Orthorectified'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_EO - Orthorectified (4 Band)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_EO - Orthorectified (5 Band)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Intensity'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Intensity (3 Band)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Imagery_svg-inline--fa fa-filter fa-w-1_926b4a'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Buildings - 2D'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Buildings - 3D'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Forests'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Trees'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'alirt')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_ALIRT (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'artemis')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Artemis (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Artemis eo')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Artemis EO (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'buckeye')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Buckeye (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Buckeye eo 4b')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Buckeye EO 4B (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Buckeye EO 5B')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Buckeye EO 5B (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Buckeye int 3b')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Buckeye Int 3B (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'dted0')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_DTED0 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'DTED1')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_DTED1 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'DTED2')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_DTED2 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Dem-dged')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_DEM-DGED (AOI)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/div_Locations          Search All Locations_535332'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'fema')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_FEMA (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'gmted075')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_GMTED075 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'GMTED150')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_GMTED150 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'GMTED300')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_GMTED300 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'haloe')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_HALOE (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'icp')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_ICP (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'machete')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Machete (AOI)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/div_Locations          Search All Locations_535332'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'navfac')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_NAVFAC (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Nga geomatics')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_NGA Geomatics (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Noaa digital coast')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_NOAA Digital Coast (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'global')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Global (AOI)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/div_Locations          Search All Locations_535332'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'tdf')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_TDF (AOI)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/div_Locations          Search All Locations_535332'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'tdr')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_TDR (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'tdx dted1')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_TDX DTED1 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'TDX DTED 2')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_TDX DTED 2 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'us cities 1')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_US Cities 1 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'us cities 2')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_US Cities 2 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'usace')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 1')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 1 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 2')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 2 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 3')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 3 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 4')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 4 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 5')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 5 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 6')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 6 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 7')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 7 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 8')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 8 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 9')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 9 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 10')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 10 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 11')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 11 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 12')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 12 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 13')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 13 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USACE 14')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USACE 14 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USAf geobase')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USAF Geobase (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USAF Geobase 1')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USAF Geobase 1 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USAF Geobase 2')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USAF Geobase 2 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USAF Geobase 3')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USAF Geobase 3 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USgs')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USGS (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USGS 1')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USGS 1 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USGS 2')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USGS 2 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USGS 3')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USGS 3 (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'usmc geofidelis')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USMC GEOFidelis (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'USMC GEOFidelis 2')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_USMC GEOFidelis 2 (AOI)'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/div_Locations          Search All Locations_535332_1'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'vricon fvey dsm')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Vricon FVEY DSM (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY-rok dsm')

WebUI.click(findTestObject('Page_Map  GRiD/a_Vricon FVEY-ROK DSM (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon owt-gpr dsm')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Vricon OWT-GPR DSM (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon fvey dtm')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Vricon FVEY DTM (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY-rok dtm')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Vricon FVEY-ROK DTM (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY eo')

WebUI.click(findTestObject('Page_Map  GRiD/a_Vricon FVEY EO (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY-rok eo')

WebUI.click(findTestObject('Page_Map  GRiD/a_Vricon FVEY-ROK EO (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY pc')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Vricon FVEY PC (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY-rok pc')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Vricon FVEY-ROK PC (AOI)'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY-ROK PC')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Elevation Models_svg-inline--fa fa-chec_398967'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.click(findTestObject('Page_Map  GRiD/Elevation Models Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Reset All'))

WebUI.click(findTestObject('Page_Map  GRiD/path'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Vricon'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/path_1'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Reset All'))

WebUI.click(findTestObject('Page_Map  GRiD/Pointclouds Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/Pointclouds filter'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Vricon'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_PC'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Vricon FVEY-ROK PC (AOI)_1'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Selection area or layers have been mo_90fb99'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Export'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Export Name_name'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/div_Export Name'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Export Name_name'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Export Name_name'), '12')

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Pointcloud File Format'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Pointcloud File Format'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Pointcloud File Format'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Pointcloud File Format'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Pointcloud File Format'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Pointcloud File Format'), 
    '15', true)

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Editing Selection_svg-inline--fa fa-tim_7621d1'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Reset All'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Pointclouds_svg-inline--fa fa-filter fa_82c8fb'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Vricon'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_DSM'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY dsm')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Vricon FVEY DSM (AOI)_1'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'Vricon FVEY DSM')

WebUI.click(findTestObject('Page_Map  GRiD/Elevation Models Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Selection area or layers have been mo_90fb99'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Export'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Export Name_name'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Export Name_name'), '12')

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/EM_Imagery File Format'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/EM_Imagery File Format'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/EM_Imagery File Format'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Editing Selection_svg-inline--fa fa-tim_7621d1'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Reset All'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Imagery_svg-inline--fa fa-filter fa-w-1_926b4a'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_US Cities'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Buildings - 2D'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'us cities 1')

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_US Cities 1 (AOI)_1'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'), 'US Cities 1')

WebUI.click(findTestObject('Page_Map  GRiD/Vectors Data Layer'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Selection area or layers have been mo_90fb99'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Export'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Export Name_name'), '13')

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Vector File Format'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Vector File Format'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Vector File Format'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Vector File Format'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Vector File Format'), 
    '13', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Vector File Format'), 
    '14', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/Vector File Format'), 
    '15', true)

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/svg_Editing Selection_svg-inline--fa fa-tim_7621d1'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Reset All'))

WebUI.click(findTestObject('Page_Map  GRiD/Imagery Data Layer'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/path_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_US Cities'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/span_Intensity'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_Apply Filter'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Search Vectors_map-search'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/a_US Cities 1 (AOI)_1_2'))

WebUI.click(findTestObject('Page_Map  GRiD/input_Selection area or layers have been mo_90fb99'))

WebUI.click(findTestObject('Page_Map  GRiD/span_Export'))

WebUI.click(findTestObject('Object Repository/Page_Map  GRiD/div_Export Name_col-10'))

WebUI.setText(findTestObject('Page_Map  GRiD/input_Export Name_name'), '14')

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/EM_Imagery File Format'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/EM_Imagery File Format'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Page_Map  GRiD/EM_Imagery File Format'), 
    '7', true)

WebUI.click(findTestObject('Page_Map  GRiD/button_Finish'))

WebUI.closeBrowser()

