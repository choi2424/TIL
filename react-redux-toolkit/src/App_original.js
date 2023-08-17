import React from "react";
import { createSlice,configureStore } from "@reduxjs/toolkit";
import { Provider,useSelector,useDispatch } from "react-redux";

// (리덕스+리덕스툴킷)사용작업

// const state = {value:0}
// const action = {type:'up',step:2}
// 처음 실행 할때는 state 값만 존재하고 , action값은 없는 상태.

// import(가져오기) : 해당 파일에서 필요한 것을 참조
// export(내보내기) : 파일을 외부에서 참조를 가능하게 하는 의미
// 복사1 counterSlice.js (import,export 작업)
// reducer함수의 기능을 대신
const counterSlice = createSlice({
  name: 'counterSlice', // slice를 구분하기위한 유일한 이름이어야 한다
  initialState: {value:0}, // state(상태)로 사용할 값
  reducers: {
    up: (state, action) => {
      state.value = state.value + action.payload;
    },
    down: (state, action) => {
      state.value = state.value - action.payload;
    }
  }
});
// 복사2. store.js(import,export작업)
const store = configureStore({

  // counterSlice.reducer : counterSlice에서 실행되는 reducers의 요소중에 하나가 실행되어
  // state값을 참조하게된다.
  reducer: {
    counter:counterSlice.reducer // counter = {value : 3};
  }
});

// 복사3. Counter.js(import,export 작업)
function Counter() {
  // counterSlice.reducer 중('up',down) 하나를 호출하는 목적으로 존재.
  const dispatch = useDispatch();

  // useSelector : state로 관리되는 값을 참조할 때 사용
  const count = useSelector(state => {
    return state.counter.value;
  });

  return (
    <div>
      <button onClick={() => {
        dispatch(counterSlice.actions.up(2)); 
      }}>증가</button>
      <button onClick={() => {
        dispatch(counterSlice.actions.down(2)); 
      }}>감소</button>
      {count}
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
