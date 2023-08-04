//import logo from './logo.svg';
import './App.css';
//import Hello from './chapter_5/Hello';
import React,{useRef , useState} from 'react';
import UserList from './chapter_19/UserList';
import CreateUser from './chapter_19/CreateUser';


function App() {
  // 자바스크립트 구문작업
  // const name = "홍길동";
  
  // style 작업은 object구문으로 해야함
  /*
  const style = {
    backgroundColor: "black",
    color: "aqua",
    fontSize: 24,
    padding : 'irem' 
  }
*/
  //App.css 파일의 선택자를 사용시 class속성 사용하지 말고, className으로 사용 권장

  // jsx 주석

  //UserList함수형 컴포넌트에 존재하고 있던 배열을 부모 함수형컴포넌트인 App.js 로 이동

  // 데이터, 개발에서 DB의 내용을 불러와서 사용

  //const inputs = {username : "", mail : ""};
  //setinputs함수 : inpusts객체의 값을 변경하는 목적.
  const [inputs, setInputs] = useState({
    username: '',
    email: ''
  });

  //비구조화 할당.
  //const username = inputs.username;
  // const email = inputs.email;
  // 아이디 값 입력시 useState 정보가 변경이 되어, App.js 함수컴포넌트가 세번째 실행된다.
  //결과적으로 아래 구문에 username, email변수에 입력한 값을 참조 사용하게된다.
  //사용자가 입력한 값을 각각 username, email 상수에 값을 읽어왔다.
  const { username, email } = inputs; // useState변수

  //아이디,이메일 입력했을때 텍스트박스 온체인지 이벤트가 발생
  
  //사용자가 입력한 태므그의 이름의 값을 읽어오는구분
  const onChange = e => {
    //<input name="username" placeholder="아이디" value={username} onChange={onChange}/>
    //<input name="email" placeholder="이메일" value={email} onChange={onChange}/>
            
    const { name, value } = e.target;
      setInputs({
      ...inputs,
      [name]: value
      });
    
    /*
    --1) setInpust(    username: ''; email: '' [name] : value;);
    --2) 아이디 텍스트박스 값을 입력시 onChange이벤트가 발생되면
                setinputs({ usernameme: '', email: '입력값' });
                setinputs({ usernameme: '입력값', email: '' });
    --3) 이메일 텍스트박스 값을 입력시 onChange이벤트가 발생되면
                setinputs({ usernameme: '입력값', email: '' });
                setinputs({ usernameme: '입력값', email: '',email : '입력값' });
    */
    //setinputs({ usernameme: '', email: '입력값' });

    //useState 변경 : 함수컨포넌트(App()) 재실행
  };

  // 배열데이터를 useState() 훅에서 관리작업
  // 이유는 배열에 데이터를 추가하여도 ,app()함수컴포넌트가 재실행되지 않아서,
  // UserList함수컴포넌트의 내용이 갱신되지 않아, 이전상태로 보이게 된다.
  const [users, setUsers] = useState([
    {
      id: 1,
      username: '홍길동',
      email: 'user01@abc.com',
      active : true
    },
    {
      id: 2,
      username: '손흥민',
      email: 'user02@abc.com',
      active : false
    },
    {
      id: 3,
      username: '이강인',
      email: 'user03@abc.com',
      active : false
    }
  ]);

  
  const nextId = useRef(4); // 추가되는 배열데이터의 ID값을 4번으로 넣어주는 목적
  const onCreate = () => {
    //배열에 항목 추가로직
    const user ={
      id: nextId.current,
      username,
      email
    };

    //useState가 관리하는 데이터가 배열이므로, 배열은 객체이다.
    // 그래서 useState는 객체의 주소가 변경이 되어야만 그것을 인식하고
    // App.js함수컴포넌트를 재실행하게된다.
    // ...users 기존데이타를 복사해서 사용해야 하므라 이 문법을 사용했다.

    setUsers([...users, user]);

    setInputs({
      username:'', email: '',
    });

    nextId.current += 1;
  };

  //삭제버튼을 클릭시 호출할 이벤트 함수.
  const onRemove = id => {
    //배열데이터에서 배열데이터 하나를 삭제하는 의미.
    //삭제할려는 id를 매개변수로 받는다.
    //filter()매서드 : 배열에서 id가 같지않은 것만 
    setUsers(users.filter(user => user.id !== id));

  }

  //목록에서 클릭시 active필드값을 변경하는 작업.
  //아이디 색상이 녹색 또는 검정색으로 변경되는 기능.
  const onToggle = id => {
    setUsers(
      users.map(user =>
        user.id === id ? {...user, active: !user.active}:user)
    );
  };

  


  
  return (
    <>
      {/* 자바스크립트 주석효과 */}
      {/* */}
      {/* /* 화면에 출력 */}
      {/* <Hello /*ㅇㅇㅇㅇ */}
      {/* <Hello */}
      {/* // 주석효과 */}
      {/* /> */}
      {/* <Hello /> */}
      {/* <div style={style}>{name}</div> */}
      {/* <div className='gray-box'></div> */}

      <CreateUser username={username} email={email} onChange={onChange} onCreate={onCreate} />
      <UserList users={ users} onToggle={onToggle} onRemove={onRemove} />
    </>
    
  );
}

export default App;
