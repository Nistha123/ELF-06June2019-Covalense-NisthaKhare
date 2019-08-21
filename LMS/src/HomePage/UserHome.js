import React, { Component } from 'react';
import { Navbar, NavDropdown,Alert} from 'react-bootstrap';
import { BrowserRouter as Link } from 'react-router-dom';
import Axios from 'axios';
import UserHomeNavbar from '../navbar/UserHomeNavbar';

export class UserHome extends Component{
    constructor(props){
        super(props);
        this.state = {
            bean: JSON.parse(localStorage.getItem("bean")),
            name : localStorage.getItem("username")
        }
    }

    render(){
        return(
            <div>
            <div className="sidenav" style={{backgroundImage: 'url("https://images.unsplash.com/photo-1481627834876-b7833e8f5570?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=841&q=80")',width:300}}>
            <div className="login-main-text">
              <h1>WELCOME</h1>           
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