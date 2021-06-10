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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://supercontent-tmp-staging.azurewebsites.net//Dream11/form-test')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Forms/Drag components/Input field_name'), 'Hrishikesh')

WebUI.setText(findTestObject('Forms/Drag components/Email field'), 'hrishikesh.shirsat@kilowott.com')

WebUI.check(findTestObject('Forms/Checkbox_msgbox_in article'))

WebUI.setText(findTestObject('Forms/txt area_Msgbox'), 'My test text 12345')

WebUI.check(findTestObject('Forms/Radio btn select_form'))

WebUI.check(findTestObject('Forms/Checkbox select_form'))

WebUI.setText(findTestObject('Forms/Tel_input_form'), '0123456789')

WebUI.setText(findTestObject('Forms/Post_input_form'), '403401')

WebUI.selectOptionByValue(findTestObject('Forms/Dropdown select'), 'Option 2', false)

WebUI.check(findTestObject('Forms/Drag components/Terms and conditions'))

WebUI.click(findTestObject('Forms/Drag components/Button_form'))

