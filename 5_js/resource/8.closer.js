/**
 * 클로저
 * 
 * 어떤 함수와 해당 함수가 선언된 정적 환경의 조합이다.
 * 함수가 저장될때 외부꺼까지 가지고 가서 저장되는거
 * 
 */


let num = 5;
let num1 = 5;
let num2 = 5;
let num3 = 5;

function getNum(){
    let num = 5;
    function inner(){
        num++;
        return num;
    }

    return inner;
}

let run = getNum();

console.log(run());
console.log(run());
console.log(run());

function out(outValue){
    function inner(innerValue){
        console.log("out : " + outValue)
        console.log("in : " + innerValue)
    }

    return inner;
}

const numOutFunl = out('외부함수')