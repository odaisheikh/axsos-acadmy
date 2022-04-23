import React from 'react'
import axios from 'axios';
import {
    BrowserRouter,
    Link ,
    useHistory
  } from "react-router-dom";
export const ProductList = (props) => {
    const { removeFromDom } = props;
    const history=useHistory();
    const deletePerson = (personId) => {
        axios.delete('http://localhost:8000/api/people/' + personId+'/delete')
            .then(res => {
                removeFromDom(personId)
            })
            .catch(err => console.error(err));
    }
    return (
        <div>
        {props.people.map( (product, i) =>
        
            <p key={i} > <Link  to={'/people/'+product._id} >{product.title}, {product.price} , {product.desc}</Link> | <Link to={"/people/" + product._id + "/edit"}>
                Edit
                </Link> | 
                <button onClick={(e)=>{deletePerson(product._id)}}>
                        Delete
                </button>
            </p>
        )}
    </div>
    )
}
