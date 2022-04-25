import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
export default props => {
    const { initialTitle, initialPrice, onSubmitProp } = props;
    const [title, settitle] = useState(initialTitle);
    const [price, setprice] = useState(initialPrice);
    // const [desc, setDesc] = useState(initialDesc);
    const onSubmitHandler = e => {
        e.preventDefault();
        onSubmitProp({title, price});
    }
        
    return (
        <form onSubmit={onSubmitHandler}>
            <div>
            <TextField type="text" 
                    name="title"  value={title} id="standard-basic" label="title" variant="standard" onChange={(e) => { settitle(e.target.value) }} />
            </div>
            <div>
            <TextField type="number" 
                    name="price"  value={price} id="standard-basic" label="price" variant="standard" onChange={(e) => { setprice(e.target.value) }} />
            </div>
            <Button type='submit'>submit</Button>
        </form>
    )
}
