const { Auth } = require('../models/auth.model');
module.exports.index = (request, response) => {
    response.json({
        message: "Hello World"
    });
}
    // The method below is new
module.exports.createAuth = (request, response) => {
    const {name} = request.body;
    Auth.create({
        name
    })
        .then(Auth => response.json(Auth))
        .catch(err => response.status(400).json(err));
}

module.exports.getAllAuth = (request, response) => {
    Auth.find({}, null, {sort: {name: 1}})
        .then(Auths => response.json(Auths))
        .catch(err => response.json(err))
}

module.exports.getAuth = (request, response) => {
    Auth.findOne({_id:request.params.id})
        .then(Auth => response.json(Auth))
        .catch(err => response.json(err))
}

module.exports.updatePerson = (request, response) => {
    Auth.findOneAndUpdate({_id: request.params.id}, request.body, {new:true})
        .then(updatedPerson => response.json(updatedPerson))
        .catch(err =>response.status(400).json(err))
}

module.exports.deletePerson = (request, response) => {
    console.log(request.params.id)
    Auth.deleteOne({ _id: request.params.id })
        .then(deleteConfirmation => response.json(deleteConfirmation))
        .catch(err => response.json(err))
}





