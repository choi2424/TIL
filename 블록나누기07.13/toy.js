function cg(obj){
    if (obj.classList.contains("red")){
        obj.classList.replace("red","blue");    
    }else if (obj.classList.contains("blue")){
        obj.classList.replace("blue","green");    
    }else if (obj.classList.contains("green")){
        obj.classList.replace("green","brown");    
    }else if (obj.classList.contains("brown")){
        obj.classList.replace("brown","black");    
    }else if (obj.classList.contains("black")){
        obj.classList.replace("black","red");    
    }
}
function a(){
    const d2 = document.getElementById("d2");
    const d3 = document.getElementById("d3");
    const d5 = document.getElementById("d5");
    const d6 = document.getElementById("d6");
    const d7 = document.getElementById("d7");
    const d8 = document.getElementById("d8");
    const d9 = document.getElementById("d9");
    const d10 = document.getElementById("d10");
    const d11 = document.getElementById("d11");
    const d12 = document.getElementById("d12");
    const d14 = document.getElementById("d14");
    const d15 = document.getElementById("d15");

    if(
        d2.classList.contains("blue")&&
        d3.classList.contains("blue")&&
        d5.classList.contains("red")&&
        d6.classList.contains("blue")&&
        d7.classList.contains("brown")&&
        d8.classList.contains("brown")&&
        d9.classList.contains("red")&&
        d10.classList.contains("red")&&
        d11.classList.contains("green")&&
        d12.classList.contains("brown")&&
        d14.classList.contains("green")&&
        d15.classList.contains("green")
    ){
        alert("성공");
        window.location.href = "toy_02.html"
    }else{
        alert("실패");
    }
}
function b() {
    const d1 = document.getElementById("d1");
    const d2 = document.getElementById("d2");
    const d3 = document.getElementById("d3");
    const d4 = document.getElementById("d4");
    const d5 = document.getElementById("d5");
    const d6 = document.getElementById("d6");
    const d7 = document.getElementById("d7");
    const d8 = document.getElementById("d8");
    const d9 = document.getElementById("d9");
    const d10 = document.getElementById("d10");
    const d11 = document.getElementById("d11");
    const d12 = document.getElementById("d12");
    const d13 = document.getElementById("d13");
    const d14 = document.getElementById("d14");
    const d15 = document.getElementById("d15");
    const d16 = document.getElementById("d16");
    const d17 = document.getElementById("d17");
    const d18 = document.getElementById("d18");
    const d19 = document.getElementById("d19");
    const d20 = document.getElementById("d20");
    const d21 = document.getElementById("d21");
    const d22 = document.getElementById("d22");
    const d23 = document.getElementById("d23");
    const d24 = document.getElementById("d24");
    const d25 = document.getElementById("d25");
    const d26 = document.getElementById("d26");
    const d27 = document.getElementById("d27");
    const d28 = document.getElementById("d28");
    const d29 = document.getElementById("d29");
    const d30 = document.getElementById("d30");
    const d31 = document.getElementById("d31");
    const d32 = document.getElementById("d32");
    const d33 = document.getElementById("d33");
    const d34 = document.getElementById("d34");
    const d35 = document.getElementById("d35");
    const d36 = document.getElementById("d36");

    if(
        d1.classList.contains("red")&&
        d7.classList.contains("red")&&
        d9.classList.contains("red")&&
        d13.classList.contains("red")&&
        d14.classList.contains("red")&&
        d15.classList.contains("red")&&
        d19.classList.contains("red")&&
        d25.classList.contains("red")&&
        d26.classList.contains("red")&&
        d2.classList.contains("blue")&&
        d3.classList.contains("blue")&&
        d4.classList.contains("blue")&&
        d5.classList.contains("blue")&&
        d6.classList.contains("blue")&&
        d8.classList.contains("blue")&&
        d10.classList.contains("blue")&&
        d16.classList.contains("blue")&&
        d17.classList.contains("blue")&&
        d20.classList.contains("green")&&
        d21.classList.contains("green")&&
        d27.classList.contains("green")&&
        d29.classList.contains("green")&&
        d31.classList.contains("green")&&
        d32.classList.contains("green")&&
        d33.classList.contains("green")&&
        d34.classList.contains("green")&&
        d35.classList.contains("green")&&
        d11.classList.contains("brown")&&
        d12.classList.contains("brown")&&
        d18.classList.contains("brown")&&
        d22.classList.contains("brown")&&
        d23.classList.contains("brown")&&
        d24.classList.contains("brown")&&
        d28.classList.contains("brown")&&
        d30.classList.contains("brown")&&
        d36.classList.contains("brown")
    ){
        alert("성공");
        
    }else{
        alert("실패");
    }
}