console.log("Hello World");

/*
 * js의 변수 선언

    1) var - 사용하지 않는다.
    2) let -
    3) const 
 */


// var age = 26;
// var isTrue = true;
//var name = "werewr";

// console.log(name + " ");
// console.log(age + " ");
// console.log(isTrue + " ");
/*
let은 var에서 같은 이름의 중복생성을 하지 못하게 만든 자료형이다
다만 둘 다 값을 변경하는것은 가능하다
*/

let name = "wefdff";

let age = 24;
console.log(name + age);

/**
 * const는 상수를 표현하기 위한 자료형
 * 값 변경 불가 
 */

const name2 = "chlale";

/**
 * js 네이밍 규칙
 * 
 * 변수이름
 * 1) 일반적으로 영어 사용, 문자와 숫자 사용가능
 * 2) 특수문자 _, $
 * 3) 숫자 시작 불가
 * 4) 키워드 변수명 사용 불가
 * 네이밍 타입
 * 1) camelCase -> 대부분의 언어에서 많이 사용하며 단어의 시작마다 대문자로 구분
 * 2) snake_case -> 파이썬에서 주로 사용하며 단어의 시작마다 _로 구분
 * 3) PascalCase -> c#, ms계열쪽 언어들이 많이 사용하며 매 단어 시작 무조건 대문자로
 */

let $name = "weriofsf";
let _name = "fmowepf";

/**
 * Data Types
 * 여섯개의 원시타입과 한개의 Object타입이 있다.
 * 
 * 1)Number
 * 2)String
 * 3)Boolean
 * 4)undefined
 * 5)null
 * 6)Symbol
 * 
 * 7)Object
 *  - Function
 *  - Array
 *  - Object
 */

//Number 타입
const age2 = 55;
const temp = -10;
const pi = 3.14;

console.log(typeof age2);

//String type
const name4 = "rfsoeme56";
const num1 = 55;
console.log(num1 =="55"); //값비교
console.log(num1 ==="55");//타입 비교

console.log("안녕하세요 저는 최지원이빈다. \n \t나이 32살입니다.")


//boolean type
const isTrue2 = true;
const isFalse = false;
console.log(typeof isTrue2);
console.log(typeof isFalse);

/**
 * undifined
 * 
 * 개발자가 직접 값을 초기화 하지 않았을 때
 * 지정되는 값
 * 
 * undifined를 직접 넣어주는것은 지양해야한다
 */

let num2;
console.log(num2 === undefined);

/**
 * null type
 * undifined와 동일하게 값이 없음을 표시
 * 다만 js에서는 개발자가 직접 명시적으로 없는 값을 초기화 할 때 사용
 */

let init = null;

console.log(init);

/**
 * Symbol type
 * 
 * 유일무이한 값을 생성할 때
 * 다른 원시값들과 다르게 Symbol함수를 호출해서 사용
 */

const tmp1 = "1";
const tmp2 = "2";

console.log(tmp1 === temp);
const symbol1 = Symbol('1');
const symbol2 = Symbol('2');
console.log(symbol1, symbol2);

/**
 * Object type
 * 
 * 키 : 밸류 쌍으로 이루어져 있다.
 * key : value
 */

const man = {
    name : "최지원",
    age : 47,
    address : "경기",
    value : "강사",
    printInfo(){
        console.log(this.name + "입니다.")
    }
}

man.value = "학생";
man.printInfo();
console.log(typeof man);
console.log(man.value);

/**
 * Array type
 * 
 * 값을 리스트로 나열할 수 있는 타입
 */

const arr = [];

arr.push("빨강");
arr.push("파랑");
arr.push("노랑");
arr.pop();
console.log(arr);
