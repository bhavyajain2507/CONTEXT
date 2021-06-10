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

WebUI.callTestCase(findTestCase('Login Test cases/Superadmin login - Redirect to article listing page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sidebar/Sidebar menu'))

WebUI.click(findTestObject('Sidebar/Companies menu'))

WebUI.setText(findTestObject('Company/Search_company'), 'Dream 11')

WebUI.click(findTestObject('Company/Row_company_click'))

WebUI.click(findTestObject('Company/Brands tab_company'))

WebUI.click(findTestObject('Company/Create brand_btn_company'))

WebUI.uploadFile(findTestObject('Brands/upload_logo_brand'), 'D:\\Katalon image upload\\image3.jpg')

WebUI.setText(findTestObject('Brands/Brand name field'), 'brand 3')

WebUI.delay(2)

WebUI.click(findTestObject('Brands/Save brand_btn'))

