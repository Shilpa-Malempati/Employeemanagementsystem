import axios from 'axios';

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/";

class EmployeeService {

    getEmployees(){
        return axios.get(EMPLOYEE_API_BASE_URL+'employee/findAll');
    }

    createEmployee(employee){
        return axios.post(EMPLOYEE_API_BASE_URL+'addEmployee', employee);
    }

    getEmployeeById(employeeId){
        console.log("url"+ EMPLOYEE_API_BASE_URL + '/' + employeeId);
        return axios.get(EMPLOYEE_API_BASE_URL + '/employee/find/' + employeeId);
    }

    updateEmployee(employee, employeeId){
        return axios.put(EMPLOYEE_API_BASE_URL + '/updateEmployee' , employee);
    }

    deleteEmployee(employeeId){
        return axios.delete(EMPLOYEE_API_BASE_URL + 'deleteEmployee/' + employeeId);
    }
}
export default new EmployeeService()