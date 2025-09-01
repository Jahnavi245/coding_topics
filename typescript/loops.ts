// Loops in TypeScript

// For loop
console.log("For loop example:");
for (let i = 0; i < 5; i++) {
    console.log(`Count: ${i}`);
}

// While loop
console.log("\nWhile loop example:");
let count = 0;
while (count < 5) {
    console.log(`Count: ${count}`);
    count++;
}

// Do-while loop
console.log("\nDo-while loop example:");
let num = 0;
do {
    console.log(`Number: ${num}`);
    num++;
} while (num < 5);

// For...of loop (iterating over array)
console.log("\nFor...of loop example:");
const numbers = [1, 2, 3, 4, 5];
for (const num of numbers) {
    console.log(`Number: ${num}`);
}

// For...in loop (iterating over object properties)
console.log("\nFor...in loop example:");
const person = {
    name: "John",
    age: 30,
    city: "New York"
};
for (const prop in person) {
    console.log(`${prop}: ${person[prop]}`);
}

// forEach method
console.log("\nforEach example:");
numbers.forEach((num, index) => {
    console.log(`Index ${index}: ${num}`);
});
