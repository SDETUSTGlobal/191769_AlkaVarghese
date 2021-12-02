describe('ViewAllProducts', () => {
	it('Should navigate to ViewAllProducts page', () => {
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx');
            element(by.linkText('View all products')).click();
            expect(title).toBe('List of Products')
	});	
		
});