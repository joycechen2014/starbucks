# starbucks-joycechen2014

## About
Starbucks Mobile Apps Simulator, including the funcitons below:


## Functions
Behavior | Design Patter
--- | ---
Login | Observer pattern. The KeyPad is the subject and Passcode and PinEntryMachine are observers. Everytime a password entered, the observers will get notification to update state to 0 digit,1 digit,2 digits ,3 digit and 4 digits. In this case, I attach another observer AppAuthproxy to the subject and when there are 4 digits have entered. A "Invalid Pin" will be displayed. 
Setting | Singleton pattern. The Frame is defined as a singleton pattern. Since there is only one frame in the whole program. And every time the program change the current screen. We can use the Frame.getInstance().setCurrentScreen();
Add Card | Composite pattern and observer. Created two new classes: CardID and CardCode. Use composite pattern to make the Add Card page. It includes CardID, CardCode,Spacer and KeyPad,and the CardID and CardCode are also the observer of KeyPad. By default, CardID is the observer and when a number is touched, the CardId will be notified to update. And after touch(2,3), the CardID will be removed from the observer and CardCode will be added to observer and CardCode will be updated.
prev & next | By entering next, the length of CardID and CardCode will be checked and if it correct, the new card will be created with defaul price 20.00; And the frame will be directed to the MyCards pages. By clicking prev, the frame will be directed to setting page.

## Example Usage
```
int[] coinsTypeAny = new int[]{1, 10, 25, 50};s
GumballMachine gumballMachine =  new GumballMachine(5,coinsTypeAny,50);
gumballMachine.insertCoin(25);
gumballMachine.insertCoin(25);
gumballMachine.turnCrank();
```

## Testing
Use GumballMachineTest to do the test. 
GumballMachine1:
![image](https://github.com/gopinathsjsu/assignment-1-gumball-joycechen2014/blob/master/GumbalMachine1.png)
GumballMachine2:
![image](https://github.com/gopinathsjsu/assignment-1-gumball-joycechen2014/blob/master/GumballMachine2.png)
GumballMachine3:
![image](https://github.com/gopinathsjsu/assignment-1-gumball-joycechen2014/blob/master/GumballMachine3.png)
