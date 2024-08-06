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

WebUI.navigateToUrl('https://www.wendys.com/')

WebUI.switchToWindowTitle('Wendy\'s® | Home of Fresh, Never Frozen Beef Since 1969')

WebUI.click(findTestObject('Object Repository/Page_Wendys  Home of Fresh, Never Frozen Be_aa3d12/button_Accept All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Wendys  Home of Fresh, Never Frozen Be_aa3d12/a_Menu'))

WebUI.click(findTestObject('Object Repository/Page_Menu - Wendys/button_Combos'))

WebUI.click(findTestObject('Object Repository/Page_Combos - Wendys/button_Biggie Deals'))

WebUI.click(findTestObject('Object Repository/Page_Biggie Deals - Wendys/button_Jr. Bacon Cheeseburger370 Cal'))

WebUI.click(findTestObject('Object Repository/Page_Jr. Bacon Cheeseburger - Wendys/button_Start an order'))

WebUI.click(findTestObject('Object Repository/Page_Start Your Order - Wendys/div_Carryout'))

WebUI.closeBrowser()

