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

CustomKeywords.'com.masoko.d.OpenBrowser'()

WebUI.navigateToUrl('https://www.masoko.com/')

WebUI.click(findTestObject('Checkout/Page_Shop Online in Kenya - Pay Con/p_Sign In'))

WebUI.setText(findTestObject('Checkout/Page_Customer Login/input_loginusername'), 'mwathambugua@gmail.com')

WebUI.setText(findTestObject('Checkout/Page_Customer Login/input_loginpassword'), '@12Becky00-')

WebUI.click(findTestObject('Checkout/Page_Customer Login/button_Sign In'))

WebUI.click(findTestObject('Checkout/Page_Shop Online in Kenya - Pay Con/img_promo-image__image eagerlo'))

WebUI.click(findTestObject('Checkout/Page_Tomatoes 1 Kg Pack - Vegetable/button_Add to Cart'))

WebUI.click(findTestObject('Checkout/Page_Tomatoes 1 Kg Pack - Vegetable/a_My Cart'))

WebUI.click(findTestObject('Checkout/Page_Tomatoes 1 Kg Pack - Vegetable/button_Go to Checkout'))

WebUI.click(findTestObject('Checkout/Page_Checkout/html_.pac-containerbackground-'))

WebUI.click(findTestObject('Checkout/Page_Checkout/button_Place Order'))

WebUI.verifyElementPresent(findTestObject('Checkout/Page_Checkout/div_The balance is insufficien'), 0)

WebUI.closeBrowser()

