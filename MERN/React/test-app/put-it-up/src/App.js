import logo from './logo.svg';
import './App.css';
import  Header from "./component/Header"

function App() {
  return (
    <div className="App">
      <Header name="odai" age={22} color={"black"}/>
      <Header name="odai" age={22} color="black"/>
      <Header name="odai" age={22} color="black"/>
      <Header name="odai" age={22} color="black"/>
    </div>
  );
}

export default App;
