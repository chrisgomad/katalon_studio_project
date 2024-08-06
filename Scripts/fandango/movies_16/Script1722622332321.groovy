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
 * Open browser, go to https://www.fandango.com/movies-in-theaters
 */
// Open browser and navigate to the specified URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.fandango.com/movies-in-theaters')

/*
 * In search box, type in 'Orlando' and then the click the search button
 */
// Type 'Orlando' in the search box
WebUI.sendKeys(findTestObject('input_search'), 'Orlando')

// Click the search button
WebUI.click(findTestObject('button_search'))

/*
 * Click on link 'Orlando, FL'
 */
// Click on link 'Orlando, FL'
WebUI.click(findTestObject('Page_CityList/a_Orlando_FL'))

/*
 * Retrieve the text of the first movie in the list results
 */
// Find the test object representing the first movie in the list results
WebUI.getText(findTestObject('Object Repository/MovieList/FirstMovie'))

/*
 * Click the 'Nearby Theaters' dropdown.
 */
// Click the 'Nearby Theaters' dropdown
WebUI.click(findTestObject('your_test_object_selector_here'))

/*
 * In Select theater dropdown, select option containing text 'AMC Altamonte'
 */
// Find Test Object for theater dropdown
WebUI.click(findTestObject('Page_CinemaBooking/select_TheaterDropdown'))

// Select option containing text 'AMC Altamonte'
WebUI.selectOptionByValue(findTestObject('Page_CinemaBooking/select_TheaterDropdown'), 'AMC Altamonte')

/*
 * Click IMAX button
 */
// Click on the IMAX button
WebUI.click(findTestObject('Object Repository/IMAX_Button'))

/*
 * Retrieve text of the first movie in the list
 */
// Find the test object representing the first movie in the list
WebUI.getText(findTestObject('Object Repository/MovieList/FirstMovie'))