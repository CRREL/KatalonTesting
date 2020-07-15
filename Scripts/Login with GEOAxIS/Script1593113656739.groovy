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

WebUI.navigateToUrl('https://grid.nga.mil/grid/')

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_GEOAxIS'))

WebUI.click(findTestObject('Page_GEOAxIS/a_PKI Certificate'))

WebUI.click(findTestObject('Page_GEOAxIS/span_Click here to continue'))

WebUI.verifyTextPresent('How do I use GRiD?', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home  GRiD/a_Settings bhavikpatel'), 0)

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_Settings bhavikpatel'))

WebUI.click(findTestObject('Object Repository/Page_Home  GRiD/a_Account settings'))

WebUI.click(findTestObject('Object Repository/Page_Account Settings  GRiD/a_Change Email'))

WebUI.click(findTestObject('Object Repository/Page_Account Settings  GRiD/a_Change Password'))

WebUI.click(findTestObject('Object Repository/Page_Account Settings  GRiD/div_WARNING When you log in with your usern_0db060'))

WebUI.click(findTestObject('Object Repository/Page_Account Settings  GRiD/a_Subscriptions'))

WebUI.click(findTestObject('Object Repository/Page_Account Settings  GRiD/a_Permissions'))

WebUI.click(findTestObject('Object Repository/Page_Permission requests  GRiD/a_Data Access Agreements'))

WebUI.click(findTestObject('Object Repository/Page_Data Access Agreements  GRiD/img_Map_brand'))

WebUI.closeBrowser()

