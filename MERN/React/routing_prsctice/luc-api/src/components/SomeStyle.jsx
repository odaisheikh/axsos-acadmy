import React from 'react'
import { useParams } from 'react-router-dom/cjs/react-router-dom.min'

export const SomeStyle = () => {
    const {text , color} = useParams();
    return (
        <div style={{ backgroundColor:color}}>
            the word is {text}
        </div>
    )
}
