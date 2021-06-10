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

WebUI.callTestCase(findTestCase('Forms/TC_5 Check that click on create Form button redirects to create view of form'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/title text'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Input field_name'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Email field'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Link text'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Message box'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Contact input box'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Dropdown'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Radio buttons'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Checkboxes'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Button_form'), findTestObject('Forms/draggable area'))

WebUI.dragAndDropToObject(findTestObject('Forms/Drag components/Terms and conditions'), findTestObject('Forms/draggable area'))

