/**
 * scope 
 * 변수나 함수가 접근할 수 있는 유효범위
 */

// var num1 = 20;

// function test1(){
//     console.log(num1);
// }

// // test1();

// function test2(){
//     var num1 = 40;
//     console.log(num1);
// }

// test2();

var num1 = 20;

function test3(){
    var num1 = 40;
    test4();
    console.log("num1 : " + num1);
}

function test4(){
    var num2 = 11;
    console.log("num1 : " + num1);
    console.log("num2 : " + num2);
}

test3();
console.log(num1);
/**
 * JS -> Lexical Scope
 * 선언된 위치가 상위 스코프를 정한다.
 * 
 * Dynamic Scope
 * 실행한 위치가 스코프를 정한다.
 */

// var i = 1000;
// for(var i=0; i<10; i++){
//     console.log(i);
// }

// console.log("i : " + i);

let i = 1000;

for(let i=0; i<10; i++){
    console.log(i)
}
console.log("i : " + i);