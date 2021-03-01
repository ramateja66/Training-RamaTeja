import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employee } from 'src/app/models/employee.model';
import { EmployeeService } from 'src/app/services/employee.service';
import { ActivatedRoute,Router } from '@angular/router';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  id: number=0;
  header:string="";
  button:string="";
  employee : Employee = {
    id:0,
    name:"",
    email:"",
    phone:0
  };
  constructor(private router: Router,private route: ActivatedRoute,private employeeservice:EmployeeService) { }

  ngOnInit(): void {
    this.id=+this.route.snapshot.params['id'];
    this.header = this.id === 0 ? 'Add Employee': 'Edit Employee';
    this.button = this.id === 0 ? 'save': 'update';
    if(this.id === 0){
       this.employee.id= this.employeeservice.latestId+1;
     }
    if(this.id != 0){
      this.employee = this.employeeservice.onGetEmployee(this.id);
      console.log(this.employee);
    }
  }
  onSubmit(form: NgForm){
    let employee: Employee = {
      id: form.value.id,
      name: form.value.name,
      email: form.value.email,
      phone: form.value.phone,
    }

    if(this.id === 0){
     this.employeeservice.onAdd(employee);
    }else{
      this.employeeservice.onUpdate(employee);
    }
    this.router.navigateByUrl('/view');
  }
}
