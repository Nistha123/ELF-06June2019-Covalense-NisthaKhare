import React, {Component} from 'react';
import TodoList from './Components/TodoList';
import TodoItems from './Components/TodoItems';
import './App.css';
import './Components/DottedBox';
//import DottedBox from './Components/DottedBox';
import BootstrapComponent from './Components/Bootstrapcomponent'

class App extends Component {
  inputElement = React.createRef()
  constructor(){
    super()
    this.state = {
      items : [],
      currentItem: {text:'',key:''},
      color:'blue'
    }
    
  }
  handleInput = e =>{
    const itemText = e.target.value
    if(itemText.length!=0){
      this.setState({
        color:'grey'
      })
    } else{
      this.setState({
        color:'pink'
      }) 
    }
    console.log("Item is " + itemText)
    const currentItem = {text: itemText , key: Date.now()}
    this.setState({
      currentItem
    })
  }
  addItem = e =>{
    e.preventDefault();
    const newItem = this.state.currentItem
    if(newItem.text !== ''){
      console.log(newItem)
      const items = [...this.state.items,newItem]
      this.setState({
        items: items,
        currentItem: {text: '',key: ''},
        
      })
    }
   
  }

  deleteItem = key =>{
    const selectItem = this.state.items.filter(item => {
      return item.key!==key
    })
   this.setState({
     items: selectItem
   })
    
  }

  render() {
    return (
      <div className = "App" >
        <TodoList addItem={this.addItem} 
                  inputElement={this.inputElement}
                  handleInput={this.handleInput}
                  currentItem={this.state.currentItem}
                  color={this.state.color}
                  onchange={this.onchange} />
        <TodoItems entries={this.state.items} delete={this.deleteItem}/>
        <BootstrapComponent/>
        {/* <DottedBox /> */}
      </div>
    )
  }
}


export default App;