import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Static Object/Login Page/input_LOGIN Panel_txtUsername'), UserName)

WebUI.setEncryptedText(findTestObject('Static Object/Login Page/input_Username_txtPassword'), Password)

WebUI.click(findTestObject('Static Object/Login Page/input_Password_Submit'))

