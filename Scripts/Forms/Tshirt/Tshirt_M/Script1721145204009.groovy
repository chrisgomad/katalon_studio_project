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

WebUI.navigateToUrl('https://forms.gle/Ky2dmTjTXhdeRzmm7')

WebUI.switchToWindowTitle('T-Shirt Sign Up')

WebUI.setText(findTestObject('Object Repository/Page_T-Shirt Sign Up/input__whsOnd zHQkBf'), 'John Doe')

WebUI.click(findTestObject('Page_T-Shirt Sign Up/div__AB7Lab Id5V1 - M'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt Sign Up/span_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_T-Shirt Sign Up/div_Your response has been recorded'), 'Your response has been recorded.')

WebUI.closeBrowser()

