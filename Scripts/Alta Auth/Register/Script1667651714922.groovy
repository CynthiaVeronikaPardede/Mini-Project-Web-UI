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

WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')

WebUI.click(findTestObject('Auth/Register/Page_frontend-web/button_Register'))

valueFullName = WebUI.getText(findTestObject('Auth/Register/input_Nama Lengkap'))

valueEmail = WebUI.getText(findTestObject('Auth/Register/input_Email'))

valuePassword = WebUI.getText(findTestObject('Auth/Register/input_Password'))

if (((valueFullName == '') && (valueEmail == '')) && (valuePassword == '')) {
    WebUI.verifyElementText(findTestObject('Object Repository/Login Alta/Page_frontend-web/div_email is required'), 'email is required')
}

WebUI.setText(findTestObject('Auth/Register/input_Nama Lengkap'), 'Rara')

WebUI.click(findTestObject('Auth/Register/Page_frontend-web/button_Register'))

if (((valueFullName != '') && (valueEmail == '')) && (valuePassword == '')) {
    WebUI.verifyElementText(findTestObject('Object Repository/Login Alta/Page_frontend-web/div_password is required'), 'email is required')
}

WebUI.setText(findTestObject('Auth/Register/input_Email'), 'rara@gmail.com')

WebUI.click(findTestObject('Auth/Register/Page_frontend-web/button_Register'))

if (((valueFullName != '') && (valueEmail != '')) && (valuePassword == '')) {
    WebUI.verifyElementText(findTestObject('Object Repository/Login Alta/Page_frontend-web/div_password is required'), 'password is required')
}


WebUI.setText(findTestObject('Auth/Register/input_Password'), 'password')

if (((valueFullName != '') && (valueEmail != '')) && (valuePassword != '')) {
    WebUI.verifyElementText(findTestObject('Object Repository/Login Alta/Page_frontend-web/div_password is required'), 'password is required')
}

WebUI.click(findTestObject('Auth/Register/Page_frontend-web/button_Register'))

WebUI.verifyElementVisible(findTestObject('Login Alta/Page_frontend-web/button_Login'), FailureHandling.STOP_ON_FAILURE)

