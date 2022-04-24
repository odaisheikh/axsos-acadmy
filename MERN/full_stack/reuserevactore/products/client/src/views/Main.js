import React, { useEffect, useState } from 'react'
import axios from 'axios';
import PersonForm from '../components/PersonForm';
import PersonList from '../components/PersonList';
import {
    BrowserRouter,
    Routes,
    Route,
    NavLink,
    Link,
    useNavigate,
    useParams
    } from "react-router-dom";
export default () => {
    const [product, setProduct] = useState([]);
    const [loaded, setLoaded] = useState(false);
    useEffect(() => {
        axios.get('http://localhost:8000/api/people')
            .then(res =>{ 
                setProduct(res.data)
                setLoaded(true);
            });
    }, [])
    const removeFromDom = personId => {
        setProduct(product.filter(person => person._id != personId));
    }
    const createPerson = person => {
        axios.post('http://localhost:8000/api/people', person)
            .then(res=>{
                setProduct([...product, res.data]);
            })
    }
    return (
        <div>
            <PersonForm onSubmitProp={createPerson} initialFirstName="" initialLastName=""/>
            <hr/>
            {loaded && <PersonList product={product} removeFromDom={removeFromDom}/>}
        </div>
    )
}

