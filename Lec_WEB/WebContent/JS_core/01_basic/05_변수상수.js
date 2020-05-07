// var , let , const 


var a = 100

console.log('a= ' , a)
a= 200
console.log('a= ' , a)



var a= 500   // 중복 선언 가능 ! 
console.log('a= ' , a)


// ES6 부터 let , const 로 변수 상수 지정 .

let value = 177 
console.log('value= ' ,value)
value = 555
console.log('value= ' ,value)


//중복 선언 불가 ! 동일 이름 변수 let으로 선언 불가
// let value =277 


const b = 1 ;
console.log('b= ' , b)
// b = 2     //final   오류
// console.log('b= ' , b)



//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// var 은 오늘날 JS 환경에서는 그닥 권장하진 않음

// var 와 let
// IE9, IE10  와 같은 구형 브라우저에서는
//  let, const 를 사용 못함.

// 개발 단계에서는 '바벨' 등을 사용하여
// 우리가 개발한 코드가 구형 브라우저 에서동 동작케 함.


let c;    // 초기화를 선언과 따로 해도 가능.
c = 100;


// ` : back tic 
console.log(`c = ${c}`)    // Template Literal (ES6 이상에서 쓸쑤있음)


//데이터 타입들


let value2 = 100; // number 타입


console.log(value2, typeof value2) // typeof 연산자 : 변수의 타입
console.log(value2, typeof(value2))


// JS 는  대입되는 값에 따라 '타입'이 계속 바뀜.
value2 = 'hello' //String 타입
console.log(value2, typeof value2) // typeof 연산자 : 변수의 타입






