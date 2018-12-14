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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.masoko.com/')

WebUI.click(findTestObject('Registration/Page_Shop Online in Kenya - Pay Con/span_Register'))

WebUI.setText(findTestObject('Registration/Page_Create New Customer Account/input_firstname'), 'Francis')

WebUI.setText(findTestObject('Registration/Page_Create New Customer Account/input_lastname'), 'Masoko')

WebUI.setText(findTestObject('Registration/Page_Create New Customer Account/input_mobile'), '+254799320002')

WebUI.setText(findTestObject('Registration/Page_Create New Customer Account/input_email'), 'masokotests4@safaricom.co.ke')

WebUI.setText(findTestObject('Registration/Page_Create New Customer Account/input_password'), '@12Mwatha00-')

WebUI.setText(findTestObject('Registration/Page_Create New Customer Account/input_password_confirmation'), '@12Mwatha00-')

WebUI.click(findTestObject('Registration/Page_Create New Customer Account/span_Create an Account'))

WebUI.closeBrowser()

