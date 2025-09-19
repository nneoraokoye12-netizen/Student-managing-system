# Student Grade Manager

A Java console application for managing student records and grades in a classroom setting.

## Overview

The Student Grade Manager is a command-line application that allows teachers to manage student information, track grades, and generate reports. The application provides an interactive menu system for easy navigation and comprehensive grade management features.

## Features

- **Student Management**
  - Add new students to the system
  - Remove students by their unique ID
  - View all students and their information

- **Grade Management**
  - Add grades for individual students
  - Update existing grades
  - Support for up to 5 test scores per student
  - Automatic calculation of student averages
  - Letter grade assignment based on numerical scores

- **Reporting & Statistics**
  - Individual student grade reports
  - Class-wide statistics
  - Average class grade calculation
  - Comprehensive student listings

## Project Structure

```
├── src/main/java/com/school/grademanager/
│   ├── GradeManagerApp.java    # Main application entry point
│   ├── GradeManager.java       # Core student management logic
│   ├── Student.java            # Student data model
│   ├── MenuSystem.java         # User interface and menu handling
│   └── ReportGenerator.java    # Report generation utilities
├── Exceptions.java             # Custom exception classes
├── pom.xml                     # Maven project configuration
└── target/                     # Compiled classes and dependencies
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven (for dependency management)

### Running the Application

1. **Compile the project:**
   ```bash
   javac *.java
   ```

2. **Run the application:**
   ```bash
   java GradeManagerApp
   ```

3. **Follow the interactive menu:**
   - The application will display a menu with numbered options
   - Enter the number corresponding to your desired action
   - Follow the prompts to complete each operation

## Menu Options

1. **Add Student** - Register a new student with first and last name
2. **Remove Student** - Remove a student using their unique ID
3. **View All Students** - Display a complete list of all registered students
4. **Add Grade** - Add a new test score for a specific student
5. **Update Grade** - Modify an existing grade for a student
6. **Class Statistics** - View overall class performance metrics
7. **Exit** - Close the application

## Key Classes

### GradeManager
The core management class that handles:
- Student collection storage
- Student ID generation
- Add/remove operations
- Student lookup functionality
- Class average calculations

### Student
Represents individual students with:
- Personal information (first name, last name, unique ID)
- Grade collection (up to 5 test scores)
- Average grade calculation
- Letter grade determination

### MenuSystem
Handles user interaction:
- Menu display and navigation
- Input validation
- Choice processing
- Integration with GradeManager operations

### ReportGenerator
Provides reporting capabilities:
- Individual student reports
- Class-wide statistics
- Formatted output for easy reading

## Grade Calculation

- **Numerical Grades**: Stored as decimal values
- **Average Calculation**: Simple arithmetic mean of all grades
- **Letter Grades**: Automatically assigned based on standard grading scale
- **Class Statistics**: Aggregate calculations across all students

## Error Handling

The application includes custom exception handling for:
- Duplicate student entries
- Invalid input validation
- Illegal argument exceptions
- Boundary condition management

## Future Enhancements

Potential areas for expansion:
- Persistent data storage (file or database)
- Grade weighting and categories
- Export functionality for reports
- Advanced statistical analysis
- Multi-class support

## License

This project is developed for educational purposes.