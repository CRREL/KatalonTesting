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

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_Share'))

WebUI.click(findTestObject('Object Repository/Page_Workgroups  GRiD/a_AFE'))

WebUI.click(findTestObject('Page_AFE  GRiD/a_Export pointcloud data'))

WebUI.click(findTestObject('Object Repository/Page_AFE  GRiD/div_PC 20190623_18T577450 UNCLASSIFIEDFOUO _33ce5f'))

WebUI.click(findTestObject('Object Repository/Page_AFE  GRiD/svg_Filters_svg-inline--fa fa-caret-right f_d4bc64'))

WebUI.click(findTestObject('Page_AFE  GRiD/input_Feature Extraction_filter_afe'))

WebUI.selectOptionByValue(findTestObject('Page_AFE  GRiD/select_TexPert 315-1  PSU 170  SRI 15'), 'psu_1.7.0;', true)

WebUI.selectOptionByValue(findTestObject('Page_AFE  GRiD/select_TexPert 315-1  PSU 170  SRI 15'), 'texpert_3.1.5-1;', true)

WebUI.selectOptionByValue(findTestObject('Page_AFE  GRiD/select_TexPert 315-1  PSU 170  SRI 15'), 'sri_1.5;', true)

WebUI.click(findTestObject('Object Repository/Page_AFE  GRiD/input_BETA_ascend_output'))

WebUI.click(findTestObject('Object Repository/Page_AFE  GRiD/input_CDB_ascend_output'))

WebUI.click(findTestObject('Object Repository/Page_AFE  GRiD/input_Unity_ascend_output'))

WebUI.click(findTestObject('Object Repository/Page_AFE  GRiD/input_VBS3_ascend_output'))

WebUI.click(findTestObject('Object Repository/Page_AFE  GRiD/input_Unreal_ascend_output'))

WebUI.closeBrowser()

