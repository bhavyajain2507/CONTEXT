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

WebUI.callTestCase(findTestCase('Dashboard/DR admin user rediret to article listing'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sidebar/Sidebar menu'))

WebUI.click(findTestObject('Sidebar/Presentations menu'))

WebUI.click(findTestObject('Presentations/Create presentation button'))

WebUI.click(findTestObject('Presentations/Layout 1 click'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Article/Templates menu button'))

WebUI.click(findTestObject('Presentations/Templates sidebar/Text slide'))

WebUI.click(findTestObject('Presentations/Templates sidebar/Split screen 1 slide'))

WebUI.click(findTestObject('Presentations/Templates sidebar/Split screen 2 slide'))

WebUI.click(findTestObject('Presentations/Templates sidebar/Content boxes slide'))

WebUI.click(findTestObject('Presentations/Templates sidebar/Media slide'))

WebUI.click(findTestObject('Presentations/Templates sidebar/Active slides tab'))

WebUI.verifyElementPresent(findTestObject('Presentations/Templates sidebar/Active slides added templates/Text slide'), 0)

WebUI.verifyElementPresent(findTestObject('Presentations/Templates sidebar/Active slides added templates/Split screen 1 slide'), 0)

WebUI.verifyElementPresent(findTestObject('Presentations/Templates sidebar/Active slides added templates/Split screen 2 slide'), 0)

WebUI.verifyElementPresent(findTestObject('Presentations/Templates sidebar/Active slides added templates/Content boxes slide'), 0)

WebUI.verifyElementPresent(findTestObject('Presentations/Templates sidebar/Active slides added templates/Media slide'), 0)

