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
            setErrorf("email should be at least 4 character");
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
                <div>
                    <p>first name</p>
                    <input type="text" onChange={handelFirstName}/>
                    <p>{errorf}</p>
                </div>
                <div>
                    <p>last name</p>
                    <input type="text" onChange={handelLastName}/>
                    <p>{errorl}</p>
                </div>
                <div>
                    <p>email</p>
                    <input type="text" onChange={handelEmail}/>
                    <p>{errore}</p>
                </div>
                <div>
                    <p>password</p>
                    <input type="text" onChange={handelPassword}/>
                    <p>{errorp}</p>
                </div>
                <div>
                    <p>confirmPassword</p>
                    <input type="text" onChange={handelConfirmPassword}/>
                    <p>{errorc}</p>
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