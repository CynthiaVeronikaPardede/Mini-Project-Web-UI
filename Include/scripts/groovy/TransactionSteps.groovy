import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class TransactionSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user navigate login page")
	def I_want_to_write_a_step_with_name() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')

		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))
	}

	@When("user enter (.*) email and (.*) password valid")
	def I_check_for_the_value_in_step(String email, String password) {
		WebUI.setText(findTestObject('Login Alta/Page_frontend-web/input_Email_input-18'), email)
		WebUI.setText(findTestObject('Object Repository/Login Alta/Page_frontend-web/input_Password_input-21'), password)
	}

	@And("user click buttom to login")
	def UserClickButtomToLogin() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/span_Login'))
	}

	@And("User click buttom Beli")
	def UserClickButtomBeli() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/button_Beli'))
	}

	@And("User click icon card")
	def UserClickIconCard() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
	}

	@And("User click button Bayar")
	def UserClickButtonBayar() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/button_Bayar'))
	}

	@Then("User verify Transaction success")
	def UserVerifyTransactionSuccess() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/h3_AltaShop'))

		WebUI.closeBrowser()
	}


	@When("user enter (.*) email and (.*) password with valid")
	def UserInputEmailPasswordWithValid(String email, String password) {
		println("Enter Item")
		WebUI.setText(findTestObject('Login Alta/Page_frontend-web/input_Email_input-18'), email)
		WebUI.setText(findTestObject('Object Repository/Login Alta/Page_frontend-web/input_Password_input-21'), password)
	}

	@And("user click buttom login")
	def UserClickButtomLogin() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/span_Login'))
	}

	@And("User click buttom Beli to buy")
	def UserClickButtomBeliToBuy() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/button_Beli'))
	}

	@And("User click icon card to add")
	def UserClickIconCardToAdd() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
	}

	@And("User click to icon to reduce item")
	def UserClickToreduceItem() {
		WebUI.click(findTestObject('Object Repository/Transaction/transactionNegatif/Page_frontend-web/span_-'))
	}

	@Then("User verify Transaction failed")
	def UserVerifyTransactionFailed() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_frontend-web/h3_AltaShop'))

		WebUI.closeBrowser()
	}
}