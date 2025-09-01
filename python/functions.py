#functions
def generate_employee_emails(names, domain="comapany.com"):
    valid_emails = []
    for name in names:
        if name and name.replace(" ","").isalpha():
            try:
                first, last = name.lower().split()
                email = f"{first}.{last}@{domain}"
                valid_emails.append(email)
            except ValueError:
                print(f"Skippinf invalid name: {name} (exoected 'First Last' format)")
        else:
            print(f"Skipping invalid name: {name} (non-alphabetic or empty)")
    return valid_emails

        
                      
employee_names = ["John Doe","Alice Smith","Bob123", "", "Mary Jane Watson"]
emails = generate_employee_emails(employee_names)
for email in emails:
    print(f"Generate email: {email}")