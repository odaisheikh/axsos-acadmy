import './App.css';
import Main from './views/Main'
import Detail from './views/Detail'
import Update from './views/Update';
import {
  BrowserRouter,
  Switch,
  Route
} from "react-router-dom";

function App() {
  return (
    <BrowserRouter forceRefresh={true}>
    <Switch>
    <Route exact path="/people/:id/edit">
        <Update />
      </Route>
      <Route exact path="/people">
          <Main />
      </Route>
      <Route  exact path="/people/:id">
        <Detail />
      </Route>
      </Switch>
  </BrowserRouter>
  );
}

export default App;
