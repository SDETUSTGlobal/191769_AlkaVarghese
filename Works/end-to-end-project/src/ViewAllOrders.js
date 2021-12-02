describe('ViewAllOrders', () => {
	it('Should navigate to ViewAllOrders page', () => {
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx');
            element(by.linkText('View all orders')).click();
          
		    element(by.id("ctl00_MainContent_btnCheckAll")).click();

		    //element(by.id("ctl00$MainContent$btnDelete")).click();
		
      		element(by.id("ctl00_MainContent_btnUncheckAll")).click();

			browser.getTitle().then((name) => {
			expect(name).toBe('Web Orders');
				});
            
	});	
		
});