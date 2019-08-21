import React, { Component } from 'react'
import Axios from 'axios';
import UserHomeNavbar from '../navbar/UserHomeNavbar';

export class ViewUsers extends Component{
    constructor(props){
        super(props);
        this.state = {
            bean: JSON.parse(localStorage.getItem("bean")),
        }

        console.log("beans " , this.state.bean)
    }

    render(){
        return(
            <div>
                <UserHomeNavbar>name : {this.state.bean.name} </UserHomeNavbar>
                <table>
                    <thead>
                        <tr>
                        <th>Name</th><th>Age</th>
                        </tr>
                        </thead>                 
                <tbody>

                   const mappingData;
                  const data = {this.state.bean.map(user=>{
                        <tr>
                        <td>{user.name}</td>
                    </tr>
                    }
                        
                    )}
                </tbody>
      </table>
            </div>

        )
    }
}