import React, {Component} from 'react';
import '../App.css'

class TodoItems extends Component{
    constructor(props){
        super(props);
        this.createTasks=this.createTasks.bind(this);
    }
   createTasks(item){
       //console.log("del : ", this.props)
       return <li key={item.key}>{item.text} <button type="Submit" onClick={()=>this.props.delete(item.key)}>Delete</button> </li>
   }
    render(){
        const todoEntries = this.props.entries
        const listItems = todoEntries.map(this.createTasks)
        return(
            <ul className="thelist" >{listItems}</ul>
        )
    }
}
export default TodoItems;