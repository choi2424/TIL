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
  console.log('props', props.topics);
  
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
  
function Create(props) {
  console.log('props', props.onCreate);
  return (
    <article>
      <h2>Create</h2>
      <form onSubmit={event => {
        event.preventDefault(); // form태그의 전송(submit)기능을 취소.
        const title = event.target.title.value;
        const body = event.target.body.value;
        props.onCreate(title, body);
      }}>
        <p><input type='text' name='title' placeholder='title'></input></p>
        <p><textarea name='body' placeholder='body'></textarea></p>
        <p><input type='submit' value='Create' /></p>
      </form>
    </article>
  );
}
// props.title변수,props.body변수,props.onCreate()함수
function Update(props) {
  // props,title 를 수정용의 값으로 직접사용하면 , 편집이 되지 않는다.(중요)
  // <input type='text' name = 'title' placeholder ='title' value = {props.title}/>
  const [title, setTitle] = useState(props.title);
  const [body, setBody] = useState(props.body);
  return (
    <article>
      <h2>Update</h2>
      <form onSubmit={event => {
        event.preventDefault(); // form태그의 전송(submit)기능을 취소.
        const title = event.target.title.value;
        const body = event.target.body.value;
        props.onUpdate(title, body);
      }}>
        <p><input type='text' name='title' placeholder='title' value={title} onChange={event => {
          console.log(event.target.value);
          setTitle(event.target.value);
        }} /></p>
        <p><textarea name='body' placeholder='body' value={body} onChange={event => {
          setBody(event.target.value);
        }} /></p>
        <p><input type='submit' value='Update' /></p>
      </form>
    </article>
  );
}


// 일반변수가 값이 변경된다고 하여 , 함수컴포넌트가 재실행 되지 않는다.
// 고로, 브라우저의 화면에 렌더링되지 않는다.
// uesState로 관리되는 변수는 변경시, 함수컴포넌트가 재실행되고, 렌더링된다.
function App() { // 시작 함수컴포넌트 - <Header /> <Nav /> <Article />
  //전체 모드 : WELCOME, READ , CREATE
  const [mode, setMode] = useState('WELCOME');
  // mode가 READ일때 함깨 적용
  //1.html 2.css 3.javascript 3개중 하나를 선택했을 때, 구분하는 id값을 관리하는 useState
  const [id, setId] = useState(null);// id값에 해당하는 세부내용이 출력
  const [nextId, setNextId] = useState(4);// create작업시 id값 확보

  //<Nav></Nav>태그에 사용할 데이타 작업
  const [topics,setTopics] =  useState([
    { id: 1, title : 'html' , body : 'html is ...'},
    { id: 2, title : 'css' , body : 'css is ...'},
    { id: 3, title : 'javascript' , body : 'javascript is ...'}
  ]);

  // mode 변수가  사용하기 이전에 전역변수 선언위치에 해당한다.
  let content = null;
  let contextControl = null;
  

  if (mode === 'WELCOME') {
    content = <Article title="Welcome" body="Hello,Web" />
  } else if (mode === 'READ') {
    let title, body = null;

    // 사용자가 1.html 2.css 3.javascript 목록중 하나를 선택했을 때, topics에서 선택한 id가
    // 일치되는 데이타를 찾아서 세부내용을 출력하는 작업
    for (let i = 0; i < topics.length; i++) {
      if (topics[i].id === id) { // user가 Nav에서 선택한 id와 일치되는지 확인
        title = topics[i].title;
        body = topics[i].body;
      }
    }
    content = <Article title={title} body={body} />
    contextControl = <li><a href={'/update/' + id} onClick={event => {
      event.preventDefault();
      setMode('UPDATE');
    }}>Update</a></li>
    
  } else if (mode === 'CREATE') {
    // 폼작업
    content = <Create onCreate={(title, body) => {
      const newTopic = { id: nextId, title: title, body: body };
      const newTopics = [...topics];// 데이타 복제
      newTopics.push(newTopic);
      setTopics(newTopics); // 주소가 변경.
      setMode('READ'); // 모드 변경
      setId(nextId); // 선택한 아이디값을 변경작업 
      setNextId(nextId + 1);
    }}></Create>
  } else if (mode === 'UPDATE') {
    let title, body = null;
    for (let i = 0; i < topics.length; i++){
      if (topics[i].id === id) {
        title = topics[i].title;
        body = topics[i].body;
      }
    }
    content = <Update title={title} body={body} onUpdate={(title, body) => {

    }} />
  }

  return (
    <div className="App">
      {/* 1. <Header /> */}
      <Header title='WEB' onChangeMode={()=> {
        //alert("Header");
        //mode = 'WELCOM'; 읽기용도 변수로 사용할 것.
        setMode  ('WELCOME');
      }}
      ></Header>


      {/* <Nav /> */}
      <Nav topics={topics} onChangeMode={(id) => {
        // alert(id);
        setMode('READ');
        setId(id);
      }} />


      {/*  3.<Article /> */}
      {content}
      <li><a href='/create' onClick={event => {
        event.preventDefault(); // a태그의 기본기능인 링크기능 동작이 제거. 새로고침이 발생안됨.
        setMode('CREATE'); // App()함수컴포넌트 재실행.
      }}>Create</a></li>
      {contextControl}
      
      
    </div>
  );
}

export default App;
