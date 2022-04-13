import React, { useState } from 'react'

export const Display = (props) => {
    const [isTasty,setIsTasty]=useState(false)
    // const [indexz,setIndex]=useState(0)
    console.log(isTasty)

    const handelDelete =(index)=>{
        console.log(index)
        props.funDelete(index)
    }

    return (
        <div>
            {
                props.mision.map(
                    (item,index)=>
                    <div key={index} style={{display:'flex'}}>
                        <li >
                            {item}
                        </li>
                        <input type="checkbox" checked={isTasty} onChange={e => setIsTasty(e.target.checked)}/> Is it tasty?
                        <button id={index} onClick={(e)=>handelDelete(e.target.id)} >dfdfdfd</button>
                    </div>
                )
            }
        </div>
    )
}
