import React, { useEffect, useState } from 'react'

export const Project = (props) => {
    const { initialName,initialDate, onSubmitProp } = props;
    const [name, setname] = useState(initialName);
    const [date, setDate] = useState(initialDate);
    const onSubmitHandler = e => {
        e.preventDefault();
        onSubmitProp({name,date});
    }
    return (
        <div>
        <form onSubmit={onSubmitHandler}>
            <div>
            <input type="text" 
                    name="name"  value={name}  onChange={(e) => { setname(e.target.value) }} />
            </div>
            <div>
            <input type="date" 
                    name="name"  value={date}  onChange={(e) => { setname(e.target.value) }} />
            </div>
            <button type='submit'>submit</button>
        </form>
        </div>
    )
}
