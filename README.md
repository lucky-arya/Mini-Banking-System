# Mini-Banking-System

This is a simple console-based banking system implemented in Java. It allows users to perform basic banking operations such as creating accounts, depositing money, withdrawing money, transferring money between accounts, and viewing account details.

Features
--------

Create Account
--------------
Allows users to create a new account by providing the account holder's name and an initial deposit.

Each account is assigned a unique account number.

Deposit Money
-----------
Users can deposit money into their accounts by specifying the account number and deposit amount.

Withdraw Money
-------------
Users can withdraw money from their accounts. The system ensures that the account has sufficient funds before processing the withdrawal.

Transfer Money
------------
Allows transferring money between two accounts. The system validates the existence of both accounts and ensures the sender has enough balance.

View Account Details
-------------------
Displays details such as the account number, account holder's name, and current balance.

Exit
-------
Terminates the program.

Technologies Used
----------
Programming Language: Java

How to Run the Program
-------------------
Clone the Repository:

git clone https://github.com/lucky-arya/mini-banking-system.git

Navigate to the Project Directory:
-----------
cd mini-banking-system

Compile the Code:
------------------
javac MiniBankingSystem.java

Run the Program:
----------------
java MiniBankingSystem

Follow the On-Screen Menu:
------------------------
Select an option from the menu and follow the prompts to perform banking operations.

Sample Menu
-------------
=== Mini Banking System ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Transfer Money
5. View Account Details
6. Exit
Enter your choice:

Code Structure
-----------
Account Class:
-------------
Encapsulates account-related information and operations like deposit, withdrawal, and displaying account details.

BankingSystem Class:
---------------------
Manages a list of accounts and implements methods for account creation, depositing, withdrawing, transferring money, and viewing account details.

MiniBankingSystem Class:
---------------------
Contains the main method and provides a menu-driven interface for user interaction.

Improvements and Suggestions
-----------------------------
Input Validation:
------------------
Add more robust input validation to handle invalid inputs gracefully.

Persistence:
------------
Store account data in a file or database to make the system persistent.

User Authentication:
--------------------
Add support for user authentication to enhance security.

UI Enhancement:
-----------------
Develop a graphical user interface (GUI) for better user experience.

Contributing

Contributions are welcome! If you have suggestions or improvements, feel free to fork the repository and submit a pull request.
