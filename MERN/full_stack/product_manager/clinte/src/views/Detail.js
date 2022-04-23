import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams } from "react-router-dom";
import {
    BrowserRouter,
    Link 
  } from "react-router-dom";
const Detail = (props) => {
    const [product, setProduct] = useState({})
    const { id } = useParams();
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/people/' +id)
            .then(res => setProduct(res.data))
            .catch(err => console.error(err));
    }, []);
    
    return (
        <div>
            <p>title: {product.title}</p>
            <p>price: {product.price}</p>
            <p>desc: {product.desc}</p>
        </div>
    )
}
    
export default Detail;
