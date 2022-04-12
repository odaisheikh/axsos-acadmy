
import './App.css';

import { useState } from 'react';
import { Head } from './component/Head';
import { Display } from './component/Display';

function App() {
  const [tab , setTab] = useState();
  const handelTab = ( newMessage ) => {
    setTab(newMessage);
  }

  return (
    <>
      
      <Head myFunction={handelTab}/>
      <Display content={tab}/>
      
      
      
    </>
  
  );
}

export default App;
