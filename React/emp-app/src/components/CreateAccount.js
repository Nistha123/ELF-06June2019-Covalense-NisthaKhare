import React, { Component } from 'react'
import Axios from 'axios';

export default class CreateAccount extends Component {
    constructor(props){
        super(props);
        this.state = {
            name : '',
            email : '',
            phoneno : '',
            password : ''
        }
        this.postData = this.postData.bind(this);
    }
    postData(event){
        event.preventDefault();
        console.log('post data',this.state);
        let accountData = this.state;
        Axios.post('https://emp-application-967ef.firebaseio.com/accounts.json', accountData).
                    then((response)=>{
                        console.log('Response Object',response)
                        this.setState({
                            name : '',
                            email : '',
                            phoneno : '',
                            password : ''
                        })
                    }).catch((error)=>{
                        console.log('Error',error)
                    })
    }

    render() {
        return (
            <div>
                <form onSubmit={this.postData}>
  <div className="row" style={{marginTop:50 , marginBottom:20 , marginLeft:200 , marginRight:5, width:1000}}>
    <div className="col">
      <input type="text" value={this.state.name} onChange={(event)=>{this.setState({name:event.target.value})}}
       className="form-control" placeholder="Enter Name"/>
    </div>
    <div className="col">
      <input type="email" value={this.state.email}  onChange={(event)=>{this.setState({email:event.target.value})}}
       className="form-control" placeholder="Enter Email"/>
    </div>
  </div>
  <div className="row" style={{marginTop:20 , marginLeft:200, marginRight:5, width:1000}}>
    <div className="col">
      <input type="number" value={this.state.phoneno}  onChange={(event)=>{this.setState({phoneno:event.target.value})}}
       className="form-control" placeholder="Enter Phone_no"/>
    </div>
    <div className="col">
      <input type="password" value={this.state.password}  onChange={(event)=>{this.setState({password:event.target.value})}}
       className="form-control" placeholder="Enter Password"/>
    </div>
  </div>
  <div>
      <button style={{marginLeft:670,marginTop:40}} className='btn btn-info'>Create</button>
  </div>
</form>
          </div>
        )
    }
}
