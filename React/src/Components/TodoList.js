    import React, {Component} from 'react';
    class TodoList extends Component{
        componentDidUpdate(){
            this.props.inputElement.current.focus()
        }
        render(){
            console.log("item key",this.props);
            return(
                <div className="todoListMain">
                    <div className="header">
                        <form onSubmit={this.props.addItem}>
                            <input style={{backgroundColor:this.props.color, width:'300px',height:'40px',marginTop:'50px'}} id="inputtxt" placeholder="Task"
                            ref={this.props.inputElement}
                            value={this.props.currentItem.text}
                            onChange={this.props.handleInput}
                            />
                            <button style={{width:'100px',height:'40px'}} type="Submit">Add Task</button>
                        </form>
                    </div>
                </div>
            )
        }
    }
    export default TodoList;