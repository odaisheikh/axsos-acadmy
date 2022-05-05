import React from 'react'

const Start = (props) => {
    const handelClick=e=>{
        props.update(e.target.value)
    }
    return (
        <div>
            {props.Items.map((item,id)=>{
                return(
                <div style={{border:'1px solid black', margin:'5px'}} key={id}>
                    <p>{item.title}</p>
                    <p>{item.status}</p>
                    <button value={item._id} onClick={handelClick} style={{backgroundColor:'yellow'}}>start</button>
                </div>
                )
            }
            )}
        </div>
    )
}

export default Start