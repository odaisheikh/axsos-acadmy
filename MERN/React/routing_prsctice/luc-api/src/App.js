import logo from './logo.svg';
import './App.css';
import React from "react";
import { About } from './components/About';
import {Home} from './components/Home';
import {
  BrowserRouter,
  Switch,
  Route,
  Link 
} from "react-router-dom";
import { SomeStyle } from './components/SomeStyle';
function App() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/about/:any">
          <About />
        </Route>
        <Route exact path="/">
          <Home />
        </Route>
        <Route  path="/hello/:text/:color">
          <SomeStyle />
        </Route>
      </Switch>
    </BrowserRouter>
  );
}

export default App;
