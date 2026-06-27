# Library Catalog

A simple yet functional Java-based Library Management System that allows users to manage a catalog of library items through an interactive GUI.

## Overview

The Library Catalog project is a desktop application designed to help manage library items efficiently. It provides a user-friendly interface built with Java Swing that enables users to perform basic library operations such as adding items, removing items, and viewing the complete catalog.

## Features

- **Add Items**: Add new library items (books) to the catalog with title, author, and unique item ID
- **Remove Items**: Remove items from the catalog by searching for their item ID
- **View Catalog**: Display all items currently stored in the catalog
- **User-Friendly GUI**: Interactive dialog-based interface using JOptionPane for easy navigation

## Project Structure

The project consists of three main Java classes:

### 1. **LibraryItem.java**
A generic class that represents a single library item with the following properties:
- `title`: The title of the item
- `author`: The author of the item
- `itemID`: A unique identifier for the item

Includes getters, setters, and a `toString()` method for easy string representation.

### 2. **Catalog.java**
A generic container class that manages a collection of library items:
- Maintains an ArrayList of library items
- Provides methods to add and remove items
- Includes a method to display all items in the catalog
- Uses generics to ensure type safety

### 3. **Library_System.java**
The main application class that serves as the entry point:
- Implements a menu-driven interface with four main options
- Handles user interactions through JOptionPane dialog boxes
- Manages the main application loop until the user chooses to exit
- Processes all CRUD (Create, Read, Update, Delete) operations

## How to Use

1. **Compile the Java files**:
   ```bash
   javac *.java
   ```

2. **Run the application**:
   ```bash
   java Library_Catalog.Library_System
   ```

3. **Menu Options**:
   - **Option 1**: Add a new item to the catalog
   - **Option 2**: Remove an item from the catalog
   - **Option 3**: View all items in the catalog
   - **Option 4**: Exit the application

## Technical Details

- **Language**: Java
- **GUI Framework**: Java Swing (JOptionPane)
- **Data Structure**: ArrayList
- **Design Pattern**: Generic programming for type-safe collections

## Learning Concepts

This project demonstrates several important Java concepts:
- Object-Oriented Programming (OOP)
- Generics and type parameterization
- Collection Framework (ArrayList)
- GUI development with Swing
- Exception handling
- Control flow with switch statements

## Future Enhancements

Potential improvements could include:
- Persistent data storage (file or database)
- Advanced search and filtering capabilities
- Different item types (books, magazines, journals, etc.)
- User authentication and library card system
- Borrowing and returning functionality
- Improved GUI with modern frameworks (JavaFX)

---

**Created**: April 2024
