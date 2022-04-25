import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
export default props => {
    const { initialName, onSubmitProp } = props;
    const [name, setname] = useState(initialName);
    const onSubmitHandler = e => {
        e.preventDefault();
        onSubmitProp({name});
    }
        
    return (
        <form onSubmit={onSubmitHandler}>
            <div>
            <TextField type="text" 
                    name="name"  value={name} id="standard-basic" label="name" variant="standard" onChange={(e) => { setname(e.target.value) }} />
            </div>
            <Button type='submit'>submit</Button>
        </form>
    )
}
