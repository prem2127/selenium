package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends bassclass{

	@Before
	//precondition
	private void precondition3() {
		launchBrowser();
		windowMaximize();
	}	
		private void precondition2() {
			launchBrowser();
			windowMaximize();
		}		
			private void precondition1() {
				launchBrowser();
				windowMaximize();
	}
	
	
	
	
	
	@After
	//postcondition
	private void postcondition2() {
		closeEntireBrowser();
	}	
		private void postcondition1() {
			closeEntireBrowser();	
		
		
			
		
		
		
	}
}
