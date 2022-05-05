import React from 'react'

const Progress = (props) => {
    const handelClick=e=>{
        props.updateIn(e.target.value)
    }
    return (
        <div>
            <h1>in progress</h1>
        {props.Items.map((item,idx)=>{
            return(
            <div style={{border:'1px solid black' , margin:'5px'}} key={idx}>
                <p>{item.title}</p>
                <p>{item.status}</p>
                <button value={item._id} onClick={handelClick} style={{backgroundColor:'green'}}>move to compleated</button>
            </div>
            )
        }
        )}
    </div>
    )
}

export default Progress