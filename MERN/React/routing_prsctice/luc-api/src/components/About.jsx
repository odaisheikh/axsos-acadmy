import React from 'react'
import { useParams } from 'react-router-dom/cjs/react-router-dom.min'

export const About = () => {
    const {any} = useParams();
    return (
        <div>
            {isNaN(any)?<p>the string is {any}</p>:<p>the number is {any}</p>}
        </div>
    )
}
