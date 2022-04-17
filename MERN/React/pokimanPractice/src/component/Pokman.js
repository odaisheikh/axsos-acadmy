import React, { useEffect, useState } from 'react'

export const Pokman = (props) => {
    const [pepole,setPeople]=useState([])
    useEffect(() => {
        fetch('https://pokeapi.co/api/v2/pokemon')
            .then(response => response.json())
            .then(response => setPeople(response.results))
    }, []);
    return (
        <div>
            {console.log(pepole)}
            
            {
                pepole.map((person,index)=>{
                    return(<div key={index}>{person.name}</div>)
                })
            }
        </div>

    )
}
