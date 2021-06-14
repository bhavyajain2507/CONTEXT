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

WebUI.callTestCase(findTestCase('DR users/TC_7 Check create mode shows Article on top menu bar if article radio button is selected'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Article/Category checkbox'))

WebUI.click(findTestObject('Article/Article overlay'))

WebUI.click(findTestObject('Article/Templates menu button'))

WebUI.click(findTestObject('Article/Templates/Text template'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Article/Article overlay'))

WebUI.delay(4)

WebUI.click(findTestObject('Article/Add media btn_text section'))

WebUI.click(findTestObject('Article/Settings button_content box'))

WebUI.click(findTestObject('DR user/Reports tab_add media pop up'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('DR user/Boligkanalen tab_Articles_add media pop up'), 0)

