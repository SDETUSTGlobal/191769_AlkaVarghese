exports.config = {
        framework: 'jasmine', //Type of Framework used 
        directConnect:true, 
        specs: ['loginspec.js','ViewAllOrders.js','ViewAllProducts.js','Order.js'], //Name of the Specfile 
       /* onPrepare() { 
              require('ts-node').register({ 
              project: require('E:\end-to-end-project').join(__dirname, './tsconfig.json') // Relative path of tsconfig.json file 
        	});
        } */
}
