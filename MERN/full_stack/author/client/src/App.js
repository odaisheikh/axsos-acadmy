import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter,
  Routes,
  Route,
  } from "react-router-dom";
import Main from './views/Main';
import Author from './components/Author';
import Updat from './components/Updat';
import { AddAuthor } from './components/AddAuthor';
function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Main />}/>
          <Route path='/addAuthor' element={<AddAuthor />}/>
          <Route path='/update/:id' element={<Updat />}/>
          {/* <Route path='/update/:id' element={<Update />}/> */}
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
