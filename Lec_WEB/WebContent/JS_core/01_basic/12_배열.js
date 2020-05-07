// 배열 생성 방법

// 방법1 : [ ] 사용
var points = [40, 100, 1, 5, 25, 10];
var fruits = ['Banana', 'Orange', 'Apple', 'Mango']

console.log('points =', points, typeof points);

// 방법2 : new 사용
var cars = new Array("Saab", "Volvo", "BMW");   // 비추
console.log('cars =', cars, typeof cars);

console.log('fruits =', fruits.toString());


// JS 에선 object 의 property 접근 회수를 줄이는 게 성능에 유리.
console.log()
for(i = 0; i < cars.length; i++){
    console.log(cars[i])
}

console.log()
var length = cars.length;
for(i = 0; i < length; i++){  // 위의 경우보다 좋은 성능
    console.log(cars[i])
}

// for ~ in : 객체(object) 에 대해 사용, property 
for(x in cars){  // value 가 아닌 index 가 나옴.
    console.log('x = ', x, cars[x])
}

console.log()
// for ~ of  : ES6부터 사용,  iterable 한 객체에 대해 사용
for(x of cars){
    console.log('x =', x)
}

console.log()
// 배열.forEach(함수)
// 배열 원소 하나하나 뽑아내면서 함수 호출
var myFunction = function(value){
    console.log(value);
}
cars.forEach(myFunction);


// 배열원소 추가
console.log()
fruits[fruits.length] = 'Melon';
console.log(fruits);

fruits.push('Lemon');
console.log(fruits);

console.log()
// 주어진 변수가 배열인지 아닌지 판단
// typeof 만으로는 알수 없다.

// 1. isArray() :  ES5.1 부터 지원.
console.log(Array.isArray(fruits));

// 2. 구 브라우저에서 판단하려면 함수만들어서 운영
function isArray(x){
    return x.constructor.toString().indexOf("Array") > -1;
}
console.log(isArray(fruits));


