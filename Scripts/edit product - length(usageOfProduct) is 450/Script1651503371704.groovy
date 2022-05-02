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

WebUI.click(findTestObject('Object Repository/Page_React App/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_React App/div_abc'))

WebUI.click(findTestObject('Object Repository/Page_React App/path'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Cng dng_basic_usageOfProduct'), '3YlGlZinSywJ2LOTE0aMajqXktmoKUHGQSMiTH9LXOoOnreE2Gb5YSVy3VEzEXEMcwggcb0DtL9iqDdcBSMnK35UsvcREXK9MkLou21aUOzZEkOVeImkBZjcVN0Xqr51x1MUJVcNb7KFZCcipnYz9vTJnzvnhozmkWOfqCgboklrmnzOYDZ59z802U3xmf7b0hxUFBbgWjod48HR6esYcL7p3CYNSO7rMSFp6iXBY1GP5OXa6kv01ooUHKAToMh9A2sw19xrxytAgUjlyRJ902rF8ihxxDP0I3miQQMg52dbOmS0mgiChKrsmWtfnjhUneu2QVoPK5TuDD43L1ZQb98TCHZJmLpcZc53zGn9JuiqRM6dCPfhkiLaUQzf9fJpvXkMGxQCXkWEHdYW2ZkZXmBqecFFlrWaFdSdoo20gmQrwXGtBS32FkE922xB2i0AdE')

WebUI.click(findTestObject('Object Repository/Page_React App/span_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_React App/span_Chnh sa mt hng thnh cng'), 0)

WebUI.closeBrowser()

