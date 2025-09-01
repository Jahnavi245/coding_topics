// Conditional statements in Rust
fn main() {
    let number = 7;

    // If-else statement
    if number < 5 {
        println!("Number is less than 5");
    } else if number > 5 {
        println!("Number is greater than 5");
    } else {
        println!("Number is equal to 5");
    }

    // Match expression (similar to switch)
    let day = 3;
    match day {
        1 => println!("Monday"),
        2 => println!("Tuesday"),
        3 => println!("Wednesday"),
        4 => println!("Thursday"),
        5 => println!("Friday"),
        6 | 7 => println!("Weekend"),
        _ => println!("Invalid day"),
    }

    // If let expression
    let some_value = Some(42);
    if let Some(value) = some_value {
        println!("Got value: {}", value);
    }

    // Multiple conditions
    let age = 25;
    let has_license = true;
    if age >= 18 && has_license {
        println!("Can drive");
    } else {
        println!("Cannot drive");
    }
}
