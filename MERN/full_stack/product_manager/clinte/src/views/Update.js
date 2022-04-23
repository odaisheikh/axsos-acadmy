import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams } from "react-router-dom";
    
const Update = (props) => {
    const { id } = useParams();
    const [title, settitle] = useState('');
    const [price, setprice] = useState('');
    const [desc, setDesc] = useState('');
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/people/' + id)
            .then(res => {
                settitle(res.data.title);
                setprice(res.data.price);
                setDesc(res.data.price);
            })
    }, []);
    
    const updatePerson = e => {
        e.preventDefault();
        axios.put('http://localhost:8000/api/people/' + id, {
            title,
            price,
            desc
        })
            .then(res => console.log(res) )
            .catch(err => console.error(err));

    }
    
    return (
        <div>
            <h1>Update a Product</h1>
            <form onSubmit={updatePerson}>
                <p>
                    <label>title</label><br />
                    <input type="text" 
                    name="title" 
                    value={title} 
                    onChange={(e) => { settitle(e.target.value) }} />
                </p>
                <p>
                    <label>price</label><br />
                    <input type="text" 
                    name="price"
                    value={price} 
                    onChange={(e) => { setprice(e.target.value) }} />
                </p>
                <p>
                    <label>desc</label><br />
                    <input type="text" 
                    name="desc"
                    value={desc} 
                    onChange={(e) => { setDesc(e.target.value) }} />
                </p>
                <input type="submit" />
            </form>
        </div>
    )
}
    
export default Update;
