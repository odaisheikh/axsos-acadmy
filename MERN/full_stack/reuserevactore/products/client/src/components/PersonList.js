import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom';
import axios from 'axios';
import DeleteButton from './DeleteButton';
    
const PersonList = (props) => {
    const {product,removeFromDom} = props;
    return (
        <div>
            {product.map((person, idx) => {
                return (
                    <p key={idx}>
                        <Link to={"/details/" + person._id}>
                            {person.title}, {person.price}
                        </Link>
                        |
                        <Link to={"/update/" + person._id}>
                            Edit
                        </Link> 
                        |
                        <DeleteButton personId={person._id} successCallback={()=>removeFromDom(person._id)}/>
                    </p>
                )
            })}
        </div>
    );
}
    
export default PersonList;
