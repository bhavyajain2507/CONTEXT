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

WebUI.click(findTestObject('Article listing page/Boligkanalen tab'))

WebUI.setText(findTestObject('Article listing page/Search_article listing'), 'Article 1')

WebUI.click(findTestObject('Article listing page/chicken menu -small screen'))

WebUI.click(findTestObject('Article listing page/Copy button - article'))

WebUI.click(findTestObject('Copy articles/Yes btn_copy pop up'))

WebUI.delay(1)

WebUI.click(findTestObject('Copy articles/Edit article_on success msg'))

WebUI.delay(5)

WebUI.click(findTestObject('Article/Swap_title section'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Article/Swap default title section'))

WebUI.setText(findTestObject('Article/Article title_header'), '212212')

WebUI.scrollToElement(findTestObject('Article/scroll to added sections/Text section'), 0)

WebUI.setText(findTestObject('Copy articles/Text section edit'), '424234324 324234 23423 4234234')

