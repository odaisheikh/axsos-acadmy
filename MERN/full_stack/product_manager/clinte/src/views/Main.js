import React, { useEffect, useState } from 'react';
import PersonForm from '../components/PersonForm';
import  { ProductList } from '../components/ProductList';
import axios from 'axios';
export default () => {
        const [people, setPeople] = useState([]);
        const [loaded, setLoaded] = useState(false);
        
        useEffect(()=>{
            axios.get('http://localhost:8000/api/people')
                .then(res=>{
                    setPeople(res.data);
                    setLoaded(true);
                })
                .catch(err => console.error(err));
        },[]);
    const removeFromDom = personId => {
        setPeople(people.filter(person => person._id != personId));
    }
    return (
        <div>
            <PersonForm/>
            <hr/>
            {loaded && <ProductList people={people} removeFromDom={removeFromDom}/>}
        </div>
    )
}
