Use this file to record your reflection on this assignment.

- What are your initial impressions of how `Encapsulation` affects your programming?
- What worked, what didn't, what advice would you give someone taking this course in the future?

My immediate takeaway is that encapsulation is encapsulation really helps my programming. When we were working in class, it mostly seemed like a data protection measure, like keeping the passenger manifest private in this assignment. But having the contained accessors made logical sense to me, helping me reason out my code, and these methods made object oriented programming easier. It also made testing easier because I could go through multiple classes at once—for instnace, if the capacity and manifest methods work in train.java, then I know they also work in car.java because they reference each other. Keeping class relationships in mind worked great for this assignment. I sketched out a diagram to get a sense of how the classes connected to each other. I did get pretty stuck on the passenger methods at first. The readme.md said to check the value returned by the car methods, but because boardCar and getOffCar were void methods, I didn't know what I was supposed to do with the return values. I ended up just printing a simple text confirmation if boarding or exiting was successful. 

I don't think it was strictly required for this assignment, but I also ended up writing a little extra code for the capacity variables: when you enter the parameters for the train, whatever value you set for the passenger capacity will be divided semi-equally among however many cars you choose, with the remainder on the last car. I'm not sure if that's how I was supposed to handle that or if I could have chosen random defaults for passengerCapacity and maxCapacity, but it was nice to get a little more practice with mathematical operators.

**REVISION LOG**
- added a couple missing JavaDoc comments for methods and specified which were accessors
- added an if statement so an empty passenger list still printed something to the console; fixed the bug where it returns      Passenger@<hexcode> instead of passenger names
- removed train method redundancies and fixed my capacity misinterpretation (constructing a train will now select a capacity for each car instead of one maximum split among nCars, and getMaxCapacity method changed accordingly)
- I was unsure what to do for the rubric item "ArrayList declared but not initialized". I ended up with declaring manifest as a class variable, and each instance of the car initializes its own manifest with a given capacity with the line:
    this.manifest = new ArrayList<Passenger>(capacity)
I don't know if this is technically initializing it because it doesn't set a value, but because the list stores Passenger objects, I wasn't sure if I could really create an empty set like I would with 0 integers or empty strings. 
