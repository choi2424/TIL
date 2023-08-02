import {useState} from "react";

function Counter() {

    // 자바스크립트 구문 삽입위치

    

    //카운트 기능을 담당할 구문.
    /*
    useState(0) 구문이 동작되면, 2개요소를 갖는 배열형태의 기억장소가 생성된다.
    [0] 첫번째 요소는 초기값을 갖게되는 기억장소가 되고, [1] 두번째 요소는 set 기능을 하는 함수가 존재하게 된다.
    set 기능은 [0] 첫번째 요소의 기억장소의 값을 변경하는 목적으로 만들어져 있다.
    */
    /*
    const numberState = useState(0);
    const number = numberState[0];
    const setnumber = numberState[1];
   */
    
    // useState 훅으로 생성된 기억장소는 값이 변경되면 , 해당 counter컴포넌트가 다시 렌더링되는 특징이 있다.

    console.log("렌더링");

    const [number, setnumber] = useState(0);

    // +1 버튼 클릭시 호출되는 함수
    const onIncrease = () => {
        /*
        count += 1;
        console.log(number);
        */
        
        // number = number + 1; 읽기 동됴이고, number가 가리키는 기억장소의 변경작업은 setnumber()함수로 해줘야한다.
        setnumber(number + 1);
    }

    // -1 버튼 클릭시 호출되는 함수
    const onDecrease = () => {
        setnumber(number - 1);
    }

    return (
        <div>
            <h1>{ number }</h1>
            <button onClick={onIncrease}>+1</button>
            <button onClick={onDecrease}>-1</button>
        </div>
    );
}

export default Counter;