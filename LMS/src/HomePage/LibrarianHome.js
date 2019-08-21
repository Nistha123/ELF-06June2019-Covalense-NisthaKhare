import React, { Component } from 'react'
import Axios from 'axios';
import UserHomeNavbar from '../navbar/UserHomeNavbar';

export class LibrarianHome extends Component{
    constructor(props){
        super(props);
        this.state = {
            bean: JSON.parse(localStorage.getItem("bean")),
        }
    }

    render(){
        return(
            <div>
                <UserHomeNavbar>name : {this.state.bean.name} </UserHomeNavbar>
            </div>

        )
    }
}