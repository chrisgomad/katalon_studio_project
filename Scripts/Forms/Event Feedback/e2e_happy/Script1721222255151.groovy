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

WebUI.navigateToUrl('https://forms.gle/CugQ3SVr9MSgnJgE8')

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '5']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '10']))

WebUI.setText(findTestObject('Page_Event feedback/input_What were your key take aways from th_42aeed', [('input') : '1']), 
    'great lecture and accessibility')

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '15']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '21']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '27']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '33']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '39']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '45']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '51']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '57']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '108']))

WebUI.setText(findTestObject('Page_Event feedback/input_What were your key take aways from th_42aeed', [('input') : '2']), 
    'none')

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '112']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '116']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '120']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '124']))

WebUI.click(findTestObject('Page_Event feedback/div_Not very_AB7Lab Id5V1', [('rating') : '128']))

WebUI.click(findTestObject('Page_Event feedback/optional_button'))

WebUI.click(findTestObject('Object Repository/Page_Event feedback/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Event feedback/div_Your response has been recorded'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Event feedback/div_Your response has been recorded'), 'Your response has been recorded.')

WebUI.closeBrowser()

