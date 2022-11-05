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



class LogoutSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user navigated login page")
	def nagivateToLoginPage() {
		println("I am inside nagivateToLoginPage ")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
		WebUI.click(findTestObject('Object Repository/Auth/Login/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))
	}

	@When("user input (.*) email and (.*) password with valid")
	def EnterInputEmailPassword(String email, String password) {
		println ("\n I am inside enterCredentials")
		println("Username : "+email)
		println("Password : "+password)
		WebUI.setText(findTestObject('Login Alta/Page_frontend-web/input_Email_input-18'), email)
		WebUI.setText(findTestObject('Object Repository/Login Alta/Page_frontend-web/input_Password_input-21'), password)
	}

	@And("user click login button to login")
	def clickLogin() {
		println("\n I am inside clickLogin")
		WebUI.click(findTestObject('Login Alta/Page_frontend-web/button_Login'))
	}

	@And("User click icon logout")
	def UserClickLoginButton() {
		WebUI.click(findTestObject('Object Repository/Auth/Log Out/baru/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))

		WebUI.click(findTestObject('Object Repository/Auth/Log Out/baru/Page_frontend-web/div_Logout'))
	}

	@Then("Verify condition logout")
	def verifyHomePage() {
		println("\n system verifying validation messafe")
		WebUI.click(findTestObject('Object Repository/Auth/Log Out/baru/Page_frontend-web/h3_AltaShop'))

		WebUI.closeBrowser()
	}
}