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

WebUI.callTestCase(findTestCase('DR users/TC_8 Check create mode shows Report on top menu bar if report radio button is selected'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Article/Category checkbox'))

WebUI.click(findTestObject('Article/Article overlay'))

WebUI.setText(findTestObject('Article/Article title_header'), 'Report 3')

WebUI.delay(4)

WebUI.click(findTestObject('Article/Publish button - Article'))

WebUI.delay(2)

WebUI.check(findTestObject('DR user/Checkbox_Authenticate report'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Publish pop up/Publish btn_pop up'))

