// Functions in Rust

// Basic function
fn greet(name: &str) {
    println!("Hello, {}!", name);
}

// Function with return value
fn add(a: i32, b: i32) -> i32 {
    a + b  // Implicit return without semicolon
}

// Function with multiple parameters and explicit return
fn calculate_rectangle_area(width: f64, height: f64) -> f64 {
    return width * height;
}

// Function with default parameters using Option
fn power(base: i32, exponent: Option<i32>) -> i32 {
    match exponent {
        Some(exp) => {
            let mut result = 1;
            for _ in 0..exp {
                result *= base;
            }
            result
        }
        None => base  // Default to base^1
    }
}

fn main() {
    // Using the functions
    greet("Alice");
    
    let sum = add(5, 3);
    println!("Sum: {}", sum);
    
    let area = calculate_rectangle_area(4.0, 5.0);
    println!("Rectangle area: {}", area);
    
    let pow1 = power(2, Some(3));  // 2^3
    let pow2 = power(2, None);     // 2^1
    println!("2^3 = {}", pow1);
    println!("2^1 = {}", pow2);
}
