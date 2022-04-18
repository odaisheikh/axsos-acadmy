const odai = require("../models/user.model");

module.exports.findAllJokes = (req, res) => {
  odai.find()
    .then(allDaJockes => res.json({ users: allDaJockes }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.findRandomJok = (req, res) => {
  odai.aggregate(
      [
        { 
          $sample: { size: 1 } 
        }
      ]
  )
    .then(randomJok => res.json({ user: randomJok }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.findOneSingleJoke = (req, res) => {
	odai.findOne({ _id: req.params.id })
		.then(oneSingleUser => res.json({ user: oneSingleUser }))
		.catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.createNewJoke = (req, res) => {
  odai.create(req.body)
    .then(newlyCreatedUser => res.json({ user: newlyCreatedUser }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.updateExistingJoke = (req, res) => {
  odai.findOneAndUpdate({ _id: req.params.id }, req.body, { new: true })
    .then(updatedUser => res.json({ user: updatedUser }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};

module.exports.deleteAnExistingJoke = (req, res) => {
  odai.deleteOne({ _id: req.params.id })
    .then(result => res.json({ result: result }))
    .catch(err => res.json({ message: "Something went wrong", error: err }));
};
