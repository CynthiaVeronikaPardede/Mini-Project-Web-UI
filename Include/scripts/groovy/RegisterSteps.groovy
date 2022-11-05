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



class RegisterSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user navigated to register page")
	def nagivateToRegisterPage() {
		println("I am inside nagivateToRegisterPage ")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')
	}

	@When("user input (.*) and (.*) and also (.*)")
	def enterEmptyFullnameCredentials(String fullname, String email, String password) {
		println ("\n I am inside enterCredentials")
		println("fullname: "+fullname)
		println("email : "+email)
		println("Password : "+password)
		WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Nama Lengkap'), fullname)
		WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Email'), email)
		WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Password'), password)
	}

	@And("user click register button")
	def clickLogin() {
		println("\n I am inside clickregister")
		WebUI.click(findTestObject('Auth/Register/span_Register'))
	}

	@Then("verifying condition for valid")
	def verifyHomePage() {
		println("\n system verifying validation message")
		WebUI.click(findTestObject('Object Repository/authterbaru/Page_frontend-web/h3_AltaShop'))
	}

	@When("user enter (.*) and (.*) and also (.*) with invalid")
	def UserEnterFullnameEmailPassword(String fullname, String email, String password) {
		println ("\n I am inside enterCredentials")
		println("fullname: "+fullname)
		println("email : "+email)
		println("Password : "+password)
		WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Nama Lengkap'), fullname)
		WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Email'), email)
		WebUI.setText(findTestObject('Object Repository/Auth/Register/input_Password'), password)
	}

	@And("user click register button to register")
	def UserClickRegisterButtom() {
		println("\n I am inside clickregister")
		WebUI.click(findTestObject('Auth/Register/span_Register'))
	}

	@Then("verify condition for valid")
	def VerifyConditionForValid() {
		println("\n system verifying validation message")
		WebUI.click(findTestObject('Object Repository/authterbaru/Page_frontend-web/h3_AltaShop'))
	}
}