# Week 11

## Exercise 1
The provided code sample throws an `Exception` and prints a stack trace when executed.  There are times when you might want to catch an `Exception` and handle it more gracefully by taking some corrective action.  Perform the following steps:
- Instead of printing a stack trace, handle the `Exception` gracefully by printing an error message instead.  Compiled and execute the code again.
- There may also be times when you don't want to handle the Exception at all (thereby allowing it to propagate all the way through `main()`, causing your program to terminate ungracefully.  Remove all `Exception` handling code and re-execute your program.
