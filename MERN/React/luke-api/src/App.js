import React from "react"
import './App.css';
import {
  BrowserRouter,
  Link,
  Switch,
  Route
} from "react-router-dom";
import  Apout  from './component/Apout';
import { Home } from './component/Home';
function App() {
  return (
    
    <BrowserRouter>
      <Switch>
      <Route exact path="/home">
          <Home />
        </Route>
      <Route path="/about/:newabout">
          <Apout />
        </Route>
        </Switch>
    </BrowserRouter>
  );
}

export default App;
