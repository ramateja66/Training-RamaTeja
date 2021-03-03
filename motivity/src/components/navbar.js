import React from 'react';
import 'bootstrap/dist/css/bootstrap.css' ;
import {useState} from 'react' ;
import {Link, Links, withRouter} from 'react-router-dom';

const Navbar=()=>
{
  const [searchTerm,setSearchTerm]=useState('')
  const navStyle={
    color:withRouter
  }
    return(
        <div>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <Link to="/">
      <a class="navbar-brand" href="#">Motivity</a>
      </Link>
    </div>

   
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      
        <li class="active">
        <Link to="/display"><a href="#">Employee Details<span class="sr-only">(current)</span></a></Link></li>
        
        <li>
        <Link to="/form">
        <a href="#">Add Employee</a>
        </Link>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Employee Option<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Update Employee</a></li>
            <li><a href="#">Delete Employee</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
    <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" onChange={event=>{setSearchTerm(event.target.value)}} placeholder="Search"></input>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>


        </div>
    )
}
export default Navbar