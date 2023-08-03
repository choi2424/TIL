import React from "react";


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


function UserList({users}) {

    // 자바스크립트(리액트문법포함) 작업은 여기서한다


    //배열선언 - 요소에 사용하는 데이터는 object사용..




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