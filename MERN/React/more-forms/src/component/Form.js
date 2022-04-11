import React, { useState } from 'react'
import "../css/form.css"

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
    const handelFirstName = (e)=>{
        if(e.target.value.length < 4){
            setErrorf("first name should be at least 4 character");
        }
        else{
            setErrorf("");
            setFirstName(e.target.value);
        }
    }
    const handelLastName = (e)=>{
        if(e.target.value.length < 4){
            setErrorl("last name should be at least 4 character");
        }
        else{
            setErrorl("");
            setlastName(e.target.value);
        }
    }
    const handelEmail = (e)=>{
        if(e.target.value.length < 4){
            setErrore("email should be at least 4 character");
        }
        else{
            setErrore("");
            setEmail(e.target.value);
        }
    }
    const handelPassword = (e)=>{
        if(e.target.value.length < 4){
            setErrorp("password should be at least 4 character");
        }
        else{
            setErrorp("");
            setPassword(e.target.value);
        }
    }
    const handelConfirmPassword = (e)=>{
        if(e.target.value.length < 4){
            setErrorc("first name should be at least 4 character");
        }
        else{
            setErrorc("");
            setConfirmPassword(e.target.value);
        }
    }
    return (
        <div>
            <form>
                <div className='form-group'>
                    <label>first name</label>
                    <input type="text" onChange={handelFirstName}/>
                </div>
                <p>{errorf}</p>
                <div className='form-group'>
                    <label>last name</label>
                    <input type="text" onChange={handelLastName}/>
                </div>
                <p>{errorl}</p>
                <div className='form-group'>
                    <label>email</label>
                    <input type="text" onChange={handelEmail}/>
                </div>
                <p>{errore}</p>
                <div className='form-group'>
                    <label>password</label>
                    <input type="text" onChange={handelPassword}/>
                </div>
                <p>{errorp}</p>
                <div className='form-group'>
                    <label>confirmPassword</label>
                    <input type="text" onChange={handelConfirmPassword}/>
                </div>
                <p>{errorc}</p>
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