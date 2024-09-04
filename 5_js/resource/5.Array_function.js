let member = [
    "최지원",
    "김지원",
    "이지원",
    "박지원",
    "남궁지원"
]

//push
console.log(member.push("신지원"));
console.log(member)

//splice(인덱스, 객수) -> 원본에 영향을 준다
// console.log(member.splice(0,3))
// console.log(member)

//slice(인덱스, 갯수-1) -> 원본에 영향 x
console.log(member.slice(0,6))
console.log(member)

let member2 = [
    ...member
]

let choi = {
    name : "jiwon",
    age : 21,
    gender : 'M'
}

let choi2 = {
    ...choi,
    age : 19,
    gender : 'F'
}

console.log(choi2);

console.log("-----------------------------------------------------------")

//join() -> 배열을 문자열로 변경해줌
console.log(member2.join())
console.log(member2.join('/'))
console.log(member2.join(' '))

//sort()

console.log(member2.sort())
console.log(member2.reverse())

let num = [1,5,3,6,6,8,9,2,4]
console.log(num)
num.sort();
num.reverse();

console.log(num)

//a,b 비교
//1) a를 b보다 나중에 정렬하고 싶다면(뒤에두고 싶다면) 0보다 큰 수를 반환
//2) a를 b보다 먼저 정렬하고 싶다면(앞에두고 싶다면) 0보다 작은 수를 반환
//3) 원래 순서 유지하려면 0 반환
num.sort((a,b) => {
    return a > b ? 1 : -1;
})
console.log(num);

//map
//기존배열의 요소를 전부 반복하면서
//return된 값으로 새로운 배열을 만들어주는 함수

// let mem2 = member.map(function(m,i){
//     console.log(m)
//     console.log(i)
// })
// let userList = [
//     {
//         userKey : 1,
//         userName : "최지원",
//         age : 22
//     },
//     {
//         userKey : 2,
//         userName : "김수민",
//         age : 20
//     },
//     {
//         userKey : 3,
//         userName : "최민서",
//         age : 26
//     }
// ]

// let buyHistory = [
//     {
//         userKey : 2,
//         productName : "TV",
//         price : 50000
//     },{
//         userKey : 1,
//         productName : "모니터",
//         price : 10000
//     },{
//         userKey : 3,
//         productName : "가습기",
//         price : 5000
//     },{
//         userKey : 1,
//         productName : "컴퓨터",
//         price : 30000
//     },{
//         userKey : 2,
//         productName : "냉장고",
//         price : 90000
//     }
// ]

// buyHistory = buyHistory.map((history)=>{
//     for(let user of userList){
//         if(user.userKey === history.userKey){
//             return {
//                 ...user,
//                 ...history //...객체 안에 키값 다 넣기
//             }
//         }
//     }
// })

// buyHistory = buyHistory.map((h,i))

// console.log(buyHistory)
console.log("==============================================================")

//filter
//return값이 false요소를 제외하고 true만 가져올때

let num2 = [1,6,7,9,10,21];
let tmp = [];

tmp = num2.filter(n => n % 2 === 0)
console.log(tmp)

//내가 삭제하고자 하는게 userKey === 2 

// buyHistory = buyHistory.filter(h => h.userKey !== 2)
// console.log(buyHistory)


//find()
//return되는 조건에 값이 true인 첫 요소를 반환
//모든 요소가 조건에 부합하지 않는다면 undefind를 반환한다
console.log(tmp.find(n => n%2===0))

//findIndex()
//return되는 조건에 값이 true인 첫 요소의 인덱스를 반환
//모든 요소가 조건에 부합하지 않는다면 -1 반환
console.log(tmp.findIndex(n => n%2===0))
