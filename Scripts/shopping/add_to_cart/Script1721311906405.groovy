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

WebUI.navigateToUrl('https://amazon.com')

WebUI.switchToWindowTitle('Amazon.com. Spend less. Smile more.')

WebUI.setText(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'LEGO Creator 3 in 1 Mighty Dinosaur Toy, Transforms from T. rex to Triceratops to Pterodactyl Dinosaur Figures, Great Gift for 7-12 Year Old Boys & Girls, 31058')

WebUI.click(findTestObject('Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com  toys/span_LEGO Creator 3 in 1 Mighty Dinosaur To_e7d7d2'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Amazon.com LEGO Creator 3 in 1 Mighty _5198c2/span_LEGO Creator 3 in 1 Mighty Dinosaur To_e7d7d2'), 
    'LEGO Creator 3 in 1 Mighty Dinosaur Toy, Transforms from T. rex to Triceratops to Pterodactyl Dinosaur Figures, Great Gift for 7-12 Year Old Boys & Girls, 31058')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com LEGO Creator 3 in 1 Mighty _5198c2/input_Shipping cost, delivery date, and ord_223673'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Amazon.com Shopping Cart/h1_Added to Cart'), 'Added to Cart')

WebUI.closeBrowser()

