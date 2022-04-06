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

Mobile.startApplication('C:\\Users\\theef\\Desktop\\EPİAŞ Mobil_2.1.1_apkcombo.com.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Tamam'), 0)

Mobile.swipe(500, 1000, 300, 0)

Mobile.swipe(500, 1000, 300, 0)

Mobile.swipe(500, 1000, 300, 0)

Mobile.swipe(500, 1000, 300, 0)

Mobile.swipe(500, 1000, 300, 0)

Mobile.swipe(500, 1000, 300, 0)

Mobile.swipe(500, 1000, 300, 0)

Mobile.swipe(500, 1000, 300, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Devam Et'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Piyasalar'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Piyasa Takas Fiyat'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 0)

Mobile.swipe(400, 1200, 0, 950)

Mobile.swipe(900, 1200, 0, 1325)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Tamam (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - 50,47'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - 50,70'), 0)

Mobile.closeApplication()

