import React, {useState}from 'react'
import { useParams, useNavigate } from 'react-router-dom';
import axios from 'axios';
import Author from './Author';

export const AddAuthor = () => {
    const [error,setError]=useState([]);
    let navigate = useNavigate()
    const createPerson = person => {
        axios.post('http://localhost:8000/api/author', person)
            .then(res=>{console.log(person.name);navigate('/');})
            .catch(err=>{
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key].message)
                }
                // Set Errors
                setError(errorArr);
            })       
            
    }
    return (
        <div>
            {error.map((err, index) => <div key={index}>{err}</div>)}
            <Author onSubmitProp={createPerson} initialName="" />
        </div>
    )
}
