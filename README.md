# Shop 059

A Java console-based online shop project developed as a university project.

The project simulates an online shopping system with three types of accounts:

- **User** – search for products, manage a shopping cart, place orders, manage wallet balance, and view previous orders.
- **Seller** – add products, view their products, and manage their account.
- **Admin** – manage users and admins, and approve requests from users and sellers.

## Products

The project has a `Product` superclass with different product types:

- Book
- Bag
- Cloth
- Headphones
- Mobile
- Painting
- Rug
- Shoes
- Sport Equipment
- Toy
- Watch

## Other Features

- Product search and category browsing
- Shopping cart and orders
- Wallet and adding funds
- Admin approval system
- File-based requests between users, sellers, and admins
- Regular expressions for validating passwords, emails, and phone numbers
- HashMaps for finding users, sellers, and admins
- a detailed project report

## Project Structure

```text
Shop 059
├── src/
├── gradle/
├── build.gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
├── README.md
└── Report.pdf
```

## Running the Project

The project uses Gradle. On Windows, it can be built with:

```powershell
.\gradlew build
```

The main program is located at:

```text
src/main/java/org/example/Main.java
```

For more details about the implementation and menus, see [Report.pdf](Report.pdf).
