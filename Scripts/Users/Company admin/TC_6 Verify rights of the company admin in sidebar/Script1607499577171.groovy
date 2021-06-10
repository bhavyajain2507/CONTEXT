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

WebUI.click(findTestObject('Sidebar/Sidebar menu'))

WebUI.verifyElementText(findTestObject('Sidebar/Dashboard menu'), 'Dashboard')

WebUI.verifyElementText(findTestObject('Sidebar/Articles menu'), 'Articles')

WebUI.verifyElementText(findTestObject('Sidebar/Blog articles menu'), 'Blog Articles')

WebUI.verifyElementText(findTestObject('Sidebar/Forms menu'), 'Forms')

WebUI.verifyElementText(findTestObject('Sidebar/Sections menu'), 'Sections')

WebUI.verifyElementText(findTestObject('Sidebar/Users menu'), 'Users')

WebUI.verifyElementText(findTestObject('Sidebar/Companies menu'), 'Edit Company')

WebUI.verifyElementText(findTestObject('Sidebar/Brands menu'), 'Brands')

WebUI.verifyElementText(findTestObject('Sidebar/Change password menu'), 'Change Password')

WebUI.verifyElementText(findTestObject('Sidebar/Logout'), 'Logout')

