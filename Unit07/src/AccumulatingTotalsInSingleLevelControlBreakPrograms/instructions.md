#Summary
In this lab, you will use what you have learned about accumulating totals in a single-level control break program to complete a Java program.
The program should produce a report for a supermarket manager to help her keep track of the hours worked by her part-time employees.
The report should include the day of the week and the total hours worked by all employees each day.

##Instructions  

1) Study the prewritten code to understand what has already been done.  
2) Write the control break code, including the code for the dayChange() method, in the main() method.  
3) Execute this program using the following input values:  
   ```
   Monday – 6 hours (employee 1), 3 hours (employee 2), 4 hours (employee 3)
   Tuesday – 4 hours (employee 1), 2 hours (employee 2)
   Wednesday – 2 hours (employee 1), 4 hours (employee 2), 6 hours (employee 3)
   Thursday – 4 hours (employee 1)
   Friday – 3 hours (employee 1), 4 hours (employee 2), 3 hours (employee 3)
   Saturday – 7 hours (employee 1), 7 hours (employee 2), 7 hours (employee 3)
   Sunday – 0 hours
   ```

An example program execution is shown below:

```
WEEKLY HOURS WORKED


Enter day of week or done to quit:
Monday
Enter hours worked:
2
Monday 2.0
Enter a day of week or done to quit:
Monday
Enter hours worked:
4
Monday 4.0
Enter a day of week or done to quit:
Tuesday
Enter hours worked:
8
          Day Total (Monday) 6.0
Tuesday 8.0
Enter a day of week or done to quit:
done
          Day Total (Tuesday) 8.0
```