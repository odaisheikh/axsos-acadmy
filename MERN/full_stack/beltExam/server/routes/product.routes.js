const ProductController = require('../controllers/product.controller');
module.exports = function(app){
    app.get('/api', ProductController.index);
    app.post('/api/projects', ProductController.createProduct);
    app.get('/api/projects', ProductController.getAllProduct);
    app.get('/api/projects/:id', ProductController.getProduct);
    app.put('/api/projects/:id', ProductController.updatePerson);
    app.delete('/api/projects/:id/delete', ProductController.deletePerson);


}