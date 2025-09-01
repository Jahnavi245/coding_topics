package main

import "fmt"

func main() {
	// If-else statement
	number := 7

	if number < 5 {
		fmt.Println("Number is less than 5")
	} else if number > 5 {
		fmt.Println("Number is greater than 5")
	} else {
		fmt.Println("Number is equal to 5")
	}

	// Switch statement
	day := 3
	switch day {
	case 1:
		fmt.Println("Monday")
	case 2:
		fmt.Println("Tuesday")
	case 3:
		fmt.Println("Wednesday")
	case 4:
		fmt.Println("Thursday")
	case 5:
		fmt.Println("Friday")
	case 6, 7:
		fmt.Println("Weekend")
	default:
		fmt.Println("Invalid day")
	}

	// Switch without expression (like if-else)
	age := 25
	switch {
	case age < 18:
		fmt.Println("Minor")
	case age >= 18 && age < 65:
		fmt.Println("Adult")
	default:
		fmt.Println("Senior")
	}

	// If with short statement
	if score := 85; score >= 70 {
		fmt.Println("Passing grade")
	} else {
		fmt.Println("Failing grade")
	}

	// Error handling with if
	result, err := divide(10, 2)
	if err != nil {
		fmt.Println("Error:", err)
	} else {
		fmt.Printf("Result: %f\n", result)
	}
}

// Helper function for error handling example
func divide(a, b float64) (float64, error) {
	if b == 0 {
		return 0, fmt.Errorf("division by zero")
	}
	return a / b, nil
}
