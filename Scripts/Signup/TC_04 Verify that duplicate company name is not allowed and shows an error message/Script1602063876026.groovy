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

WebUI.callTestCase(findTestCase('Signup/TC_01 Check for the accessibility of signup page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Signup/Name_input field'), 'Sameer')

WebUI.setText(findTestObject('Signup/Email_input field'), 'sameer@gmaill.com')

WebUI.setText(findTestObject('Signup/company_input field'), 'zomato')

WebUI.setText(findTestObject('Signup/password_input field'), 'hrishi5454')

WebUI.selectOptionByValue(findTestObject('Signup/Packages_click dropdown'), '5', false)

WebUI.check(findTestObject('Signup/Checkbox_signup page'))

WebUI.click(findTestObject('Signup/Signup_button'))

WebUI.verifyElementText(findTestObject('Signup/company_error message field'), 'Dette firmanavnet finnes fra før.')

