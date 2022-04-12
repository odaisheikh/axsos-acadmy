import logo from './logo.svg';
import './App.css';
import Person from './component/Person';

function App() {
  return (
    <div className="App">
      <Person name="odai" age={23} color="brown"/>
      <Person name="odai" age={23} color="brown"/>
      <Person name="odai" age={23} color="brown"/>
      <Person name="odai" age={23} color="brown"/>
      <Person name="odai" age={23} color="brown"/>
    </div>
  );
}

export default App;
