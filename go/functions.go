package main

import (
	"fmt"
	"math"
)

// Basic function
func greet(name string) {
	fmt.Printf("Hello, %s!\n", name)
}

// Function with multiple returns
func divideAndRemainder(a, b int) (int, int) {
	return a / b, a % b
}

// Function with named return values
func calculateCircle(radius float64) (area, circumference float64) {
	area = math.Pi * radius * radius
	circumference = 2 * math.Pi * radius
	return // naked return
}

// Function with variadic parameters
func sum(numbers ...int) int {
	total := 0
	for _, num := range numbers {
		total += num
	}
	return total
}

// Function returning a function (closure)
func makeMultiplier(factor int) func(int) int {
	return func(x int) int {
		return x * factor
	}
}

// Function with a pointer parameter
func increment(x *int) {
	*x++
}

func main() {
	// Using basic function
	greet("Alice")

	// Using function with multiple returns
	quotient, remainder := divideAndRemainder(10, 3)
	fmt.Printf("10 divided by 3: quotient = %d, remainder = %d\n", quotient, remainder)

	// Using function with named returns
	area, circ := calculateCircle(5)
	fmt.Printf("Circle with radius 5: area = %.2f, circumference = %.2f\n", area, circ)

	// Using variadic function
	result := sum(1, 2, 3, 4, 5)
	fmt.Printf("Sum of numbers: %d\n", result)

	// Using closure
	times2 := makeMultiplier(2)
	times3 := makeMultiplier(3)
	fmt.Printf("5 * 2 = %d\n", times2(5))
	fmt.Printf("5 * 3 = %d\n", times3(5))

	// Using function with pointer
	x := 5
	increment(&x)
	fmt.Printf("After increment: %d\n", x)
}
