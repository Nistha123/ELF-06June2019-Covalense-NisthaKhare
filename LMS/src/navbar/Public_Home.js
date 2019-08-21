import React from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import { Login } from '../Login/Login'
import { HomePage } from '../HomePage/HomePage'
import {UserHome} from '../HomePage/UserHome'
import {LibrarianHome} from '../HomePage/LibrarianHome'
import {CreateUser} from '../CreateUser/CreateUser'
import {ViewUsers} from '../ViewUser/ViewUsers'
//import { SearchEmployee} from '../searchEmployee/SearchEmployee'
export const PublicHome = (props) => {
    return (
        <Router>
            <Route exact path="/" component={Login} />
            <Route exact path="/adminhomePage" component={HomePage}/>
            <Route exact path="/userhomePage" component={UserHome}/>
            <Route exact path="/libhomePage" component={LibrarianHome}/>
            <Route exact path="/createuser" component={CreateUser}/>
            <Route exact path="/viewalluser" component={ViewUsers}/>
            {/* <Route exact path="/searchEmployee"  component={SearchEmployee}/> */}
            {/* <Route exact path="/info" component={Info}/> */}
        </Router>
    )
}