//const { browser } = require("protractor");

describe('Login', () => {
	it('Should navigate to Smartbear_software Page and accept the user credentials', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx');    
		element(by.name('ctl00$MainContent$username')).sendKeys('Tester');
		element(by.name('ctl00$MainContent$password')).sendKeys('test');
		element(by.name('ctl00$MainContent$login_button')).click();
		browser.getTitle().then((name) => {
            expect(name).toBe('Web Orders');
			});
	});	
		
});