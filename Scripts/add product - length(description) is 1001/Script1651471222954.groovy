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

WebUI.callTestCase(findTestCase('login success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_React App/button_Qun l sn phm_ant-btn ant-btn-default'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Tn_basic_name'), 'sp123')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Gi_basic_price'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_M t_basic_description'), 'Wq0hI4iWyELDBPOFltVXehi3LopfSdFp2DrCv2LcfyuxDLP8tCYGTpNfEjUC7rkLPmU71DA9vaTVq2wvV6McmxCSnLLB0vGrGhAWJ4DRNpHjTsNXkPHJvGB3gCuckwCtoGLfl9mD3aLx7yOwRddhRwPfS6bB2plUHrm5MxxbPqjZoD246ZQVF5gIWjBeeobkPRx5AcL7eDgN8mMU0s3NjRt4Jpwod6DvWPE2EdpKODGV3x0Q3sa6WXLLxdAX66g3nGFdnXAHLfBDLb9MuyKC57JtBXqVzn1CwIshRMrcgVikXc71yO6zRpLBQkNF0HdKInPHxRbCMspS9fyVKKZ2lp7RQLhdMUuovknMzYZ7yUKIR49hSzHFb7DIS2GpRRgq86A0GMCcbFVa9RuiEEpmWSykPYtV7JLNe5Ih2bBuGrQWDLJjYuxIQz4GZ2v6Lb2ZX3oDe6jeFQPrOa0jJZosBjyzir9ar1LlgFZOUdfedj1xhakUdP6h2vXPHmjQ18nxFrm2xVH44jQwOCzn8WRnFXFey6dENrm2c8E1pQQqAvNkht952SI7gdo61YJjSgovDPJsO5aUyqxqXbJs4d79CqqlCF7uFxCp97OiuGuh7P8UgPQQ8fHqcYyxAyzFgLRkrO6CIcwlayseB3jVKcVezJQ2nFnE5hPGTtwLnefFJXvHlqyvedFhhr0qdniwfhHdujv6wtUL0BCBgp3oIUoASWeXur4ONKbzv9rFyzUzpnBusBQakpZ6sQ30HMbpcHA6NQDBk59K5WXW3WmuTExnpYTGFaNXg4XlP0QfHZXPjEvC3lFjP8sd2UsX1MsUoHjrJiMh1ArIZhzx03cLyV0gHlWLR79VfAqmMhCGvomzUesANbDN3nX3Ti3Z11hapwtT5OfBNRfnUhk6sYNkXeZonFsdinpAJQZXWVHgMhSMpCQNFD2sQGOXaTzimUtpG36aIE4q27xp21mpk3mVKnYUFPJZMTmwobMZwqCjyyRHU')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Cng dng_basic_usageOfProduct'), '123')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Cch s dng_basic_guide'), '456')

WebUI.click(findTestObject('Object Repository/Page_React App/span_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_React App/span_Vui lng th li'), 'Vui lòng thử lại')

WebUI.closeBrowser()

