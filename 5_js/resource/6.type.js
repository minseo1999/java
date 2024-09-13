/**
 * 형변환
 * 
 * 1.명시적
 * 2.묵시적
 */

let age = 45;

//명시적
let serAge = age.toString();
console.log(typeof serAge);

//묵시적
let tmp = age + ""
console.log(typeof tmp);

console.log((100).toString());

let member = {
    name : "jiwon"
}

console.log(member == {name : "jiwon"})
console.log({name : "jiwon"} == {name : "jiwon"})