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

WebUI.callTestCase(findTestCase('Company/TC_5 Verify if create company button redirects to Company profile page'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Company/Name field_company'), 'my company 1')

WebUI.setText(findTestObject('Company/Domain field_company'), 'testdomain')

WebUI.setText(findTestObject('Company/Website Url field_company'), 'www.google.com', FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Company/Font setting_toggle_company'))

WebUI.check(findTestObject('toggles company/Page_Boligkanalen Admin/span_Stop Welcome Email_slider round'))

WebUI.check(findTestObject('toggles company/Page_Boligkanalen Admin/cpy settings_draft'))

WebUI.check(findTestObject('toggles company/Page_Boligkanalen Admin/Cpy settings_publish'))

WebUI.check(findTestObject('toggles company/Page_Boligkanalen Admin/span_Display article ratings and reviews_slider round'))

WebUI.setText(findTestObject('Company/Meta title field_company'), 'My meta data')

WebUI.setText(findTestObject('Company/Meta description field_company'), 'My meta description')

WebUI.uploadFile(findTestObject('Company/Meta img upload_company'), 'D:\\Katalon image upload\\image2.jpg')

