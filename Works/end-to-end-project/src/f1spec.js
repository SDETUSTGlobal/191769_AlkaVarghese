describe('Login', () => {
	it('Should navigate to freelancer Page and accept the user credentials', () => {
		//browser.waitForAngularEnabled(false);
		browser.get('https://www.freelancer.com/login');    
		element(by.xpath('/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/fl-input[1]/fl-bit/fl-bit/input')).sendKeys('alkavarghese6599');
		element(by.xpath('/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/fl-input[2]/fl-bit/fl-bit/input')).sendKeys('Apple123@');
		element(by.xpath('/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/app-login-signup-button/fl-button/button')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('https://www.freelancer.com/dashboard');
			});
	});
	it('Should select my lists', () => {   
		element(by.xpath('/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[2]/a/fl-bit/fl-text/div')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('https://www.freelancer.com/lists/favorites');
			});	
	});
	it('Should select my projects', () => {   
		browser.get('https://www.freelancer.com/dashboard/feedback.php?w=f&ngsw-bypass=');
		element(by.xpath('/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[3]/a')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('https://www.freelancer.com/manage/work/projects/open?query=&filter=All&show=10');
			});	
	});
	it('Should select my inbox', () => {   
		browser.get('https://www.freelancer.com/dashboard/feedback.php?w=f&ngsw-bypass=');
		element(by.xpath('/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[4]/a')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('https://www.freelancer.com/messages');
			});	
	});
	it('Should select my feedback', () => {   
		browser.get('https://www.freelancer.com/dashboard/feedback.php?w=f&ngsw-bypass=');
		element(by.xpath('/html/body/app-root/app-logged-in-shell/div/div[2]/ng-component/app-navigation-secondary-projects/app-bar/fl-container/nav/fl-scrollable-content/div/app-bar-item[5]/a')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('https://www.freelancer.com/dashboard/feedback.php?w=f&ngsw-bypass=');
			});	
	});
	
	
});