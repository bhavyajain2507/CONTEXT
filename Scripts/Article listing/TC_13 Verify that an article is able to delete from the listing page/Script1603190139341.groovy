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

WebUI.callTestCase(findTestCase('Dashboard/TC_01 Check that Click on Innholdsverktøy on dashboard page redirects to article listing page'), 
    [:], FailureHandling.STOP_ON_FAILURE)

if (true) {
    WebUI.click(findTestObject('Article listing page/chicken menu -small screen'))

    WebUI.click(findTestObject('Article listing page/Delete button - article'))

    WebUI.click(findTestObject('Article listing page/Delete button - Confirmation pop up'))
} else {
    WebUI.click(findTestObject('Article listing page/Delete button - article'))

    WebUI.click(findTestObject('Article listing page/Delete button - Confirmation pop up'))
}

