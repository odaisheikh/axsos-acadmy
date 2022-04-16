import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter,
  Link,
  Switch,
  Route
} from "react-router-dom";
import { Apout } from './component/Apout';
import { Home } from './component/Home';
function App() {
  return (
    <BrowserRouter>
      <h1>Routing Example</h1>
      <p>
        <Link to="/">Home</Link>
        | 
        <Link to="/about">About</Link>   
      </p>
      <Switch>
      <Route path="/about">
          <Apout />
        </Route>
        <Route exact path="/">
          <Home />
        </Route>
        </Switch>
    </BrowserRouter>
  );
}

export default App;
