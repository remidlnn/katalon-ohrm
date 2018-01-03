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
    TestCaseMain.runTestCase('Test Cases/ajouter_poste', new TestCaseBinding('Test Cases/ajouter_poste',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/supprimer_tous_les_postes', new TestCaseBinding('Test Cases/supprimer_tous_les_postes',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/SCE_ajouter_supprimer_tous_les_postes')

suiteProperties.put('name', 'SCE_ajouter_supprimer_tous_les_postes')

suiteProperties.put('description', 'Ajoute 1 poste puis supprime l\'ensemble des postes')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\tmp\\git\\katalon-ohrm\\Reports\\SCE_ajouter_supprimer_tous_les_postes\\20180103_114726\\execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('SCE_ajouter_supprimer_tous_les_postes', suiteProperties)

TestCaseMain.invokeStartSuite('Test Suites/SCE_ajouter_supprimer_tous_les_postes')

(0..1).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

TestCaseMain.invokeEndSuite('Test Suites/SCE_ajouter_supprimer_tous_les_postes')

KeywordLogger.getInstance().endSuite('SCE_ajouter_supprimer_tous_les_postes', null)
