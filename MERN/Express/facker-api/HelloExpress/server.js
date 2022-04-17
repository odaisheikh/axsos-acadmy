const express = require("express");
const app = express();

const { faker } = require('@faker-js/faker');
const createUser = () => {
    const newFake = {
        first_name: faker.name.lastName(),
        last_name: faker.name.lastName(),
        id: faker.random.float(0.1),
        number: faker.phone.phoneNumber()
    };
    return newFake;
};
const createCompany = () => {
    const newFake = {
        name: faker.name.findName(),
        last_name: faker.name.lastName(),
        id: faker.random.float(0.1),
        address: {
          street:faker.address.streetName(),
          city:faker.address.city(),
          state:faker.address.state(),
          zip_code:faker.address.zipCode()
        }
    };
    return newFake;
};
    
const newFakeUser = createUser();
const newFakeCompany = createCompany();
console.log(newFakeUser);
app.get("/api/user/new", (req, res) => {
  res.send(newFakeUser);
});
app.post("/api/user/new", (req, res) => {
  newFakeUser.push(req.body)
  res.json({status:"it is ok"})
});
app.get("/api/company/new", (req, res) => {
  res.send(newFakeCompany);
});
app.get("/api/user/company", (req, res) => {
  res.send([newFakeCompany,newFakeUser]);
});



const server = app.listen(8000, () =>
  console.log(`Server is locked and loaded on port ${server.address().port}!`)
);
