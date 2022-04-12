import React from 'react'

const Person = (props) => {
    return (
        <div>
            <h1>{props.name}</h1>
            <p>{props.age}</p>
            <p>{props.color}</p>
        </div>
    )
}

export default Person