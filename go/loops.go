package main

import "fmt"

func main() {
	// Basic for loop
	fmt.Println("Basic for loop:")
	for i := 0; i < 5; i++ {
		fmt.Printf("Count: %d\n", i)
	}

	// While loop (using for)
	fmt.Println("\nWhile loop:")
	count := 0
	for count < 5 {
		fmt.Printf("Count: %d\n", count)
		count++
	}

	// Infinite loop with break
	fmt.Println("\nInfinite loop with break:")
	counter := 0
	for {
		fmt.Printf("Counter: %d\n", counter)
		counter++
		if counter >= 5 {
			break
		}
	}

	// For range loop with slice
	fmt.Println("\nFor range loop with slice:")
	numbers := []int{1, 2, 3, 4, 5}
	for index, value := range numbers {
		fmt.Printf("Index: %d, Value: %d\n", index, value)
	}

	// For range loop with map
	fmt.Println("\nFor range loop with map:")
	colors := map[string]string{
		"red":   "#ff0000",
		"green": "#00ff00",
		"blue":  "#0000ff",
	}
	for key, value := range colors {
		fmt.Printf("Color %s: %s\n", key, value)
	}
}
