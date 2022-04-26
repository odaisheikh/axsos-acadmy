import React, { useState, useEffect } from 'react';
import io from 'socket.io-client';
import '../App.js';

export const Message = () => {

    const [socket] = useState(() => io(':8000'));
    const [text, setText]=useState("");
    const [chat, setChat]=useState([]);
    useEffect(() => {
        console.log('Is this running?');
        socket.on('connection', data => console.log(data));
        socket.on('message', data => {console.log(data);setChat([...chat,data])});
    });

    const handelSubmit =e=> {
        e.preventDefault()
        socket.emit("message",text)
    }

    return (
        <div className='App'>
            <div>
                {chat.map((mess,idx)=><p key={idx}>{mess}</p>)}
                {console.log(chat)}
            </div>
            <div>
                <form onSubmit={handelSubmit}>
                    <input type="text" onChange={e=>setText(e.target.value)}/>
                    <input type="submit" value="submit" />
                </form>
            </div>
        </div>
    )
}
