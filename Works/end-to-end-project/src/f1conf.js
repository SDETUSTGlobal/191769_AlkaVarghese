exports.config = {
        framework: 'jasmine', //Type of Framework used 
        directConnect:true, 
        specs: ['f1spec.js'], //Name of the Specfile 
        capabilities: {
                'browserName':'chrome'
        }
}