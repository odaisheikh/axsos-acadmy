import React, { useEffect, useState } from 'react';
import axios from 'axios';

function EfectPo() {
    const [responseData, setResponseData] = useState([]);
    useEffect(()=>{
        axios.get('https://pokeapi.co/api/v2/pokemon')
            .then(response=>{setResponseData(response.data.results)})
    }, []); 
    return (
        <>
            
            {
                responseData.map((person,index)=>{
                    return(<div key={index}>{person.name}</div>)
                })
            }
            {/* {
                responseData.map((person,index)=>{
                    return(<div key={index}>{person.name}</div>)
                })
            } */}
            
            
        </>
    )
}

export default EfectPo