import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/mk/mm0g76rn3_g5zzg111wvxf540000gn/T/Katalon/20200625_161947/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://grid.nga.mil/grid/\')\n\nWebUI.click(findTestObject(\'Page_Home  GRiD/a_GEOAxIS\'))\n\nWebUI.click(findTestObject(\'Page_GEOAxIS/a_PKI Certificate\'))\n\nWebUI.click(findTestObject(\'Page_GEOAxIS/span_Click here to continue\'))\n\nWebUI.check(findTestObject(\'Page_Home  GRiD/a_Settings bhavikpatel\'))\n\nWebUI.click(findTestObject(\'Page_Home  GRiD/a_Settings bhavikpatel\'))\n\nWebUI.click(findTestObject(\'Page_Home  GRiD/a_Account settings\'))\n\nWebUI.click(findTestObject(\'Page_Account Settings  GRiD/a_Change Email\'))\n\nWebUI.click(findTestObject(\'Page_Account Settings  GRiD/a_Change Password\'))\n\nWebUI.click(findTestObject(\'Page_Account Settings  GRiD/div_WARNING When you log in with your usern_0db060\'))\n\nWebUI.click(findTestObject(\'Page_Account Settings  GRiD/a_Subscriptions\'))\n\nWebUI.click(findTestObject(\'Page_Account Settings  GRiD/a_Permissions\'))\n\nWebUI.click(findTestObject(\'Page_Permission requests  GRiD/a_Data Access Agreements\'))\n\nWebUI.click(findTestObject(\'Page_Data Access Agreements  GRiD/img_Map_brand\'))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

