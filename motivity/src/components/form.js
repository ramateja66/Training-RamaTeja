import React, { Component } from 'react'
import Display from './display';


class Form extends Component
{
    employeeData
    constructor()
    {
    super();
    this.state={
        employeeData:[
            {
                name:"gambhir",
                age:24,
                email:"gambhir@gmail.com",
                address:"kolkata"
            },{
                name:"raina ",
                age:28,
                email:"raina@gmail.com",
                address:"chennai"
            },
        ]
    }
    }
    handleSubmit=(e)=>
    {
        e.preventDefault();
        let employeeData=this.state.employeeData;
        let name=this.refs.name.value;
        let age=this.refs.age.value;
        let email=this.refs.mail.value;
        let address=this.refs.address.value;
        let newEmp={
            "name":name,
            "email":email,
            "age":age,
            "address":address
        }
        employeeData.push(newEmp);

        this.setState({
            employeeData:employeeData,
        })
        this.refs.myform.reset();

        

    }
   handleDelete=(i)=>
    {
        let employeeData=this.state.employeeData;
        employeeData.splice(i,1);
        this.setState({
            employeeData:employeeData
        });

    }
    render()
    {
        let employeeData=this.state.employeeData;
        return(
            <div>
                <form ref="myform">
                    <label>Name</label>
                    <input type="text" ref="name"></input>
                    <label>Age</label>
                    <input type="numbert" ref="age"></input>
                    <label>Address</label>
                    <input type="text" ref="address"></input>
                    <label>Email</label>
                    <input type="text" ref="mail"></input>
                    <button onClick={e=>this.handleSubmit(e)}>Sbmit</button>
                </form>
               <br/>
               
               <br />
               <table border="2" align="center">
                   <tr>
                   <th>Name</th>
                   <th>Email</th>
                   <th>Age</th>
                   <th>address</th>
                   <th></th>
                   </tr>
                   {
                       employeeData.map((data,i) =>
                       <tr key={i}>
                           <td>{data.name}</td>
                           <td>{data.email}</td>
                           <td>{data.age}</td>
                           <td>{data.address}</td>
                           <td><button onClick={()=>this.handleDelete(i)}>Delete</button></td>
                       </tr>
                       )
                   }
               </table>
            </div>
        )
    }
}
export default Form