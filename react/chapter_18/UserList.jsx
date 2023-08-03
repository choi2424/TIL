import React, { useRef } from "react";


// 배열 데이타를 이용하여 렌더링하기(추가,변경,삭제)

//리액트 특중 useRef 사용 : 조회 추가 삭제

//배열요소 하나를 출력하는 기능
function User( {user} ) {
    return (
        <div>
            <b>{user.username}</b>
            <span>{user.email }</span>
        </div>
    )
}


function UserList() {

    // 자바스크립트(리액트문법포함) 작업은 여기서한다


    //배열선언 - 요소에 사용하는 데이터는 object사용..
    const users = [
        {
            id: 1,
            username: '홍길동',
            email : 'user01@abc.com'
        },
        {
            id: 2,
            username: '손흥민',
            email : 'user02@abc.com'
        },
        {
            id: 3,
            username: '이강인',
            email : 'user03@abc.com'
        }

    ];

    const nextId = useRef(4); // 초기값 4의 의미는 user배열의 마지막요소가 id=3 이여서 추가되는 데이타 키를 의미한다

    //배열에 데이타추가 함수
    const onCreate = () => {
        nextId.current += 1;
    };

    //배열에 대이터 삭제 함수

    //배열릐 대이터 수정 함수

    return (
        <div>
            {/* JSX와 위에서 사용한 자바스크립트 변수,함수포함 */}
            {/*
            <User user={users[0]} />
            <User user={users[1]} />
            <User user={users[2]} />
             */}
            {/* 배열을 렌더링할 때에는 key 라는 props를 설정해야 한다.(중요) 
            나중에 배열을 추가,수정,삭제시 고유한 키를 통하여, 작업을 하게되므로
            리액트에서는 배열작업시 고유한 값을 갖는 키작업을 해야한다.

            배열에 고유한 키값이 존재하지 않으면,
            users.map((user , index) => (
                    <User user={user} key={index}/>
                    ))
                    
            */}
            {
                users.map(user => (
                    <User user={user} key={user.id}/>
                ))
            }

        </div>
        
        
        
    );
}

export default UserList;