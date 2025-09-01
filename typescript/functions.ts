// Functions in TypeScript

// Basic function
function greet(name: string): void {
    console.log(`Hello, ${name}!`);
}

// Function with return value
function add(a: number, b: number): number {
    return a + b;
}

// Arrow function
const multiply = (a: number, b: number): number => a * b;

// Function with optional parameter
function createUser(name: string, age?: number): object {
    return {
        name,
        age: age ?? "Not specified"
    };
}

// Function with default parameter
function power(base: number, exponent: number = 1): number {
    return Math.pow(base, exponent);
}

// Function with rest parameters
function sum(...numbers: number[]): number {
    return numbers.reduce((acc, curr) => acc + curr, 0);
}

// Generic function
function firstElement<T>(arr: T[]): T | undefined {
    return arr[0];
}

// Using the functions
greet("Alice");

const result = add(5, 3);
console.log(`5 + 3 = ${result}`);

const product = multiply(4, 6);
console.log(`4 * 6 = ${product}`);

const user1 = createUser("John");
const user2 = createUser("Jane", 25);
console.log(user1, user2);

console.log(`2^3 = ${power(2, 3)}`);
console.log(`2^1 = ${power(2)}`);

console.log(`Sum of numbers: ${sum(1, 2, 3, 4, 5)}`);

const numbers = [1, 2, 3, 4, 5];
const first = firstElement(numbers);
console.log(`First element: ${first}`);
