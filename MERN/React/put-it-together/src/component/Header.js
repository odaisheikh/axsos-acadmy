import React, { Component } from 'react';
    
    
class Heder extends Component {
    constructor(props) {
        super(props);
        this.state = {
            count:this.props.age,
        };
    }
    render() {
        const {name,color} = this.props
        return (
        <div>
            <h1>{name}</h1>
            <p>{this.state.count}</p>
            <p>hair color:{color}</p>
            <button type="button" onClick={()=>{ this.setState({count:this.state.count+1}) }}>click me</button>
        </div>
        );
    }
}
    
export default Heder;