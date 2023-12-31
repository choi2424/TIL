import React,{useReducer,useState} from 'react';

/*
상태관리를 목적으로 하는 Hook(훅)
-useState
-useReducer
*/

// use Reducer 응용예제
function App_Reducer() {

    // const [state변수, 사용자가 사용할 dispatch함수] = useReducer(리듀스함수:회계직원,상태변수초기값);

    const [number, setNumber] = useState(1);


    //비지니스 로직의 함수를 외부, 파일형태로 관리할수 있으며,고로 재사용이 된다.
    function countReducer(oldCount,action) {
        if (action.type === 'UP') {
            return oldCount + action.number;
        } else if (action.type === 'DOWN') {
            return oldCount - action.number;
        } else if (action.type === 'RESET') {
            return oldCount = 0;
        }
    }  

    const [count, countDispatch] = useReducer(countReducer, 0);
    
    
    // User가 호출할 함수. countDispatch-> countReducer 호출을 한다.
    function UP() {
        countDispatch({type:'UP',number:number}); // countReducer(oldCount,action) 호출. count -> oldCount
    }

    function DOWN() {
        countDispatch({type:'DOWN',number:number});// countReducer(oldCount,action) 호출
    }

    function RESET() {
        countDispatch({type:'RESET',number:number});// countReducer(oldCount,action) 호출
    }

    function changeNumber(event) {
        setNumber(Number(event.target.value));
    }

    return (
        <div>
            <input type='button' value='-' onClick={DOWN} />
            <input type='button' value='0' onClick={RESET} />
            <input type='button' value='+' onClick={UP} />
            <input type='text' value={number} onChange={changeNumber} />
            <p>{count}</p>
        </div>
    );
}


export default App_Reducer;