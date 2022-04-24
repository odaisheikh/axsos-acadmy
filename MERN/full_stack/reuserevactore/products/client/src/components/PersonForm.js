import React, { useEffect, useState } from 'react'
import axios from 'axios';
export default props => {
    const { initialtitle, initialprice, onSubmitProp } = props;
    const [title, settitle] = useState(initialtitle);
    const [price, setprice] = useState(initialprice);
    // const [desc, setDesc] = useState(initialDesc);
    const onSubmitHandler = e => {
        e.preventDefault();
        onSubmitProp({title, price});
    }
        
    return (
        <form onSubmit={onSubmitHandler}>
            <p>
                <label>title</label><br />
                <input 
                    type="text" 
                    name="title" value={title} 
                    onChange={(e) => { settitle(e.target.value) }} />
            </p>
            <p>
                <label>price</label><br />
                <input 
                    type="number" 
                    name="price" 
                    value={price} 
                    onChange={(e) => { setprice(e.target.value) }} />
            </p>
            <input type="submit" />
        </form>
    )
}
