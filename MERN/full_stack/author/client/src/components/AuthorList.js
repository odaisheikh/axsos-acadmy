import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom';
import axios from 'axios';
import DeleteButton from './DeleteButton';
import { display } from '@mui/system';
    
const AuthorList = (props) => {
    const {author,removeFromDom} = props;
    return (
        <div>
            {author.map((person, idx) => {
                return (
                    <div key={idx} style={{width:'200px', display:'flex',alignItems:'center' , height:'150px'}}>
                        <Link to={"/details/" + person._id}>
                            {person.name}
                        </Link>
                        |
                        <Link to={"/update/" + person._id}>
                            Edit
                        </Link> 
                        |
                        <DeleteButton personId={person._id} successCallback={()=>removeFromDom(person._id)}/>
                    </div>
                )
            })}
        </div>
    );
}
export default AuthorList;
