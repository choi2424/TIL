import { createSlice } from "@reduxjs/toolkit";

const counterSlice = createSlice({
    name: 'counterSlice', // slice를 구분하기위한 유일한 이름이어야 한다
    initialState: {value:0}, // state(상태)로 사용할 값
    reducers: {
        up: (state, action) => {
        state.value = state.value + action.payload;
        },
        down: (state, action) => {
        state.value = state.value - action.payload;
        }
    }
});
    
export default counterSlice;
export const { up } = counterSlice.actions;
export const { down } = counterSlice.actions;
