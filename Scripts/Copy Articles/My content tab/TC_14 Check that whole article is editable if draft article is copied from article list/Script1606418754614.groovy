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

WebUI.click(findTestObject('Article listing page/My company tab'))

WebUI.setText(findTestObject('Article listing page/Search_article listing'), 'draft article')

WebUI.delay(2)

WebUI.click(findTestObject('Article listing page/chicken menu -small screen'))

WebUI.click(findTestObject('Article listing page/Copy button - article'))

WebUI.delay(4)

WebUI.click(findTestObject('Article listing page/My content tab'))

WebUI.setText(findTestObject('Article listing page/Search_article listing'), 'draft article')

WebUI.delay(2)

WebUI.click(findTestObject('Article listing page/Row- article click 1'))

WebUI.scrollToElement(findTestObject('Article/Templates/Active sections tab template added/Text section in active section'), 
    0)

WebUI.setText(findTestObject('Copy articles/Text section edit'), 'Section is editable')

WebUI.scrollToElement(findTestObject('Article/Templates/Active sections tab template added/2 column section in active section'), 
    0)

WebUI.click(findTestObject('Copy articles/Click in 2 col section'))

WebUI.setText(findTestObject('Copy articles/2 col section edit'), 'Section is editable')

WebUI.scrollToElement(findTestObject('Article/Templates/Active sections tab template added/2 column scrollmation in active section'), 
    0)

WebUI.setText(findTestObject('Copy articles/2 col scrollmation edit'), 'Section is editable')

WebUI.scrollToElement(findTestObject('Article/Templates/Active sections tab template added/Backgd scrollmation section in active section'), 
    0)

WebUI.setText(findTestObject('Copy articles/bckgd scroll edit'), 'Section is editable')

