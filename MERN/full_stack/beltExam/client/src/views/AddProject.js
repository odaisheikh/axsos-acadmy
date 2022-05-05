import React, { useEffect, useState } from 'react'
import { Link, useNavigate, UseNavigate } from 'react-router-dom';
import axios from 'axios'

const AddProject = (props) => {
    const { initialName,initialDate, onSubmitProp } = props;
    const [title, setTitle] = useState(initialName);
    const [date, setDate] = useState(initialDate);
    const [status, setStatus] = useState("start");
    const [error, setError] = useState([]);
    let Navigate = useNavigate()
    const onSubmitHandler = e => {
        e.preventDefault();
        createPerson({title,date,status});
    }
    const createPerson = person => {
        axios.post('http://localhost:8000/api/projects', person)
            .then(res=>{console.log(person.name);Navigate('/')})
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
        <div >
            <div >
                <h1>project manager</h1>
                <p style={{marginLeft:'500px'}}><Link to={'/'}>back to dashBoard</Link></p>
            </div>
            {
                error.map((item,index)=><div key={index}>{item}</div>)
            }
        <form onSubmit={onSubmitHandler}>
            <div style={{margin:'20px'}}>
            <input type="text" 
                    name="name"  value={title}  onChange={(e) => { setTitle(e.target.value) }} placeholder="add project"/>
            </div>
            <div style={{margin:'20px'}}>
            <input type="date" 
                    name="name"  value={date}  onChange={(e) => { setDate(e.target.value) }} />
            </div>
            <button style={{width:'200px',backgroundColor:'pink'}} type='submit'>submit</button>
        </form>
        </div>
    )
}

export default AddProject
