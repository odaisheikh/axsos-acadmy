import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams, useNavigate } from 'react-router-dom';
import DeleteButton from './DeleteButton';
import Author from './Author';
const Updat = (props) => {
    
    const [error,setError]=useState([]);
    let navigate = useNavigate()
    const { id } = useParams();
    const [person, setPerson] = useState();
    const [loaded, setLoaded] = useState(false);
    // const [error, setError] = useState([]);
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/author/' + id)
            .then(res => {
                setPerson(res.data);
                setLoaded(true);
            })
    }, []);
    
    const updatePerson = person => {
        axios.put('http://localhost:8000/api/author/' + id, person)
            .then(res => {console.log(res);navigate('/')})
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
            <h1>Update an Person</h1>
            {loaded && (
                <>
                    {error.map((err, index) => <div key={index}>{err}</div>)}
                    <Author
                        onSubmitProp={updatePerson}
                        initialName={person.name}
                    />
                    {console.log("hhhhhh")}
                    {console.log(person.name)}
                    <DeleteButton personId={person._id} successCallback={() => navigate("/")} />
                </>
            )}
        </div>
    )
}
    
export default Updat;
