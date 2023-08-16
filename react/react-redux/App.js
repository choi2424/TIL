import React, { useState } from 'react';
import { createStore } from 'redux';
import { Provider, useSelector , useDispatch } from 'react-redux';
import './style.css';

// 리덕스 사용한 예제.
// props 작업이 없는 상태로 시작
// 공유데이터를 특정 함수컴포넌트에서 사용.
// store : 상태관리를 전문적으로 하는 곳.

// 상태관리를 하는 함수 : 요청을 받아 값을 변경하는 작업
// 예를 들면, const [currentState, setCurrentState] = useState({number : 1});
// return 되는 값이 상태관리로 사용되는 데이터.
// useSelector 사용하게되면 reducer 함수동작된 state 값을 참조할 수가 있다
function reducer(currentState, action) {

  console.log("reducer");
  // 처음에 참조됨
  if (currentState === undefined) {
    return {
      number: 1
    };
  };
  const newState = { ...currentState }; // spread 연산자 : 복제기능

  if (action.type === 'PLUS') {
    newState.number++;
  }

  return newState;
}

// 1단계 - reducer 함수작업이 선행되어야 한다.
const store = createStore(reducer); // reducer함수가 참조

function App() {
  
  return (
    <div div id="container">
      <h1>Root</h1>
      <div id='grid'>
        {/* store 가 사용될 함수컴포넌트에 이래 작업을 해줘야 한다. */}
        <Provider store={store}>
          <Left1></Left1>
          <Right1></Right1>
        </Provider>
      </div>
    </div>
  );
}

function Left1() {
  return (
    <div>
      <h1>Left1 : </h1>
      <Left2 />
    </div>
  );
}

function Left2() {
  return (
    <div>
      <h1>Left2 :</h1>
      <Left3 />
    </div>
  );
}

function Left3() {

  // 3단계. 실제 reducer함수가 동작되어 return된 값을 state 변수값으로 참조한다.
  const number = useSelector((state) => state.number);
  return (
    <div>
      <h1>Left3 :{ number }</h1>
    </div>
  );
}

function Right1() {
  return (
    <div>
      <h1>Right1</h1>
      <Right2 />
    </div>
  );
}

function Right2() {
  return (
    <div>
      <h1>Right2</h1>
      <Right3 />
    </div>
  );
}

function Right3() {
  // 4단계 : state변경작업을 reducer()함수에게 요청.
  const dispatch = useDispatch();
  return (
    <div>
      <h1>Right3</h1>
      <input type='button' value='증가' onClick={() => {
        dispatch({ type: 'PLUS' }); // type 키는 필수, reducer()함수 호출.
      }} />
    </div>
  );
}

export default App;
