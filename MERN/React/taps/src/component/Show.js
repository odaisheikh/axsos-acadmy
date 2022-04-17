import React from 'react'


const Show = (props) => {
    return (
        
        <div>
            {props.myColor.map((item)=>
                <div style={{backgroundColor: item,width:'200px',height:"200px", display:'inline-block'}}>jdkfjkdj</div>
            )}
        </div>
    )
}

export default Show