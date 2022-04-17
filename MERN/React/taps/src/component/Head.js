import React from 'react'

export const Head = (props) => {
    const handelTab=(e)=>{
        console.log(e.target.value);
        props.myFunction(e.target.value);
    }
    return (
        <div>
        <button  value="tab 1 is here" onClick={(e)=>handelTab(e)}>tab1</button>
        <button  value="tab 2 is here" onClick={(e)=>handelTab(e)}>tab2</button>
        <button  value="tab 3 is here" onClick={(e)=>handelTab(e)}>tab3</button>
    </div>
    )
}
