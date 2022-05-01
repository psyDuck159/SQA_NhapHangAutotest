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

WebUI.setText(findTestObject('Object Repository/input_Username_basic_username'), 'jim')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_basic_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/button_Submit'))

WebUI.click(findTestObject('Object Repository/a_Qun l n nhp hng'))

WebUI.click(findTestObject('Object Repository/button_Qun l n nhp hng_ant-btn ant-btn-default'))

WebUI.click(findTestObject('Object Repository/div_Nh cung cp_ant-select-selector'))

WebUI.click(findTestObject('Object Repository/div_A'))

WebUI.click(findTestObject('Object Repository/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Page_React App/div_Cha c sn phm no c thm'), 1)

WebUI.closeBrowser()

