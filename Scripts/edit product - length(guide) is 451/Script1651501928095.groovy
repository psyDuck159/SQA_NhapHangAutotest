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

WebUI.navigateToUrl('http://localhost:3000/login')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Username_basic_username'), 'jim')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_React App/input_Password_basic_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Page_React App/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_React App/div_abc'))

WebUI.click(findTestObject('Object Repository/Page_React App/button_Qun l sn phm_ant-btn ant-btn-default'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Cch s dng_basic_guide'), '1cYLdU0kpCdpCeKDdh0wC5lzp8nt67A1KCa6NcUmJDc1M15lwkE1rMrkD6rVQZQ0ZxgwMx7QMTNjoxtg85jkY5xQmG6tgQDsaHlmUdJvbFeODa3sYHLb9s77Ow7wirxfITjC5Bs976nbHi1J48vqvqcwUiNBPiBPZpFvdRypgoVLCcn0WP739V6WDYmxZ7c3yZWw1KOePxlGgOl1Hlt6Ad6kHtrGKkpkPikKYKDCy1h9tdDoVys6gvpNRXEyyK6uNDIreNVHj6Vt3BFoUSBWRusR0FqTNHPHBOvcbquXk3plpm7X8Gvp5SMlm0fu84ZKanLSGArG2fIW7GYkQgYo1hSYEjWQ13e6ckgwe8Od0CwW7GJA08NKzjxp7njG9gbYx9FR3Pkv5xqjyBDmVEtX7v9vGHkNF0wkVfyw1v7qmBecGEsAimRoam4vzu2Gsj9HS8l')

WebUI.click(findTestObject('Object Repository/Page_React App/span_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_React App/span_Vui lng th li'), 0)

WebUI.closeBrowser()

