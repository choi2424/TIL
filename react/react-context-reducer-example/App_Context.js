import React, {createContext,useContext} from 'react';
import './style.css';

// 1)데이터 : 스타일
const themeDefault = { border: '10px solid red' }; 

// 2)컨텍스트 객체 생성 - 데이터
const themeContext = createContext(themeDefault);
/* 
Context API?
  - 리액트 기본기능중의 하나.
  - Props를 사용하지 않고, 컴포넌트에 특정한 값을 쉽게 공유할수 있는 기능
  - 프로젝트 작업시 전역 상태를 관리할 때 주로 사용.

  사용법
  createContext(공유목적의 특정한 값);

  각 함수컴포넌트에서 사용
  const 객체명 = useContext(themeContext);
*/

// 예시를 스타일로 들었을뿐 스타일데이터에 너무 몰입하지말고 그냥 데이터를 잡어넣었다 생각하자

function App_Context() {
  // 3)컨텍스트객체 사용구문
  const theme = useContext(themeContext);

  return (
    <themeContext.Provider value={{border : '10px solid blue'}}>
    <div className='root' style={theme}>
      <h1>Hello World!</h1>
      <Sub1 />
    </div>
    </themeContext.Provider>

  );
}

// sub2컴포넌트의 부모인 sub1에 해야 sub2밑으로 적용된다.
function Sub1() {
  // 3)컨텍스트객체 사용구문
  
  return (
    
    <div>
      <h1>Sub1</h1>
      <Sub2 />
    </div>
    
  );
};

function Sub2() {
  // 3)컨텍스트객체 사용구문
  const theme = useContext(themeContext);
  return (
    <div style={theme}>
      <h1>Sub2</h1>
      <Sub3 />
    </div>
  );
};

function Sub3() {
  // 3)컨텍스트객체 사용구문
  const theme = useContext(themeContext);
  return (
    <div style={theme}>
      <h1>Sub3</h1>
    </div>
  );
};

export default App_Context;
