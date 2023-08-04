import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
//import Employee from './chapter_5/Employee';
//import EmployeeList from './chapter_5/EmployeeList';
// import Hello from './chapter_6/Hello';
// import Hello from './chapter_7/Hello';
// import Hello from './chapter_8/Hello';
//import Hello from './chapter_9/Hello';
//import Wrapper from './chapter10/Hello';
//import Hello from './chapter_11/Hello';
//import Counter from './chapter_12/Counter';
//import InputState from './chapter_13/inputState';
//import InputState from './chapter_14/inputState';
//import InputState from './chapter_15/inputState';
//import UserList from './chapter_16/UserList';
//import UserList from './chapter_17/UserList'
//import UserList from './chapter_18/UserList';
//import CreateUser from './chapter_18/CreateUser';

import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>

    {/*
    <Wrapper>
      <Hello name={`홍길동`} age={100} color={`red`} />
      <Hello color={`pink`} />
    </Wrapper>
     */}



    {/* 속성을 이용한 조건부 랜더링 */}
    {/* import Hello from './chapter_11/Hello'; */}
    {/* <Hello isState /> 아래와 동일하다 .isState 속성은 true로 해석된다. */}
    {/*<Hello isState={true}/>*/}

    {/*리액트 훅: uesState */}
    {/* <InputState /> */}
    {/* import InputState from './chapter_14/inputState'; */}

    {/* //import InputState from './chapter_15/inputState'; */}
    {/* <InputState /> */}

    {/* import UserList from './chapter_17/UserList' */}
    {/* <UserList /> */}
    
    {/*
      import UserList from './chapter_18/UserList';
      import CreateUser from './chapter_18/CreateUser';*/} 
    {/* <CreateUser /> */}
    {/* <UserList /> */}
    
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
