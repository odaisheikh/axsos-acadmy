import React from 'react'
import axios from 'axios';
import Button from '@mui/material/Button';
export default props => {
    
    const { personId, successCallback } = props;
    
    const deletePerson = e => {
        axios.delete('http://localhost:8000/api/people/' + personId+'/delete')
            .then(res=>{
                successCallback();
            })
    }
    
    return (
        <Button variant="contained" disableElevation onClick={deletePerson}>
        Delete
        </Button>
    )
}