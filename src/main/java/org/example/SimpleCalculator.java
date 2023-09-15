package org.example;

public class SimpleCalculator {

        // Instance variables
        private double firstNumber;
        private double secondNumber;

        // Getter for firstNumber
        public double getFirstNumber() {
            return firstNumber;
        }

        // Getter for secondNumber
        public double getSecondNumber() {
            return secondNumber;
        }

        // Setter for firstNumber
        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        // Setter for secondNumber
        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

        // Method to calculate addition result
        public double getAdditionResult() {
            return firstNumber + secondNumber;
        }

        // Method to calculate subtraction result
        public double getSubtractionResult() {
            return firstNumber - secondNumber;
        }

        // Method to calculate multiplication result
        public double getMultiplicationResult() {
            return firstNumber * secondNumber;
        }

        // Method to calculate division result, handling division by zero
        public double getDivisionResult() {
            if (secondNumber == 0) {
                return 0; // Avoid division by zero
            }
            return firstNumber / secondNumber;
        }
    }

