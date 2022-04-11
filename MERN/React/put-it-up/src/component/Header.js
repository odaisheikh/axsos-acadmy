import React, { Component } from 'react';
    
    
class Heder extends Component {
    render() {
        const {name,age,color} = this.props
        return (
        <div>
            <h1>{name}</h1>
            <p>{age}</p>
            <p>here color:{color}</p>
        </div>
        );
    }
}
    
export default Heder;