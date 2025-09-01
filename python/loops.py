#for loop
meal = {"breakfast": 100, "lunch": 600, "snack": 150, "dinner": 500}
total_calories = 0
for meal, calories in meal.items():
    print(f"calories from {meal}: {calories}")
    total_calories += calories
print(f"total daily calories: {total_calories}")    

# while loop
stock = 30
restock_threshold = 50
restock_target = 100
restock_amount = 20
while stock < restock_target:
    if stock < restock_threshold:
        print(f"Stock low: {stock} units. Restocking {restock_amount} units...")
        stock += restock_amount
    else:
        print(f"Stock at {stock} units, above threshold but below target.")
        stock += restock_amount
print(f"Restocking complete! Final stock: {stock} units.")

        