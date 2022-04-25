const mongoose = require('mongoose');
const AuthSchema = new mongoose.Schema({
    name: { type: String ,
        required: [
            true,
            "name is required"
        ],
        minlength:[3,"length at least three charachter"]
    },
}, { timestamps: true });
module.exports.Auth = mongoose.model('Auth', AuthSchema);