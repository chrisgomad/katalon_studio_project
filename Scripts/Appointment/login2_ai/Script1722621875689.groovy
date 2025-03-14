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

/*
 * create a function names login that receives two parameters: username and password:
 * Enter username in input_username textbox
 * Enter password in input_password textbox
 * Click input_login_button
 */
/*
* This keyword logs in with the provided username and password.
*
* @param username The username to be entered in the input_username textbox
* @param password The password to be entered in the input_password textbox
*/
@Keyword
def login(String username, String password) {
	WebUI.sendKeys(findTestObject('Page_Login/input_username'), username)
	WebUI.sendKeys(findTestObject('Page_Login/input_password'), password)
	WebUI.click(findTestObject('Page_Login/input_login_button'))
}

/*
 * Open browser, go to https://katalon-demo-cura.herokuapp.com/
 */
// Open browser and navigate to the specified URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

/*
 * Call a pre-defined function 'login' with username="username", password="secret"
 */
// Call a pre-defined function 'login' with username="username", password="secret"
CustomKeywords.'com.example.LoginKeywords.login'('username', 'secret')
