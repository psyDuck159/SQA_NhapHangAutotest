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

WebUI.navigateToUrl('http://localhost:3000/product')

WebUI.click(findTestObject('Object Repository/Page_React App/svg'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Tn_basic_name'), 'sp10')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Gi_basic_price'), '123')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_M t_basic_description'), 'ErRUIJdJfsG7KLR5W2qWgITd8H0yfpotGRKT7bAER01s4yxEvDvnf5t6ul4UFhWd6grc1oCb6r4T3Tjg9WaSzcu5F34LvLdFa7WykCu0ErdjLnaLRmkQWuGMWZquVLkBxp2HpZ5ZSvaiq6UPfbEQzMZuCW0Ktq7meQd6K7qPaiQTCDk0uQMhV0p379a5xKwxz5F2Am8Vt0pAkWLr1iQafjtd7d6SRDE9bTuQRYy93ZfXglbSjmRP0QPUma5xdIYF20lXQHZaRNnDvb4v2eIyNumbElsnLtCtqPqMuoOdVawvvn8Ggwxt95GvUE0uqc8Y17a3DgqlTjUjEvJnDLeXgPS1N0skiB1J0C6nLj8PHlL1IZnFx47sBzmhbsLa0ICwLEhAUm7i2cK0zfLk3azeJkThHx2ipoBaTtW5ztBwSjddcs5Z84GP7Gni4o0wUPIR0vakAOEOKiTPICN907KvVDEuRQILBRPbZgx9hDjiOj8uVyLRlHAydRAqO1VkiQoE4J1g1fg3NAuAJvsPyewwCG4Nm2v8fOCU08hZY9fjNPhxwpoKZjNEOkCQSayABOY8h0ENSIFypi4FNy4goobNhowvRkG2fHiPZsNVveS2lZlCDmG21mUZRGZIGMTa1THQzmmh2JR7TtTxbepDIaZq5lVhPER2lsS6YIwhjmqRyCYODofNA7XBSwuDjcV8grOxPsSQPQkPddj4vXlrd6SvvynzYtNRkp2GDzpmejP2QKQhwktn5jaGSIiHeedg5k77WUnhyRMcvCGG5UYPiOnE3cgmExHFl5LpP2Hgi2Ny99DQL3IIJO8dNDQ09qSyKtQRwZXD5GKuREr9hUvVTj1sZCjgwf4gRltRetYEi5BQZDAt7cJcW1fvAipvLOkQ6e2Z2cNhhJLlTqvevISxR2MIcHpKzC324cagugH14Mh7ojwroHMqkqIaJBqaRH9jMmlUTUFs1IWp1snO7WjDKl1xtI1RD6XtrAClL3KyUwlj')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Cng dng_basic_usageOfProduct'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Cch s dng_basic_guide'), 'def')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Submit'))

WebUI.closeBrowser()

