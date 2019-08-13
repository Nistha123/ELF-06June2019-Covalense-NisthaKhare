import React, { Component } from 'react'
import Axios from 'axios';

export default class ViewAccount extends Component {
    constructor(props){
        super(props)
        this.state = {
            accounts : []
        }
    }

    componentDidMount(){
        Axios.get('https://emp-application-967ef.firebaseio.com/accounts.json')
        .then((response)=>{
            console.log('Fetched Data : ',response.data)
            let fetchedAccounts = [];
            for(let key in response.data){
                fetchedAccounts.push({
                    ...response.data[key],
                    id : key
                })
            }
            
        }).catch((error)=>{
            console.log('Error :',error)
        })
    }

    render() {
        return (
            <div>
                <table className="table table-striped">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Contact</th>
      <th scope="col">Password</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
  </tbody>
</table>
            </div>
        )
    }
}

