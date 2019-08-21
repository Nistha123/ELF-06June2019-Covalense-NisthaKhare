import React, { Component } from 'react'
import { Navbar, NavDropdown, Form, FormControl, Button } from 'react-bootstrap'
import { BrowserRouter as Link } from 'react-router-dom'
import Axios from 'axios';
import { withRouter } from 'react-router-dom'
class UserHomeNavbar extends Component {
    constructor(props) {
        super(props);
        this.state = {
            searchId: ''
        }
    }

    searchEmployee = (event) => {
        event.preventDefault();
        Axios.get('http://localhost/emp-springrest/employee/searchEmployee?empId=' + this.state.searchId
        ).then((response) => {
            console.log('Response Data', response.data);
            const responseData = response.data;
            if (responseData.statusCode === 201 && responseData.message === "Successfull") {
                localStorage.removeItem('beans');
                localStorage.setItem('beans', JSON.stringify(responseData.beans))
                this.props.history.push("/searchEmployee")

            }
        }).catch((error) => {
            console.log('Error', error);
        })
    }

    render() {
        return (
            <div>
                <Navbar bg="light">
                    <Navbar.Brand href="#home">
            </Navbar.Brand>
                    <Navbar.Collapse>
                        <Form className="mx-auto" onSubmit={this.searchEmployee} inline>
                            <FormControl type="text" onChange={(event) => {
                                this.setState({
                                    searchId: event.target.value
                                })
                            }} value={this.state.searchId} placeholder="Search" className="mr-sm-2" />
                            <Button variant="outline-success" type="submit">Search</Button>
                        </Form>
                    </Navbar.Collapse>
                    <Navbar.Toggle />
                    <Button variant="outline-success" type="submit">Logout</Button>
                </Navbar>
                
                <br />
            </div>
        )
    }
}

export default withRouter(UserHomeNavbar)
