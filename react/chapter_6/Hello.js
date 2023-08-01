import React from "react";

function Hello(props) {
    return (
        <>
            <div>이름은 ?{props.name}</div>
            <div>나이는 ? {props.age}</div>
        </>
    );
}

export default Hello;