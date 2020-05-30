# BringGlobal_Test
Bring Global Test Challenge

Framework Desgin : Data-Driven Test Framework, PageObjectModel 
Design Tools : Java, TestNG, Maven, ApachePOI, Eclipse 
Dependency: TestNG, ApachePOI.

Download Project: git clone https://github.com/rsaravananbsc/Bring.Global.git

Test Execution:
	1. testng.xml and run as TestNG Suite. (Chrome Browser)

Test Exection Environment :
	IDE Tool: Eclipse (Any version)
	Operating System : Ubuntu 20.03 LTS
	Browser version : 
	Chrome Version 81.0.4044.138 (Official Build) (64-bit) 
	FireFox Version 76.0.1 (64-bit) (Official Build)

Note:

	1. Test Execution Speed has been limited to see the execution process
		(You can change the ExecutionSpeed at SettingProperties EXESPEED=3, Default Set Value=3)

	2. Cookies was not handled in automation (Must Required Manuel Intervention)

	3. Install TestNG on Eclipse: 
		Install from update site 
		Select Help / Install New Software... 
		Enter the update site URL in "Work with:" 
		field: Update site for release: https://dl.bintray.com/testng-team/testng-eclipse-release/. 
		Make sure the check box next to URL is checked and click Next. 
		Eclipse will then guide you through the process.

Observation on Execution:
1 . (Required Discussion with Development Team to Update/Enhancement about Object Layouts is Different on Manural Execution and    Automation Execution. If Required i will explain on Meeting)

2. If you faceing "StaleExelemnt Exception" Please Update the project by using the following path 
Eclispe RightClick on Project >>>> Maven >>>> Update Project. then Restart the Execution.
