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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Article creation/TC_14 Verify that content box is added to the section on click of the add media button'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Article/Settings button_content box'))

WebUI.click(findTestObject('Content box/CTA tab'))

WebUI.setText(findTestObject('Content box/CTA_inset text'), '11')

WebUI.setText(findTestObject('Content box/CTA_URL field'), 'https://supercontent-admin-staging.azurewebsites.net/Article/Create')

WebUI.setText(findTestObject('Content box/CTA_input bckg colr'), '#69FFA0')

WebUI.setText(findTestObject('Content box/CTA_font color'), '#FF924A')

WebUI.setText(findTestObject('Content box/CTA_btn name'), 'CTA button 1')

WebUI.click(findTestObject('Content box/CTA_create btn'))

