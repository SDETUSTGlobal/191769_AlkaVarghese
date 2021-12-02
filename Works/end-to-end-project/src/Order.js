describe('Order', () => {
	it('Should navigate to Order page', () => {
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx');
            element(by.linkText('Order')).click();

			element(by.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("100");
	    
			element(by.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("70");
			
			element(by.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("20");
			
			element(by.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("ALKA");
			
			element(by.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("CHILAVANNOOR");
			
			element(by.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("ERNAKULAM");
			
			element(by.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("KERALA");
			
			element(by.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("682020");
			
			element(by.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
			
			element(by.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[3]/li[2]/input")).sendKeys("500100");


			browser.getTitle().then((name) => {
				expect(name).toBe('Web Orders');
					});
          
	});	
		
});