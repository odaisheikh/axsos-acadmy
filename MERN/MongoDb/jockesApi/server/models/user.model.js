const mongoose = require("mongoose");

const UserSchema = new mongoose.Schema({
	setup: String,
	punchline: String
});

const User = mongoose.model("User", UserSchema);

module.exports = User;