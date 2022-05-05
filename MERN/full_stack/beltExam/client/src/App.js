import logo from './logo.svg';
import './App.css';
import Main from './views/Main'
import {
  BrowserRouter,
  Routes,
  Route,
  } from "react-router-dom";
  import AddProject from './views/AddProject'
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Main />}/>
          <Route path='/addProject' element={<AddProject />}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
