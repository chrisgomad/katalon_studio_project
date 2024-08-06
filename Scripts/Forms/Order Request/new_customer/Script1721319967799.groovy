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

WebUI.navigateToUrl('https://forms.gle/DRKh6xAHWmuxS9ui7')

WebUI.click(findTestObject('Page_Order Request/div_Are you a new or existing customer_AB7L_b4dc49', [('button') : '1']))

WebUI.setText(findTestObject('Object Repository/Page_Order Request/input_Please enter the product number_whsOn_c2edc1', 
        [('input') : '1']), 'Nike Air Force 1')

WebUI.click(findTestObject('Object Repository/Page_Order Request/div_What color(s) would you like to order_u_c85100'))

WebUI.setText(findTestObject('Object Repository/Page_Order Request/textarea_Choose size and number per color_K_4539ad'), 
    'Size: 12, 1 color 1')

WebUI.setText(findTestObject('Object Repository/Page_Order Request/input_Please enter the product number_whsOn_c2edc1', 
        [('input') : '2']), 'John Doe')

WebUI.setText(findTestObject('Object Repository/Page_Order Request/input_Please enter the product number_whsOn_c2edc1', 
        [('input') : '3']), '123-456-7890')

WebUI.click(findTestObject('Object Repository/Page_Order Request/div__uHMk6b fsHoPb'))

WebUI.click(findTestObject('Object Repository/Page_Order Request/span_Submit'))

WebUI.verifyTextPresent('Your response has been recorded', true)

WebUI.closeBrowser()

