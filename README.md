Lab 1: Build a Maven Java Book Tracker
A book can be created using the createbook() function, this object then can have a title, author, pageCount, and availability value assigned to it.
to read the objects data by using displaydetails(). An objects avalibility can be changed by using the borrowbook() function.

class: book is a class which I use when creating objects and running functions
object: firstbook is an object with a defined bit of memory which stores data assigned to it like author and title
field: the title of firstbook is Bloom, the location of Bloom is a field
method: createbook is a method of using a helper to assign values to objects in a faster way
reference: deisplaydetails uses references to display things like title 



firstbook
title= Bloom
author= AJ
pageCount= 21
available= true

firstbook
title= Bloom
author= AJ
pageCount= 21
available= false

createbook() is separate from main as it's a function and has to be called multiple times
borrowbook() flips the boolien value stored in available and prints a short comment which is dependent on the current state of avalible


displaydetails() works by getting a value from the defined objects memory and uses a println command to display it in the console window

