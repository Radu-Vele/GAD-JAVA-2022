# Singleton Design Pattern Object: Online Bank Management

Author: Radu Vele

@gitHub: Radu-Vele
> The project aims to offer a real-life situation when the implementation of the Singleton Design Pattern could prove to be useful.

### Problem
The given situation is when, in an on-line banking system, multiple users want to access the bank repository (that contains information about all accounts).
The bank repository needs to exist in a single instance (as the data inside it should normally be loaded from a database).
### Implementation
The BankRepository class is implemented using the LazyInitialization variant of the singleton design pattern.
This way, each Virtual ATM instance will get the same instance of the Bank Repository.
### How to use the application
The main method launches the Home window where the users can open new "ATM Terminals".
For simplicity, when the BankRepository is instanced, some data about the existing users is loaded.


The loaded IDs are:

| User_ID |
|---------|
| User1   |
| User2   |

After "logging in" the users can see the information about their account.

### Conclusions
Further improvements:
- adding a Log In procedure
- using a database for the persistence of data in the Bank Repository
- improving the GUI
- adding additional features (adding money, changing the currency,...)
- adding security procedures.
