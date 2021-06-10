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

WebUI.callTestCase(findTestCase('Users/Superadmin/TC_33 Verify that it opens create user page on click of create user button from user listing for superadmin'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Users/profile image user'), 'D:\\Katalon image upload\\image0.jpg')

WebUI.setText(findTestObject('Users/firstname_userprofile'), 'Gautam')

WebUI.setText(findTestObject('Users/lastname_userporfile'), 'Gambhir')

WebUI.setText(findTestObject('Users/username_userprofile'), 'Gautam')

WebUI.click(findTestObject('Users/Company dropdown'))

WebUI.click(findTestObject('Users/dream 11 company_dropdown'))

WebUI.click(findTestObject('Users/Click brand dropdown_userprofile'))

WebUI.check(findTestObject('Users/brand select checkbox_userporfile'))

WebUI.click(findTestObject('Users/brand dropdown close_userprofile'))

WebUI.setText(findTestObject('Users/email_userprofile'), 'gautamgambhir@test.com')

WebUI.setText(findTestObject('Users/input_Mobile_userprofile'), '9988776655')

WebUI.setText(findTestObject('Users/address_userprofile'), 'test adress')

WebUI.click(findTestObject('Users/savebutton_userprofile'))

