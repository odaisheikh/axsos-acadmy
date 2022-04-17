import logo from './logo.svg';
import './App.css';
import Form from './component/Form';
import Show from './component/Show';
import { useState } from 'react';

function App() {
  const [color , setColor] = useState([]);
  const youveGotMail = ( newMessage ) => {
    // setColor(color.concat(newMessage));
    setColor([...color , newMessage]);}
  const tabs = [1,2,3];

  return (
    <>
      
      <Form myFun={youveGotMail}/>
      
        <Show myColor={color}/>
      
      
      
    </>
  
  );
}

export default App;
