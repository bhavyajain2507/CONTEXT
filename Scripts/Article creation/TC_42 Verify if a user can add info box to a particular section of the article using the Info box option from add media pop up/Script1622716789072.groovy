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

WebUI.click(findTestObject('Content box/Info tab'))

WebUI.setText(findTestObject('Content box/Info insert text'), 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.  The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as oppos')

WebUI.setText(findTestObject('Content box/Info_set bckg color'), '#2155FF')

WebUI.click(findTestObject('Content box/save button_content box'))

