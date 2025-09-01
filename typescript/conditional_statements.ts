// Conditional statements in TypeScript

// Basic if-else
const number: number = 7;

if (number < 5) {
    console.log("Number is less than 5");
} else if (number > 5) {
    console.log("Number is greater than 5");
} else {
    console.log("Number is equal to 5");
}

// Switch statement
const day: number = 3;
switch (day) {
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
    case 7:
        console.log("Weekend");
        break;
    default:
        console.log("Invalid day");
}

// Ternary operator
const age: number = 20;
const canVote: string = age >= 18 ? "Yes" : "No";
console.log(`Can vote? ${canVote}`);

// Nullish coalescing
const userName: string | null = null;
const displayName: string = userName ?? "Anonymous";
console.log(`User: ${displayName}`);

// Optional chaining with conditional
type User = {
    name: string;
    address?: {
        street?: string;
        city?: string;
    };
};

const user: User = {
    name: "John",
    address: {
        city: "New York"
    }
};

if (user.address?.street) {
    console.log("Street address available");
} else {
    console.log("No street address");
}
