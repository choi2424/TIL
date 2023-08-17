import { useSelector, useDispatch } from "react-redux";
import { up } from "./counterSlice";
import { down } from "./counterSlice";

function Counter() {
    const dispatch = useDispatch();
    const count = useSelector(state => {
        return state.counter.value;
    });

    return (
        <div>
        <button onClick={() => {
            dispatch(up(2)); 
        }}>증가</button>
        <button onClick={() => {
            dispatch(down(2)); 
        }}>감소</button>
        {count}
        </div>  
    );
}

export default Counter;