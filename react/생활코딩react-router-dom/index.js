import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
// import {BrowserRouter,Route,Routes,Link} from 'react-router-dom';
// import {HashRouter,Route,Routes,NavLink} from 'react-router-dom';
import { BrowserRouter, Route, Routes, NavLink ,useParams} from 'react-router-dom';
// varsion 5 -> 6. Switch - > Routes

/*
BrowserRouter : Router Dom기능을 적용하기 위하여, BrowderRouert.

a태그는 사용하지 않는다  link,navlink 등을 사용
이유 a태그는 새로고침 현상이 발생.
link : class = active 스타일 제공안함
navlick : class = active 스타일 제공함

useParams : react-router-dom에서 제공하는 Hook중 하나.
-> 파라미터값을 URL을 통해서 넘겨받아 페이지에서 사용할수 있도록 해준다
-> URL주소의 형태 예) /topics/1 , /topicr/2 ,/topicr/3     
*/

function Home() {
  return (
    <div> 
      <h2>HOME</h2>
      HOME.....
    </div>
  );
}

let contents = [
  { id: 1, title: 'html', descriptinon: 'HTML is ....'  },
  { id: 2, title: 'JS' ,descriptinon: 'JS is ....'  },
  { id: 3, title: 'React', descriptinon: 'React is ....'  }
]

function Topic() {
  let params = useParams();
  console.log(params);
  // console.log(params.topic_id);
  let topic_id = params.topic_id;

  // 아래구조는 contents배열의 데이터 구조가 같아야 한다.
  let selected_topic = {
    title: 'Sorry',
    descriptinon: 'Not Found'
  };
  for (let i = 0; i < contents.length; i++){
    // 파라미터 값이 일치하면,
    if (contents[i].id === Number(topic_id)) {
      selected_topic = contents[i]; //title: 'Sorry', descriptinon: 'Not Found'
      break;
    }
  }
  return (
    <div> 
      <h3>{selected_topic.title}</h3>
      {selected_topic.descriptinon}
    </div>
  );
}



// Nested Route(중첩 라우팅) <Route path='/topics/*' element={<Topics />} />
function Topics() {
  let lis = [];
  for (let i = 0; i < contents.length; i++){
    lis.push(
      <li key={contents[i].id}><NavLink to={"/topics/" + contents[i].id}>{contents[i].title}</NavLink></li>);
  };
  return (
    <div> 
      <h2>Topics</h2>
      <ul>
        {lis}
      </ul>
      <Routes>
      <Route path ='/:topic_id' element={<Topic /> }/>
      </Routes>
    </div>
  );
}

function Contract() {
  return (
    <div> 
      <h2>Contract</h2>
      Contract.....
    </div>
  );
}


function App() {
  return (
    <div>
      <h1>Hello React Router DOM</h1>
      <ul>
        <li><NavLink to='/'>Home</NavLink></li>
        <li><NavLink to='/topics'>Topics</NavLink></li>
        <li><NavLink to='/contact'>Contract</NavLink></li>
      </ul>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/topics/*' element={<Topics />} />
        <Route path='/contact' element={<Contract />} />
        <Route path='/*' element={'Not Found'} />
      </Routes>
    </div >
  );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
  <BrowserRouter>
    <App />
  </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
