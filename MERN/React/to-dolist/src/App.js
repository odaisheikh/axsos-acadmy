import logo from './logo.svg';
import './App.css';
import { AddForm } from './component/AddForm';
import { Display } from './component/Display';
import { useState } from 'react';

function App() {
  const [task,setTask]=useState([]);
  const handelAdd =(item)=>{
    setTask([...task , item])
  }
  const handelDelete = (i) => {setTask([
    ...task.slice(0, i),
            ...task.slice(i+ 1)])
}
  return (
    <div className="App">
      <AddForm funAdd={handelAdd}/>
      < Display funDelete={handelDelete} mision={task}/>
    </div>
  );
}

export default App;
