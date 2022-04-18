const JockesController = require("../controllers/user.controller");

module.exports = app => {
  app.get("/api/jokes/", JockesController.findAllJokes);
  app.get("/api/jokes/random", JockesController.findRandomJok);
  app.get("/api/jokes/:id", JockesController.findOneSingleJoke);
  app.put("/api/jokes/update/:id", JockesController.updateExistingJoke);
  app.post("/api/jokes/new", JockesController.createNewJoke);
  app.delete("/api/jokes/delete/:id", JockesController.deleteAnExistingJoke);
};