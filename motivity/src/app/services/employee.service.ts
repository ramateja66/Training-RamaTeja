import { Injectable } from '@angular/core';
import { Employee } from '../models/employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  employees: Employee[] = [
   // {
   //  id: 1,
   //   name: "ram",
//email: "ram@gmail.com",
   //   phone: 889729
   // },
   // {
   //   id: 2,
   //   name: "hbi",
   //   emai{
   //  l: "k@gmail.com",
   //   phone: 9156780
   // },
  //  {
    //  id: 3,
   //   name: "rj",
   //   email: "j@gmail.com",
   //   phone: 9901234
  //  }
  ];
  latestId:number = this.employees.length;
  constructor() { }

    onGet(){
    return this.employees;
  }

  onAdd(employee: Employee){
    this.employees.push(employee);
     this.latestId=employee.id;
  }

  

  onDelete(id: number){
    let emp = <Employee>this.employees.find(x=>x.id === id);
    let index = this.employees.indexOf(emp,0)
    this.employees.splice(index,1);
  }

  onGetEmployee(id: number){
     let emp = <Employee>this.employees.find(x=>x.id === id);
    return emp;
  }

  onUpdate(employee: Employee){
    let oemployee = <Employee>this.employees.find(x=> x.id === employee.id);
    oemployee.name = employee.name;
    oemployee.email = employee.email;
    oemployee.phone = employee.phone;
  }
}
