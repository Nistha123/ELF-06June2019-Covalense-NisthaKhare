import React, { Component } from 'react'
import Axios from 'axios';
import { Navbar, NavDropdown, Form, FormControl, Button } from 'react-bootstrap'
import UserHomeNavbar from '../navbar/UserHomeNavbar';

export class HomePage extends Component{
    constructor(props){
        super(props);
        this.state = {
            bean: JSON.parse(localStorage.getItem("bean")),
        }
        this.createUserPath = this.createUserPath.bind(this);
        this.viewAllUser = this.viewAllUser.bind(this);
    }
    createUserPath(){
        let path = '/createuser';
        this.props.history.push(path);
    }
    viewAllUser(event){
        debugger;
        event.preventDefault();
        Axios.get('http://localhost:8090/login/getalluser') 
        .then((response) => {
            const responseData = response.data;
            localStorage.setItem("bean",JSON.stringify(responseData.lstInfoBean[0]));

            this.props.history.push('/viewalluser');
        }).catch(err=>{
            console.log(err)
        })  
    }

    render(){
        return(
            <div>
            <div className="sidenav" style={{backgroundColor:'black',width:400}}>
            <div className="login-main-text">
              <h2 style={{fontWeight:'bold'}}>Welcome Admin</h2>
              <br/>
              <br/>

              <Button onClick={this.viewAllUser} style={{width:200,marginTop:100,marginBottom:30}} variant="outline-info" type="submit">View All Users</Button>
              <br/>
              <Button onClick={this.createUserPath} style={{width:200}} variant="outline-info" type="submit">Create New User</Button>         
          </div>
       </div>
            <div>    
                <UserHomeNavbar>
                    <h3>{this.state.name}</h3>
                </UserHomeNavbar>
       
            </div>
            </div>

        )
    }
}