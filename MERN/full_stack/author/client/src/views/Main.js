import React, { useEffect, useState } from 'react'
import axios from 'axios';
import AuthorList from '../components/AuthorList';
import { Link } from 'react-router-dom';
export default () => {
    const [author, setauthor] = useState([]);
    const [loaded, setLoaded] = useState(false);
    useEffect(() => {
        axios.get('http://localhost:8000/api/author')
            .then(res =>{ 
                setauthor(res.data)
                setLoaded(true);
            });
    }, [])
    const removeFromDom = personId => {
        setauthor(author.filter(person => person._id != personId));
    }
    const createPerson = person => {
        axios.post('http://localhost:8000/api/author', person)
            .then(res=>{
                setauthor([...author, res.data]);
            })
    }
    return (
        <div>
            <Link to={"/addAuthor"}>add Author</Link>
            {loaded && <AuthorList author={author} removeFromDom={removeFromDom}/>}
        </div>
    )
}


