const AuthController = require('../controllers/auth.controller');
module.exports = function(app){
    app.get('/api', AuthController.index);
    app.post('/api/author', AuthController.createAuth);
    app.get('/api/author', AuthController.getAllAuth);
    app.get('/api/author/:id', AuthController.getAuth);
    app.put('/api/author/:id', AuthController.updatePerson);
    app.delete('/api/author/:id/delete', AuthController.deletePerson);
}