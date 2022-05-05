import React, { useEffect, useState } from 'react'
import {Project} from '../components/Project'
import axios  from 'axios';
import {
    Link,
    } from "react-router-dom";
import Compleated from './Compleated';
import Start from './Start'
import Progress from './Progress'
const Main = () => {
    const [project, setProject] = useState([]);
    const [loaded, setLoaded] = useState(false);
    const start =[];
    const inProgress = [];
    const compleated = [];

    useEffect(() => {
        axios.get('http://localhost:8000/api/projects')
            .then(res =>{ 
                setProject(res.data);
                setLoaded(true);
                
            });
    }, [])
    const removeFromDom = personId => {
        setProject(project.filter(person => person._id != personId));
    }
    
    
        loaded&&project.map((item,index)=>
            item.status == "start"?start.push(item):item.status=="progress"?inProgress.push(item):compleated.push(item)
            // console.log(start)
            // console.log(project)
        
        )
        const update = (id) => {
            axios.put('http://localhost:8000/api/projects/' + id, {status:"progress"})
                .then(res => {console.log(res)})
                .catch(err=>{
                    console.log("somthing wrong")
                })       
        }

        const updateIn = (id) => {
            axios.put('http://localhost:8000/api/projects/' + id, {status:"compleate"})
                .then(res => {console.log(res)})
                .catch(err=>{
                    console.log("somthing wrong")
                })       
        }

        const delet = id => {
            axios.delete('http://localhost:8000/api/projects/' + id+'/delete')
                .then(res=>{removeFromDom(id)
                })
        }

    
    return (
        <div>
            <div style={{display:'flex' ,justifyContent:'space-around'}}>
                <div style={{border:'1px solid black', width:'300px'}}> {loaded&&<Start update={update} Items={start}/>}</div>
                <div style={{border:'1px solid black' , width:'300px'}} >{loaded&&<Progress updateIn={updateIn} Items={inProgress}/>}</div>
                <div style={{border:'1px solid black' , width:'300px'}}> {loaded&&<Compleated removeFromDom={removeFromDom} Items={compleated} />}</div>
            </div> 
            <div><Link to='/addProject'>add project</Link></div>
            {console.log(start)}
        </div>
    )
    }

export default Main
