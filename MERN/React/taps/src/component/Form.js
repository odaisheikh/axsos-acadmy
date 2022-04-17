import React, { useState } from 'react'

const Form = (props) => {
    const [color , setColor]=useState("");
    const handelForm = (e)=>{
        e.preventDefault();
        props.myFun(color);

    }

    return (
        <div>
            <form>
                <div>
                    <input type="text" onChange={(e)=>setColor(e.target.value)} />   
                </div>
                <input type="submit" onClick={handelForm} value="add color"/>
            </form>
        </div>
    )
}

export default Form