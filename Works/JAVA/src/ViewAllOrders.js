describe('ViewAllOrders', () => {
	it('Should navigate to ViewAllOrders page', () => {
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx');
            element(by.linkText('View all orders')).click();
            expect(title).toBe('List of All Orders')
	});	
		
});