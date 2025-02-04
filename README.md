# Calculator  
## Overview  
The Calculator program is a comprehensive, menu-driven Java application that performs a variety of mathematical operations. It includes basic arithmetic calculations, Fibonacci sequence generation, mean, and variance computations. The program features a modular design with three primary classes: Main, Calculator, and UserInput, ensuring clean separation of logic and ease of maintenance.  

## Classes and Functions
### 1. Main (Main.java)
Purpose:  
This is the starting point of the program. It's where everything begins!  

What it does:  
- Shows a menu for users to pick an operation they want to perform.
- Acts as a bridge between the user and the Calculator class.
- Calls the appropriate methods from the Calculator class to perform the selected operation and displays the results.

Why it’s great:  
It uses a neat switch statement to manage user input, making it straightforward to call the right method based on the user's choice.  

### 2. Calculator (Calculator.java)
Purpose:  
This class is the brain of the program. It contains all the logic needed to perform the mathematical operations.  

What it can do:  
- **Addition:**  Adds two numbers.
- **Subtraction:**  Finds the difference between two numbers.
- **Multiplication:**  Multiplies two numbers.
- **Division:**  Divides two numbers and handles situations like dividing by zero.
- **Fibonacci:**  Generates a Fibonacci sequence for a given number of terms.
- **Mean:**  Calculates the average of an array of numbers.
- **Variance:**  Determines how spread out the numbers in an array are.

Why it’s great:  
It keeps all the math-related logic in one place, making the code cleaner and easier to maintain.  
It's smart enough to handle tricky cases, like division by zero or invalid inputs.  

### 3. UserInput (UserInput.java)  
Purpose:  
This class is the friendly face of the program. It takes care of getting input from the user and helps them navigate the menu.  

What it does:  
- Number Input: Helps the user enter two numbers for operations like addition or subtraction.
- Array Input: Lets the user input a list of numbers for calculations like mean and variance.
- Menu Selection: Displays a menu for the user to pick an operation and captures their choice.

Why it’s great:  
It ensures that the user enters valid data before the calculations start.  
By separating input handling from the core logic, it keeps the program organized and easier to understand.  

## Usage Instructions
1. Clone the repositary
2. Compile the program: javac Main.java Calculator.java UserInput.java
3. Run the program: java Main
4. Follow the Menu:
   - Select a mathematical operation by entering the corresponding number.
   - Provide the required inputs as prompted.
   - View the results in the console.

## Repositary Structure
Calculator/  
├── Main.java        # Entry point of the program  
├── Calculator.java  # Contains all mathematical logic  
├── UserInput.java   # Handles user input and menu interactions  
└── README.md        # Program documentation  
