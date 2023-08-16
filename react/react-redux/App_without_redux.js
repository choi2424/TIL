import React, { useState } from 'react';
import './style.css';

// 리덕스 사용 안한 예제.
// props를 이용한 하위계층까지 공유데이터를 전달
function App() {
  const [number, setNumber] = useState(1);
  const name = '';
  
  return (
    <div div id="container">
      <h1>Root</h1>
        <div id='grid'>
        <Left1 number={number}name={name}></Left1>
        <Right1 onIncrease={() => {
          setNumber(number + 1);
        }}></Right1>
      </div>
    </div>
  );
}
// props = {number:number}
function Left1(props) {
  return (
    <div>
      <h1>Left1 : {props.number}{props.name }</h1>
      <Left2 number={props.number} name={props.name }/>
    </div>
  );
}

function Left2(props) {
  return (
    <div>
      <h1>Left2 :{props.number} {props.name }</h1>
      <Left3 number={props.number} name={props.name }/>
    </div>
  );
}

function Left3(props) {
  return (
    <div>
      <h1>Left3 :{props.number}{props.name }</h1>
    </div>
  );
}

function Right1(props) {
  return (
    <div>
      <h1>Right1</h1>
      <Right2 onIncrease={() => {
        props.onIncrease();
      }} />
    </div>
  );
}

function Right2(props) {
  return (
    <div>
      <h1>Right2</h1>
      <Right3 onIncrease={() => {
        props.onIncrease();
      }} />
    </div>
  );
}

function Right3(props) {
  return (
    <div>
      <h1>Right3</h1>
      <input type='button' value='증가' onClick={() => {
        props.onIncrease();
      }} />
    </div>
  );
}
export default App;
