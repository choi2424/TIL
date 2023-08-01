import React from "react";
import Employee from "./Employee";

function EmployeeList() {
    return (
        <div>
            <Employee name="홍길동" number = {1} />
            <Employee name="손흥민" number = {2} />
            <Employee name="이강인" number = {3} />  
        </div>
    );
}

export default EmployeeList;