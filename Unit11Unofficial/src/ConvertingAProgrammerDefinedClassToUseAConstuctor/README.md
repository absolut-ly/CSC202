# Summary
In this lab, you will make changes to the previous programmer-defined class to use constructors, and then use it in a Java program. The program should create two `Rectangle` objects and find their area and perimeter.  
When creating a `Rectoangle` object, you should be able to use the dimensions as arguments, or if the `Rectangle` is created without dimensions, the methods that calculate the area and perimeter should include instructions to assign them.

### Instructions
* Make sure the class file named Rectangle.java is open.
* In the `Rectangle` class, create two private attributes named `length` and `width`. Both `length` and `width` should be data type `double`.
* Write private `set` methods to set the values for `length` and `width`.
* Write a public constructor method that takes no arguments. The dimension will be the default size of `0` length and `0` width.
* Write another public constructor that takes two parameters of type double to be used as `length` and `width`.
* Write public `calculateArea()` and `calculatePerimeter()` methods to calculate and return the area and perimeter of the rectangle. If the rectangle does not have dimensions, have the user input dimensions.
* Open the file named **MyRectangleClassProgram.java**.
* In the `MyRectangleClassProgram` class, have the user create `Rectangle` objects and calculate the area and perimeter of each object. The user should have the option to continue by typing `"Y"` or to quit by typing a sentinel value.
* Print the values or each `Rectanlge` object's area and perimeter.
* Execute the program.