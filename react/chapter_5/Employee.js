import React from "react";

function Employee(props) {
    return (
        <div>
            <h1>사원번호 : {props.number}</h1>
            <h2>사원이름 : {props.name}</h2>
        </div>
    );
}

export default Employee;