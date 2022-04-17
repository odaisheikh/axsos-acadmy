import React, { useEffect, useState } from 'react';
import axios from 'axios';

export const Pepole = () => {
    const [responseData, setResponseData] = useState({});
    useEffect(()=>{
        axios.get('https://swapi.dev/api/people/'+1)
            .then(response=>setResponseData(response.data))
            
    }, []); 
    return(
        <div>
            {responseData.name}
        </div>
    )
}
