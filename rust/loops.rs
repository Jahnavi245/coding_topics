// Loops in Rust
fn main() {
    // For loop
    println!("For loop example:");
    for i in 0..5 {
        println!("Count: {}", i);
    }

    // While loop
    println!("\nWhile loop example:");
    let mut count = 0;
    while count < 5 {
        println!("Count: {}", count);
        count += 1;
    }

    // Loop with break
    println!("\nLoop with break example:");
    let mut counter = 0;
    loop {
        println!("Counter: {}", counter);
        counter += 1;
        if counter >= 5 {
            break;
        }
    }

    // For loop with iterator
    println!("\nFor loop with array:");
    let numbers = [1, 2, 3, 4, 5];
    for num in numbers.iter() {
        println!("Number: {}", num);
    }
}
