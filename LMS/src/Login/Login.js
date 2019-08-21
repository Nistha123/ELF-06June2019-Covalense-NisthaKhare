import React, { Component } from 'react'
import Axios from 'axios';
import { BrowserRouter as Link } from 'react-router-dom'
import { Navbar, NavDropdown,Alert} from 'react-bootstrap'
import './login.css'
import 'bootstrap/dist/css/bootstrap.css'

export class Login extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: '',
            password: '',
            show: false
        }
        this.postData = this.postData.bind(this);
    }

    postData(event){
        event.preventDefault();
        Axios.post('http://localhost:8090/login/authenticate' , null ,{
            params : 
            {
                id : this.state.id,
                password : this.state.password
            }
        }    
        ).then((response) => {
            const responseData = response.data;
        
            if(responseData.message==='success'){
                localStorage.setItem("bean",JSON.stringify(responseData.lstInfoBean[0]));
                localStorage.setItem("username",responseData.lstInfoBean[0].name);
                localStorage.setItem("usertype",responseData.lstInfoBean[0].userType)
                if(localStorage.getItem("usertype")==="Admin"){
                    this.props.history.push('/adminhomePage')
                }else if(localStorage.getItem("usertype")==="User"){
                    this.props.history.push('/userhomePage')
                }else{
                    this.props.history.push('/libhomePage')
                }              
            }
            else{
                this.setState({
                    show: true
                })
                this.props.history.push("/")
            }
        })
        .catch((error) => {
            console.log('Error Object', error);
        })
    }
render() {
    return (
        <div>
             <Navbar bg="light" style={{color:'black'}} >
                    <Navbar.Brand href="#home">
                       
            </Navbar.Brand>
                    <Navbar.Toggle />
                    <Navbar.Collapse className="justify-content-end">
                        <NavDropdown className="mr-5" title="Login As" id="basic-nav-dropdown">
                            <Link className="nav-link" to="/"><NavDropdown.Item>Admin</NavDropdown.Item></Link>
                            <Link className="nav-link" to="/info"><NavDropdown.Item>Librarian</NavDropdown.Item></Link>
                            <Link className="nav-link" to="/info"><NavDropdown.Item>User</NavDropdown.Item></Link>
                        </NavDropdown>
                    </Navbar.Collapse>
                </Navbar>
        <div className="sidenav" style={{backgroundImage: 'url("https://images.unsplash.com/photo-1481627834876-b7833e8f5570?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=841&q=80")',width:400}}>
         <div className="login-main-text">
             <h2>Applicaton<br/> Login Page</h2> 
             <p>Login or register from here to access.</p>           
         </div>
      </div>
      <div className="main" style={{marginTop:200, marginBottom:2000}}>
         <div className="col-md-6 col-sm-12">
            <div className="login-form">
            {this.state.show ?
                            <Alert variant="danger">
                                <Alert.Heading>Invalid Credentials!</Alert.Heading>
                            </Alert>

                             : null

                                }
               <form onSubmit={this.postData}>
                  <div className="form-group">
                     <label style={{font:70}}>User ID</label>
                     <input type="id" 
                     onChange={(event) => {
                        this.setState({
                            id: event.target.value
                        })
                    }}
                        value={this.state.id} type="number"
                        className="form-control" name="id" 
                     placeholder="User ID"/>
                  </div>
                  <div className="form-group">
                     <label>Password</label>
                     <input onChange={(event) => {
                                                this.setState({
                                                    password: event.target.value
                                                })
                                            }}
                                                value={this.state.password} type="password"
                                                className="form-control" name="password"
                                                placeholder="Enter Password"/>
                  </div>
                  <button type="submit" style={{marginRight:10}} className="btn btn-secondary">Login</button>
                  <button type="submit" className="btn btn-secondary">Reset</button>
                  <div className="" style={{marginTop:20}}>
	                <a href="https://phpoll.com/recover" style={{color:'black'}} tabIndex="5" className="forgot-password">Forgot Password?</a>
				  </div>
               </form>
            </div>
         </div>
      </div>
    
        </div>

    );
  }
}