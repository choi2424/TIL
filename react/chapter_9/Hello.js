import React from "react";

// 비구주화 할당(구조분해) 문법사용

function Hello({ name, age, color }) {

    // 리액트에서는 style구문을 사용시 object구문으로 사용해야 한다.(중요)
    // object문법에서 {color : color} key, value 동일하면 , {color} 문법표기 가능
    return (
        <>
            
            <div>이름은 ?{name}</div>
            <div style = {{color}}>나이는 ? {age}</div>
        </>
    );
}
// 속성 : 기본값

Hello.defaultProps = {
    name: '이름없음',
    age : 50
}

export default Hello;