import React from "react";

// children 속성을 이용해 자식컴포넌트 내용을 출력할수가 있다.
function Wrapper({ children }) {
    // jsx구문에 style 적용시 object 문법을 사용해야 한다.
    const style = {
        border: '2px solid black',
        padding: '16px'
    };

    return (
        <div style={style}>
            {children}
        </div>
    );
}

export default Wrapper;