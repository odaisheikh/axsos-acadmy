const mongoose = require('mongoose');
const ProductSchema = new mongoose.Schema({
    title: { type: String,
        required: [
            true,
            "Title is required"
        ],
        minlength:[3,"at least three charachter"],
    },
    date: { type: String,
        required: [
            true,
            "date is required"
        ],
    },
    status: { type: String,
    }
}, { timestamps: true });
module.exports.Product = mongoose.model('Product', ProductSchema);