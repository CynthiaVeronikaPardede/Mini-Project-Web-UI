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

WebUI.callTestCase(findTestCase('Precondition/Login as Precondition'), [('email') : 'desianna@gmail.com', ('password') : 'password'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_Beli'))

WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_AltaShop_v-btn__content'))

WebUI.click(findTestObject('Object Repository/Page_frontend-web/div_AltaShop3'))

WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_3'))

WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_'))

WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_'))

WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_frontend-web/div_Total Qty'), 'Total Qty')

WebUI.verifyElementText(findTestObject('Object Repository/Page_frontend-web/div_Total Bayar'), 'Total Bayar')

