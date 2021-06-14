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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login Test cases/Superadmin login - Redirect to article listing page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sidebar/Sidebar menu'))

WebUI.scrollToElement(findTestObject('Sidebar/Login as'), 0)

WebUI.click(findTestObject('Sidebar/Login as'))

WebUI.setText(findTestObject('Login as/search bar'), 'yuvraj singh')

WebUI.click(findTestObject('Login as/Row_click_login as'))

WebUI.click(findTestObject('Sidebar/Sidebar menu'))

WebUI.click(findTestObject('Sidebar/Sections menu'))

WebUI.click(findTestObject('Sections/Create section_button'))

WebUI.click(findTestObject('Article/Article - section title layout_select'))

WebUI.click(findTestObject('Sections/overlay_section'))

WebUI.verifyTextPresent('For', false)
