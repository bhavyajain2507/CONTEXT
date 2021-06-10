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

WebUI.callTestCase(findTestCase('Article creation/TC_01 Verify on click of Create Article button user is redircted to article creation page'), 
    [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.check(findTestObject('Article/Category checkbox'))

WebUI.click(findTestObject('Article/Article overlay'))

WebUI.setText(findTestObject('Article/Article title_header'), 'Article delete 11')

WebUI.click(findTestObject('Article/Templates menu button'))

WebUI.click(findTestObject('Article/Templates/Text template'))

WebUI.click(findTestObject('Article/Save button - Article'))

WebUI.delay(4)

WebUI.click(findTestObject('Article/Publish button - Article'))

WebUI.click(findTestObject('Publish pop up/Publish btn_pop up'))

WebUI.delay(2)

WebUI.click(findTestObject('Delete article/img'))

WebUI.click(findTestObject('Article/Preview button - Article'))

WebUI.verifyTextPresent('Article delete 11', false)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Sidebar/Articles menu'))

WebUI.setText(findTestObject('Article listing page/Search_article listing'), 'Article delete 11')

WebUI.click(findTestObject('Article listing page/chicken menu -small screen'))

WebUI.click(findTestObject('Article listing page/Delete button - article'))

WebUI.click(findTestObject('Article listing page/Delete button - Confirmation pop up'))

WebUI.navigateToUrl('https://supercontent-tmp-staging.azurewebsites.net//Dream11/')

WebUI.verifyTextPresent('Article delete 11', false)

