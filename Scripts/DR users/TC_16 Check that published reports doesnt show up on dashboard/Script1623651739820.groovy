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

WebUI.callTestCase(findTestCase('DR users/TC_8 Check create mode shows Report on top menu bar if report radio button is selected'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Article/Category checkbox'))

WebUI.click(findTestObject('Article/Article overlay'))

WebUI.setText(findTestObject('Article/Article title_header'), 'report 1')

WebUI.click(findTestObject('Article/Save button - Article'))

WebUI.delay(3)

WebUI.click(findTestObject('Article/Publish button - Article'))

WebUI.click(findTestObject('Publish pop up/Publish btn_pop up'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Sidebar/Sidebar menu'))

WebUI.click(findTestObject('Sidebar/Dashboard menu'))

WebUI.delay(1)

WebUI.setText(findTestObject('Dashboard/search_dashboard'), 'report 1')

