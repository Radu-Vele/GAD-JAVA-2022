# Observer design pattern Project
Author: Radu Vele

@gitHub: Radu-Vele
> The project aims to offer a real-life situation when the implementation of the Observer Design Pattern could prove to be useful.

### Problem
The situation when, in a on-line delivery application a client makes an order, and the employee needs see the new order and perform it.

### Implementation
For clarity, I defined two interfaces that describe the design pattern: Observer and Observable. This way, the Client class implements observable, while the Waiter class implements observer. 

The GUI is implemented using Java Swing. Obviously some improvements should be made to prettify it :).

### How to use the application
When the app is run, the home page instructs the user to choose its role (Client/Waiter). In each case another window appears.

Client window: the client can add new orders (while all the waiters that are logged in see the new product added to their lists of products).

Waiter window: the waiter sees a lists of orders that need to be served in real time. They can select an order and mark it as done. This way, all the waiters have that order removed for their lists.

### Conclusions
Further improvements:
- add synchronization between employees
- improve the GUI
- use a database to persist the orders between application runs.
