// const express = require('express');
// const cors = require('cors') // This is new
// const app = express();
// app.use(cors()) // This is new
// require('./server/routes/person.routes')(app);
// app.listen(8000, () => {
//     console.log("Listening at Port 8000")
// })

const express = require('express');
const cors = require('cors');
const app = express();
require('./server/config/mongooes.config'); // This is new
app.use(cors());
app.use(express.json()); // This is new
app.use(express.urlencoded({ extended: true })); // This is new
require('./server/routes/person.routes')(app);
app.listen(8000, () => {
    console.log("Listening at Port 8000")
})
