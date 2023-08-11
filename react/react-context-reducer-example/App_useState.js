import React,{useState} from 'react';

/*
상태관리를 목적으로 하는 Hook(훅)
-useState
-useReducer
*/

function App_useState() {
    // 일반변수
    // let count = 0;
    const [count, setCount] = useState(0);

    function up() {
        setCount(count + 1);
    }

    function down() {
        setCount(count - 1);
    }

    function reset() {
        setCount(0);
    }
    return (
        <div>
            <p>{count}</p>
            <input type='button' value='-' onClick={down} />
            <input type='button' value='0' onClick={reset} />
            <input type='button' value='+' onClick={up} />
            
        </div>
    );
}


export default App_useState;