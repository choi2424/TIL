import { useState,useRef } from "react";

// 여러개의 input 태그들의 상태관리하기
//useRef 기능 : 특정 DOM선택하기 이해를 돕기위해 , document.gatElementById(),document.querySelector() 유사

function InputState() {
    const [inputs, setinputs] = useState({
        name: '',
        nickname: ''
    });

    //useRef 객체 생성  <input name="name" placeholder="이름"  onChange={onChange} value={name} ref={nameInput}/>
    const nameInput = useRef();

    const { name, nickname } = inputs;
    // onChange이벤트를 발생한 해당 <input>태그를 참조하는 이벤트객체.
    const onChange = (e) => {
        /* 
        이벤트 e 객체는 이름이 onchange 일 경우에는 <input name = "name"> 태그참조객체
                        닉네임이 onchange 일 경우에는 <input name = "kickname"> 태그참조객체
        const value = e.target.value;
        const name = e.target.name;
        */
        const { value, name } = e.target; // e.target.name , e.target.value
        //useState 변수값을 변경
        //{name : '', nickname : '', name : ''}
        // 새로운 object생성 (내용은 기존것 복사 변경된 키값작업)

        /*
        useState(초기값)구문이 동작되면, 2개요소를 갖는 배열형태의 기억장소가 생성된다.
        [0]첫번째 요소는 초기값을 갖게되는 기억장소가 되고, [1]두번째 요소는 set기능을 함
        set기능은 [0]첫번째 요소의 기억장소의 값을 변경하는 목적으로 만들어져 있다.
        (중요)
         */
        setinputs({ ...inputs, [name] : value });  //새로운 객체에의한 주소가 달라진다
    };
    

    const onReset = () => {
        setinputs({
            name: '',
            nickname: ''
        });

        nameInput.current.focus(); //input태그에 포커스 발생.
    }

    return (
        <div>
            <input name="name" placeholder="이름"  onChange={onChange} value={name} ref={nameInput}/>
            <input name="nickname" placeholder="닉네임" onChange={onChange} value={nickname} />
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값:</b>
                {name} ({nickname})
            </div>
        </div>
    );
}

export default InputState;