import React from "react";

function Hello(props) {

    // 리액트에서는 style구문을 사용시 object구문으로 사용해야 한다.(중요)

    return (
        <>
            
            <div>이름은 ?{props.name}</div>
            <div style = {{color:props.color}}>나이는 ? {props.age}</div>
        </>
    );
}

export default Hello;