const ProductController = require('../controllers/product.controller');
module.exports = function(app){
    app.get('/api', ProductController.index);
    app.post('/api/people', ProductController.createProduct);
    app.get('/api/people', ProductController.getAllProduct);
    app.get('/api/people/:id', ProductController.getProduct);
    app.put('/api/people/:id', ProductController.updatePerson);
    app.delete('/api/people/:id/delete', ProductController.deletePerson);


}