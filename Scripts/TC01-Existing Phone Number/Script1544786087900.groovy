import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//this is a comment commented too, 
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.masoko.com/')

WebUI.click(findTestObject('Existing Phone Number/Page_Shop Online in Kenya - Pay Con/span_Register'))

WebUI.setText(findTestObject('Existing Phone Number/Page_Create New Customer Account/input_firstname'), 'Franncis ')

WebUI.setText(findTestObject('Existing Phone Number/Page_Create New Customer Account/input_lastname'), 'Masoko')

WebUI.setText(findTestObject('Existing Phone Number/Page_Create New Customer Account/input_mobile'), '+254786941008')

WebUI.setText(findTestObject('Existing Phone Number/Page_Create New Customer Account/input_email'), 'masokotests2@gmail.com')

WebUI.setText(findTestObject('Existing Phone Number/Page_Create New Customer Account/input_password'), '@12Mwatha00-')

WebUI.setText(findTestObject('Existing Phone Number/Page_Create New Customer Account/input_password_confirmation'), '@12Mwatha00-')

WebUI.click(findTestObject('Existing Phone Number/Page_Create New Customer Account/html_var require          base'))

WebUI.click(findTestObject('Existing Phone Number/Page_Create New Customer Account/button_Create an Account'))

WebUI.verifyElementPresent(findTestObject('Existing Phone Number/Page_Create New Customer Account/div_User with such mobile numb'), 
    0)

//comment
WebUI.closeBrowser()
