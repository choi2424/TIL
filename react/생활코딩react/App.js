// import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

// 실제 개발시는 함수형 컴포넌트는 파일단위로 생성.
// Header.js  Nav.js  Article.js 로 구성.

//함수형 컴포넌트
// function Header({title})
function Header(props) {  // props.title
  console.log('props', props.title);
  console.log('props.onChangeMode',props.onChangeMode)
  
  return (
    <header>
      <h1>
        <a href='/' onClick={(event) => {
          event.preventDefault(); //a태그의 클릭시 진행되는 기본동작 성격을 취소하는 작업
          props.onChangeMode();
        }}>{props.title}</a></h1>
    </header>
    );
}

function Nav(props) {
  console.log('props.title', props.topics);
  
  const lis = [];
  for (let i = 0; i < props.topics.length; i++){
    let t = props.topics[i];
    lis.push(<li key={t.id}><a id={t.id} href={'/read/' + t.id} onClick={(event) => {
      event.preventDefault();
      // event : a태그를 클릭시 a태그를 가리키는 이벤트객체
      // event.target : a태그 자신. document.getElementById() 비슷한의마
      // event.target.id : a태그의 id속성의 값
      props.onChangeMode(Number(event.target.id));
    }} >{t.title}</a></li>);
  }
  return (
    <nav>
        <ol>
          {lis}
        </ol>
    </nav>
  );
}


// 함수형 컴포넌트
function Article(props) {
  
  return (
    <article>
        <h2>{props.title}</h2>
        {props.body}
    </article>
  );
}
  
// 일반변수가 값이 변경된다고 하여 , 함수컴포넌트가 재실행 되지 않는다.
// 고로, 브라우저의 화면에 렌더링되지 않는다.
// uesState로 관리되는 변수는 변경시, 함수컴포넌트가 재실행되고, 렌더링된다.
function App() {
  const [mode, setMode] = useState('WELCOME');
  const [id, setid] = useState(null);

  const topics = [
    { id: 1, title : 'html' , body : 'html is ...'},
    { id: 2, title : 'css' , body : 'css is ...'},
    { id: 3, title : 'javascript' , body : 'javascript is ...'}
  ];

  let content = null;
  if (mode === 'WELCOME') {
    content = <Article title = "Welcome" body = "Hello,Web" />
  } else if (mode === 'READ') {
    let title, body = null;
    for (let i = 0; i < topics.length; i++){
      if (topics[i].id === id) {
        title = topics[i].title;
        body = topics[i].body;
      }
    }
    content = <Article title={title} body={body} />
    
  }

  return (
    <div className="App">
      <Header title='WEB' onChangeMode={()=> {
        //alert("Header");
        //mode = 'WELCOM'; 읽기용도 변수로 사용할 것.
        setMode  ('WELCOME');
      }}
      ></Header>
      <Nav topics={topics} onChangeMode={(id) => {
        // alert(id);
        setMode('READ');
        setid(id);
      }} />
      {content}
    </div>
  );
}

export default App;
