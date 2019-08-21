import React, { Component } from 'react'
import Axios from 'axios';
import './CreateUser.css';
import UserHomeNavbar from '../navbar/UserHomeNavbar';
import { Navbar, NavDropdown, Form, FormControl, Button } from 'react-bootstrap'

export class CreateUser extends Component {
    constructor(props){
        super(props);
        this.state = {
            id : '',
            name : '',
            age : '',
            address : '',
            password : '',
            city : '',
            phoneno : '',
            reg_date : '',
            userType : ''
        }
        this.backToHomePage = this.backToHomePage.bind(this);
    }
    backToHomePage(event){
        event.preventDefault();
        console.log('post data',this.state);
        debugger;
        let bean = this.state;
        Axios.post('http://localhost:8090/login/create', bean).
                    then((response)=>{
                        console.log('Response Object',response)
                        this.setState({
                            id : '',
                            name : '',
                            age : '',
                            address : '',
                            password : '',
                            city : '',
                            phoneno : '',
                            reg_date : '',
                            userType : ''
                        })
                        const responseData = response.data;
                        if(responseData.message === 'success'){
                            let path = '/adminhomePage';
                            this.props.history.push(path)
                        }
                    }).catch((error)=>{
                        console.log('Error',error)
                    })
                  }

    render(){
        return(
            <div>
                 <div>    
                 <Navbar bg="light">
        
                    <Navbar.Brand href="#home">
            </Navbar.Brand>
                    <Navbar.Toggle />
                    <Button className="ml-auto" variant="dark" type="submit">Logout</Button>
                </Navbar>
       
            </div>

            <div className="sidenav" style={{backgroundImage: 'url("https://images.unsplash.com/photo-1481627834876-b7833e8f5570?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=841&q=80")',width:400}}>
         <div className="login-main-text">
             <h2 style={{fontWeight:'bold'}}>User Registration</h2>         
         </div>
      </div>
           
            <div style={{marginLeft:700}} className="form-style-5">
               
<form onSubmit={this.backToHomePage}>
<fieldset>
<legend><span className="number">1</span> User Info</legend>
<input type="text" name="field2" value={this.state.name}
 onChange={(event)=>{this.setState({name:event.target.value})}} placeholder="Enter Name *"/>
<input type="number" name="field2" value={this.state.age}
onChange={(event)=>{this.setState({age:event.target.value})}} placeholder="Enter age *"/>
<input type="text" name="field2" value={this.state.address}
 onChange={(event)=>{this.setState({address:event.target.value})}} placeholder="Enter address *"/>
<input type="text" name="field2" value={this.state.city}
 onChange={(event)=>{this.setState({city:event.target.value})}} placeholder="Enter city *"/>
<input type="number" name="field2" value={this.state.phoneno}
 onChange={(event)=>{this.setState({phoneno:event.target.value})}} placeholder="Enter phoneno *"/>
<input type="date" name="field2" value={this.state.reg_date}
 onChange={(event)=>{this.setState({reg_date:event.target.value})}} placeholder="Enter reg_date *"/>
<input type="text" name="field2" value={this.state.userType}
 onChange={(event)=>{this.setState({userType:event.target.value})}} placeholder="Enter userType *"/>
</fieldset>

<fieldset>
<legend><span className="number">2</span> Login Information:</legend>
<input type="number" name="field1" value={this.state.id}
 onChange={(event)=>{this.setState({id:event.target.value})}} placeholder="Enter ID *"/> 
<input type="password" name="field2" value={this.state.password}
 onChange={(event)=>{this.setState({password:event.target.value})}} placeholder="Enter password *"/> 
</fieldset>
<input type="submit" value="Create" />
</form>
</div>
</div>
        )
    }
}

