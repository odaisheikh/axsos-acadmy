import logo from './logo.svg';
import './App.css';
import Main from './views/Main';
import {Error} from './views/Error';
import {
  BrowserRouter,
  Routes,
  Route,
  NavLink,
  Link,
  useNavigate,
  useParams
  } from "react-router-dom";
import Detail from './views/Detail';
import Update from './views/Update';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Main />}/>
          {/* <Route path='/about' element={<Apout />}/> */}
          <Route path='*' element={<Error />}/>
          <Route path='/details/:id' element={<Detail />}/>
          <Route path='/update/:id' element={<Update />}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
