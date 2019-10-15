# starbucks-joycechen2014

## About
Starbucks Mobile Apps Simulator, including the funcitons below:


## Functions
Behavior | Design Patter
--- | ---
Login | Observer pattern. The KeyPad is the subject and Passcode and PinEntryMachine are observers. Everytime a password entered, the observers will get notification to update state to 0 digit,1 digit,2 digits ,3 digit and 4 digits. In this case, I attach another observer AppAuthproxy to the subject and when there are 4 digits have entered. A "Invalid Pin" will be displayed. 
turnCrank | Get a gumball if reach gumball price
getTotalValue | Get current total value for insert coin(s).

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
