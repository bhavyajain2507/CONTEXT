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

WebUI.callTestCase(findTestCase('DR users/Dr sections/TC_2 sec Check that selected title layout is displayed on the screen'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Article/Templates/Text template'))

WebUI.setText(findTestObject('DR sections/Input field_name_section'), 'section publish')

WebUI.check(findTestObject('DR sections/checkbox article_sidebar'))

WebUI.click(findTestObject('DR sections/save button section_sidebar'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('DR sections/Publish btn_section'), 0)

WebUI.click(findTestObject('DR sections/Publish btn_section'))

WebUI.delay(2)

WebUI.click(findTestObject('DR sections/button Add to my section'))

WebUI.scrollToElement(findTestObject('DR sections/Input field_section url'), 0)

WebUI.verifyElementHasAttribute(findTestObject('DR sections/Input field_section url'), 'disabled', 0)

