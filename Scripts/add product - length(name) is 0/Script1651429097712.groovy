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

WebUI.navigateToUrl('http://localhost:3000/product')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Qun l sn phm_ant-btn ant-btn-default'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Gi_basic_price'), '1')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_M t_basic_description'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Cng dng_basic_usageOfProduct'), 'b')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Cch s dng_basic_guide'), 'c')

WebUI.click(findTestObject('Object Repository/Page_React App/span_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_React App/div_Trng bt buc'), 0)

