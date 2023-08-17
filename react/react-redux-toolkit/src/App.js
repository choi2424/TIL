import React from "react";
import { Provider } from "react-redux";
import store from "./store";
import Counter from "./Counter";

// (리덕스+리덕스툴킷)사용작업

// const state = {value:0}
// const action = {type:'up',step:2}
// 처음 실행 할때는 state 값만 존재하고 , action값은 없는 상태.

// import : 해당 파일에서 필요한 것을 참조
// export : 파일을 외부에서 참조를 가능하게 하는 의미
// 복사1 counterSlice.js (import,export 작업)
// reducer함수의 기능을 대신
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
