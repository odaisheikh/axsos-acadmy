import React from 'react'
import axios  from 'axios'
const Compleated = (props) => {
    const deletePerson = e => {
        axios.delete('http://localhost:8000/api/projects/' + e.target.value+'/delete')
            .then(res=>{
                props.removeFromDom(e.target.value);
            })
    }
    return (
        <div>
            <h1>compleated</h1>
            <div>
            {props.Items.map((item,idx)=>{
                return(
                <div style={{border:'1px solid black', margin:'5px'}} key={idx}>
                    <p>{item.title}</p>
                    <p>{item.status}</p>
                    <button value={item._id} onClick={deletePerson} style={{backgroundColor:'red'}}>remove </button>
                </div>
                )
            }
            )}
        </div>
        </div>
    )
}

export default Compleated