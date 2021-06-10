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

WebUI.callTestCase(findTestCase('Forgot Password/TC_01 Verify on click of Forgot Password link user is redirected to forgot password page'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Forgot password page/Fogot pass_username or email input'), 'hrishikesh.shirsat@ninestack.com')

WebUI.click(findTestObject('Forgot password page/Forgot pass_submit button'))

WebUI.verifyElementText(findTestObject('Forgot password page/success text_email or username_submit'), 'Vi har sendt deg liten mail med informasjon om hvordan du skal lage deg nytt passord.')

WebUI.delay(3)

WebUI.closeBrowser()

