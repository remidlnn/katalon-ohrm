import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData



def static runTestCase_0() {
    TestCaseMain.runTestCase('Test Cases/ajouter_employe', new TestCaseBinding('Test Cases/ajouter_employe',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/supprimer_tous_les_employes', new TestCaseBinding('Test Cases/supprimer_tous_les_employes',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/SCE_ajouter_supprimer_employe')

suiteProperties.put('name', 'SCE_ajouter_supprimer_employe')

suiteProperties.put('description', 'Ajouter un employ\u00E9 et supprimer l\'ensemble des employ\u00E9s')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("\\\\DISKSTATION\\Projets\\02-Formations\\Katalon\\ohrm\\Reports\\SCE_ajouter_supprimer_employe\\20180103_100804\\execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('SCE_ajouter_supprimer_employe', suiteProperties)

TestCaseMain.invokeStartSuite('Test Suites/SCE_ajouter_supprimer_employe')

(0..1).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

TestCaseMain.invokeEndSuite('Test Suites/SCE_ajouter_supprimer_employe')

KeywordLogger.getInstance().endSuite('SCE_ajouter_supprimer_employe', null)
