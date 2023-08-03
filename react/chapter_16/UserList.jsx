import React from "react";

// 배열 데이타를 이용하여 렌더링하기

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

    return (
        <div>
            {/* JSX와 위에서 사용한 자바스크립트 변수,함수포함 */}
            <div>
                <b>{users[0].username}</b>
                <span>{users[0].email }</span>
            </div>
            <div>
                <b>{users[1].username}</b>
                <span>{users[1].email }</span>
            </div>
            <div>
                <b>{users[2].username}</b>
                <span>{users[2].email }</span>
            </div>
        </div>
        
        
        
    );
}

export default UserList;