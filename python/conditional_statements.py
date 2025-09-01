#if statement
x = 10
if x > 5:
    print("x is greater than 5")


#if-elif 
score = 85
if score >= 90:
    print("Grade: A")
elif score >= 80:
    print("Grade: B")
elif score >= 70:
    print("Grade: C")

#if -else
current_hour = 22
if current_hour < 9 or current_hour > 21:
    print("The store is closed.")
else:
    print("The store is open.")

#nested if statements
role = "editor"
department = "marketing"
if role == "editor":
    if department == "marketing":
        print("Access granted to marketing content.")
    else:
        print("No access to marketing content.")
else:
    print("Invalid role.")