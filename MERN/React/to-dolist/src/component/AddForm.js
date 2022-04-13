import React, { useState } from 'react'

export const AddForm = (prpos) => {
    const [task,setTask]=useState("");
    const handelForm = (e)=>{
        e.preventDefault();
        prpos.funAdd(task)
    }

    return (
        <div>
            <form>
                <input type="text"  onChange={(e)=>setTask(e.target.value)}/>
                {console.log(task)}
                <input type="button" value="add task"  onClick={handelForm}/>
            </form>
        </div>
    )
}
