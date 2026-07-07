# Sum and Average Calculator in Java

## 📌 Overview

This project is a simple Java console application that accepts **four integer values** from the user, calculates their **sum** and **average**, and displays the results.
The program demonstrates the fundamentals of Java programming, including user input, arithmetic operations, variables, and output formatting. It is an ideal beginner project for learning basic programming concepts.

---

## 🚀 Features

* Accepts four integer inputs from the user
* Calculates the sum of all numbers
* Computes the average using floating-point arithmetic
* Displays the calculated results
* Beginner-friendly and easy to understand

---

## 🛠️ Technologies Used

* Java
* Scanner Class
* Arithmetic Operators

---

## 📂 Project Structure

```text
├── SumAverage.java
└── README.md
```

---

## 💻 Source Code

```java
import java.util.Scanner;

class SumAverage {
    public static void main(String[] args) {
        Scanner kbin = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.print("Enter first number  : ");
        n1 = kbin.nextInt();

        System.out.print("Enter second number : ");
        n2 = kbin.nextInt();

        System.out.print("Enter third number  : ");
        n3 = kbin.nextInt();

        System.out.print("Enter fourth number : ");
        n4 = kbin.nextInt();

        int sum = n1 + n2 + n3 + n4;
        float avg = sum / 4.0f;

        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + avg);
    }
}
```

---

## ▶️ How to Run

### Compile the Program

```bash
javac SumAverage.java
```

### Run the Program

```bash
java SumAverage
```

---

## 📋 Sample Output

### Example

```text
Enter first number  : 10
Enter second number : 20
Enter third number  : 30
Enter fourth number : 40

Sum     : 100
Average : 25.0
```

---

## 🧠 Concepts Covered

* Java Basics
* User Input using `Scanner`
* Variables and Data Types
* Arithmetic Operations
* Floating-Point Calculations
* Console Output

---

## 🔍 Algorithm

1. Start the program.
2. Read four integer values from the user.
3. Calculate the sum of the four numbers.
4. Compute the average by dividing the sum by `4.0`.
5. Display the sum and average.
6. End the program.

---

## ⏱️ Complexity Analysis

| Operation        | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(1)**   |
| Space Complexity | **O(1)**   |

The program performs a fixed number of operations regardless of the input values.

--

## 🔮 Future Improvements

* Accept any number of inputs using loops
* Calculate maximum and minimum values
* Compute median and mode
* Add input validation
* Store numbers in an array for further analysis

---

## 🎯 Learning Outcomes

After completing this project, you will understand:
* How to read user input in Java
* How to perform arithmetic calculations
* The difference between integer and floating-point division
* How to display formatted output in the console

---

## 👨‍💻 Author

**Pranay Jadhao**

Electronics & Telecommunication Engineer
Aspiring Software Engineer | Java | Python | SQL | Data Analytics

---

## 📄 License
This project is open-source and available for educational and learning purposes.
