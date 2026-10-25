# Scientific Calculator - NetBeans Java Project

A complete menu-driven Scientific Calculator developed in Java for **Fundamentals of Programming (Practical)**.

---

## ☕ How to Open in Apache NetBeans

Your project is now a full, native NetBeans project! Follow these simple steps:

1. Open **Apache NetBeans**.
2. Click **File** in the top menu $\rightarrow$ **Open Project...** (or press `Cmd + Shift + O` on Mac / `Ctrl + Shift + O` on Windows).
3. Navigate to:
   ```text
   Desktop > CUI WORK > Fundamentals of Progamming > Practical > CUI ASSIGNMENTS:QUIZ > Assignmnet02 > ScientificCalculator-Assignment
   ```
4. You will see this folder with a **yellow coffee-cup icon** (which means NetBeans recognizes it as a valid NetBeans project).
5. Select it and click **Open Project**.
6. In NetBeans, press the green **Run Project** button (▶) or press `F6`.
7. The menu will appear in the **Output** tab at the bottom. Click inside the Output tab to type your inputs and press **Enter**!

---

## 📂 Project Structure

```text
ScientificCalculator-Assignment/
├── nbproject/                      # NetBeans project configuration
│   ├── project.xml                 # Project definition & metadata
│   └── project.properties          # Classpath, source, and main class setup
├── src/
│   └── scientificcalculator/
│       └── ScientificCalculator.java  # Main Java Source Code
├── build.xml                       # Ant build script for NetBeans
├── manifest.mf                     # JAR manifest metadata
└── README.md                       # Project documentation
```

---

## 📌 Features Supported

### 1. Basic Arithmetic Operations
- **Addition (`+`)**: `add(a, b)`
- **Subtraction (`-`)**: `subtract(a, b)`
- **Multiplication (`*`)**: `multiply(a, b)`
- **Division (`/`)**: `divide(a, b)` (Includes check for division by zero)

### 2. Trigonometric Functions
- **Sine (`sin`)**: `sine(angle)` (converts degrees to radians using `Math.toRadians()`)
- **Cosine (`cos`)**: `cosine(angle)`
- **Tangent (`tan`)**: `tangent(angle)` (includes check for undefined angles like 90°, 270°)

### 3. Exponential & Logarithmic Functions
- **Power ($x^y$)**: `Math.pow(base, exponent)`
- **Square Root ($\sqrt{x}$)**: `Math.sqrt(number)` (validates that input $\ge 0$)
- **Natural Logarithm ($\ln x$)**: `Math.log(number)` (validates that input $> 0$)
- **Base-10 Logarithm ($\log_{10} x$)**: `Math.log10(number)` (validates that input $> 0$)

### 4. Rounding Functions
- **Ceiling**: `Math.ceil(number)`
- **Floor**: `Math.floor(number)`
- **Round**: `Math.round(number)`

### 5. Other Mathematical Operations
- **Absolute Value ($|x|$)**: `Math.abs(number)`
- **Minimum Value**: `Math.min(a, b)`
- **Maximum Value**: `Math.max(a, b)`
- **Random Number Generation**: `min + (Math.random() * (max - min))`

---

## 🛡️ Input Validation & Error Handling
- **Menu choice validation**: Handles invalid numeric choices and non-integer inputs without crashing.
- **Division by zero**: Rejects denominator equal to zero (`num2 == 0`).
- **Square root of negative number**: Rejects negative inputs.
- **Logarithms of non-positive numbers**: Rejects values $\le 0$.
- **Tangent undefined angles**: Handles 90° / 270° angles gracefully.
- **Exit Option**: The program runs continuously in a `while` loop until the user chooses `0` to exit.