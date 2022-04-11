import logo from './logo.svg';
import './App.css';
import Test from "./component/Test"

function App() {
  return (
    <div className="App">
        <Test header={ "Header Prop" }>
            <p>This is a child</p>
            <p>This is another child</p>
            <p>This is even another child</p>
        </Test>  
    </div>
  );
}

export default App;
