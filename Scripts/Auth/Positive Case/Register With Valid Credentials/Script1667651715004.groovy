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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alta-shop.vercel.app/')

WebUI.click(findTestObject('Auth/Register/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))

WebUI.click(findTestObject('Object Repository/Auth/Register/a_Register'))

WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Nama Lengkap'), fullname)

WebUI.click(findTestObject('Object Repository/Auth/Register/div_Email'))

WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Email'), email)

WebUI.click(findTestObject('Object Repository/Auth/Register/div_Password'))

WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Password'), password)

WebUI.click(findTestObject('Auth/Register/span_Register'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Transaction/Page_frontend-web/h3_AltaShop'))

