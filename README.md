# Project: Employee Management System

This project is a simple **Employee Management System** implemented in **Java** using **Object-Oriented Programming (OOP) principles**. It supports managing both **full-time and part-time employees**, storing them in a payroll system, and calculating their salaries based on their contract type.

## Key Features
- **Abstract Employee Class**: Defines common properties (`name`, `id`) and an abstract method `calculateSalary()`.
- **FullTimeEmployee Class**: Extends `Employee` and calculates salary based on a fixed monthly amount.
- **PartTimeEmployee Class**: Extends `Employee` and calculates salary based on hours worked and hourly wage.
- **Payroll Management System**: Maintains a list of employees, allows adding/removing employees, and displays employee details.
- **Main Method Execution**: Demonstrates functionality by creating employees, adding them to payroll, displaying data, and removing employees.
