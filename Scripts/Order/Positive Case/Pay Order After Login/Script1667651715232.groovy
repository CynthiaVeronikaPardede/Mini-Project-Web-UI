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

WebUI.callTestCase(findTestCase('Order/Positive Case/View Chart after login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_Bayar'))

//WebUI.click(findTestObject('Object Repository/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174'))
//
//WebUI.click(findTestObject('Object Repository/Page_frontend-web/td_No data available'))
//
//WebUI.click(findTestObject('Object Repository/Page_frontend-web/div_TransactionsProdukHargaBanyaknyaSub-tot_58c0be'))
//
//WebUI.doubleClick(findTestObject('Object Repository/Page_frontend-web/td_No data available'))
//
//
//WebUI.click(findTestObject('Object Repository/Page_frontend-web/td_No data available'))
//WebUI.click(findTestObject('Object Repository/Page_frontend-web/td_No data available'))
//WebUI.verifyElementText(findTestObject('Object Repository/Page_frontend-web/td_No data available'), 'No data available')

WebUI.click(findTestObject('Object Repository/Page_frontend-web/span_0'))
WebUI.verifyElementText(findTestObject('Object Repository/Page_frontend-web/div_Order is empty'), 'Order is empty!')
