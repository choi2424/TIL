import React from "react";

// 조건부 렌더링
function Hello({isState}) {
    return (
        <div >
            {isState ? "Hello World React!!!" : "안녕하세요 리액트입니다.!!!" }
        </div>
    );
}

export default Hello;