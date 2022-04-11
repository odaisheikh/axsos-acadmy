import React, { useState } from 'react'

const Form = (props) => {
    const [firstName, setFirstName] = useState("");
    const [lasttName, setlastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [cnfirmPassword, setConfirmPassword] = useState("");
    const [errorf, setErrorf] = useState("");
    const [errorl, setErrorl] = useState("");
    const [errore, setErrore] = useState("");
    const [errorp, setErrorp] = useState("");
    const [errorc, setErrorc] = useState("");
    
    return (
        <div>
            <form>
                <div>
                    <p>first name</p>
                    <input type="text" onChange={(e)=>setFirstName(e.target.value)}/>
                </div>
                <div>
                    <p>last name</p>
                    <input type="text" onChange={(e)=>setlastName(e.target.value)}/>
                </div>
                <div>
                    <p>email</p>
                    <input type="text" onChange={(e)=>setEmail(e.target.value)}/>
                </div>
                <div>
                    <p>password</p>
                    <input type="text" onChange={(e)=>setPassword(e.target.value)}/>
                </div>
                <div>
                    <p>confirmPassword</p>
                    <input type="text" onChange={(e)=>setConfirmPassword(e.target.value)}/>
                </div>
            </form>
            <div>
                <p>{firstName}</p>
                <p>{lasttName}</p>
                <p>{email}</p>
                <p>{password}</p>
                <p>{cnfirmPassword}</p>
            </div>
        </div>
    )
}

export default Form