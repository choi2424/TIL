import React from "react";
import { createStore } from "redux";
import { Provider,useSelector,useDispatch } from "react-redux";

// 리덕스 작업
// 리액트 툴킷 미사용 작업

// const state = {value:0}
// const action = {type:'up',step:2}
// 처음 실행 할때는 state 값만 존재하고 , action값은 없는 상태.

function reducer(state, action) {
  if (action.type === 'up') {
    return { ...state, value: state.value + action.step };
  }
  return state;
}
// state로 사용되는 데이터 유형 : number, string, boolean, object, array등이 사용가능.
const initialState = { value: 0 };
const store = createStore(reducer, initialState);

function Counter() {
  const dispatch = useDispatch();
  const count = useSelector(state => state.value);

  return (
    <div>
      <button onClick={() => {
        dispatch({ type: 'up', step: 2 }); // action 매개변수의 값으로 javascript의 object문법사용
      }}>증가</button> {count}
    </div>
  );
}

function App() {
  return (
    <Provider store={store}>
      <div>
        <Counter></Counter>
      </div>
    </Provider>
  );
}

export default App;
