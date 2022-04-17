import React, { useState } from 'react'
import { useHistory } from "react-router-dom";

export const Main = () => {
    const [number , setNumber] = useState();
    const [option , setOption] = useState();
    const history = useHistory();

    const handelSubmit =(e)=>{
        e.preventDefault();
        if(option==="pepole"){
            history.push('/pepole');
        }
        else if(option==="planet"){
            history.push('/planet');
        }
        else if(option==="startShip"){
            history.push('/startShip');
        }
    }
    return (
        <div>
            <form>
                <select onChange={(e)=>setOption(e.target.value)}>
                    <option value="pepole">pepole</option>
                    <option value="planet">planet</option>
                    <option value="startShip">startShip</option>
                </select>
                <input type="number" onChange={e=>setNumber(e.target.value)}  />
                {console.log(number)}
                {console.log(option)}
                <input type="submit" value="submit" onClick={handelSubmit} />
            </form>
        </div>
    )
}
