const mongoose = require('mongoose');
const ProductSchema = new mongoose.Schema({
    title: {
        type: String,
        required: [
            true,
            "Title is required"
        ],
        minlength:[3,"fjkdjkjdkfj"]
    },
    price: { type: Number ,
        required:[true , 'fill data'],
        min:[3,'at least three ']
    },
    desc : { type: String}
}, { timestamps: true,
});
module.exports.Product = mongoose.model('Product', ProductSchema);