# **CSE 15L Lab Report Four: CLDQ – CSE Labs “Done Quick”**

## Part 1: Logging Into ieng6

I opened a new terminal window and then pressed `^R` to search through the history of commands. Then, I typed in the term ```ssh```. This made the login command show up on my screen. To execute the command, I pressd `<enter>`

![Image](Screenshots/loginSearch.png)

Successful Login Screen: 

![Image](Screenshots/loggedIn.png)

## Part 2: Cloning the Forked Repository

To clone the forked repository, I opened it in my web browser. Then, I clicked on the green "Code" button and copied the ssh link. 

![Image](Screenshots/sshCopy.png)

Then, I ran the command ```git clone <ssh url>```

![Image](Screenshots/cloning.png)

## Part 3: Running Tests

First, I changed my current directory to the cloned repository. To do this, I typed in ```cd``` followed by the letter ```l```, 

![Image](Screenshots/cdRepoOne.png)

Then I pressed ```<enter>``` to auto-complete the command. 

![Image](Screenshots/cdRepoTwo.png)

To view the contents of the current directory, I used the command ```ls```

![Image](Screenshots/ls.png)

Then, I pressed `^R` to search through the history of commands. Firstly, I searched for ```*.java``` to find the command to compile all java files. I pressed ```<enter>``` to execute the command. 

![Image](Screenshots/stardotjava.png)

Then, I searched for ```JUnitC``` to find the command to run the JUnit test. I used the arrow keys to edit the name of the test file at the end of the command ( Typed in ```L```, pressed ```<tab>```, typed ```T```, pressed ```<tab>```, pressed ```<backspace>``` to remove the ```.``` ). Then, I pressed ```<enter>``` to execute the command. 

![Image](Screenshots/JUnitC.png)

Failed Tests: 

![Image](Screenshots/failedtests.png)

## Part 4: Editing code to fix errors

I typed ```nano L```, then pressed ```<tab>```, 

![Image](Screenshots/nanoOne.png)

![Image](Screenshots/nanoTwo.png)

typed ```.j``` and pressed ```<tab>``` again to auto-complete. I pressed ```<enter>``` to execute the command.

![Image](Screenshots/nanoThree.png)

![Image](Screenshots/nanoFour.png)

Nano Editor:

![Image](Screenshots/nanoeditor.png)

I then used the arrow keys to find and edit the java file to fix the error.

![Image](Screenshots/fixerror.png)

To save my changes, I pressed the keys ```^O``` followed by ```<enter>```. 

![Image](Screenshots/wrote.png)

To exit out of nano, I pressed ```^X```.

## Part 5: Running Tests Again

The ```javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java``` command was 3 commands up in the search history, so I pressed the ```<up>``` arrow thrice access it. 

Keys Pressed: ```<up><up><up><enter>```

The ```java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests``` command was 3 commands up in the search history, so I pressed the ```<up>``` arrow thrice access it. 

Keys Pressed: ```<up><up><up><enter>```

Passed Tests:

![Image](Screenshots/testsagain.png)

## Part 6: Committing and Pushing Changes

I typed in ```git add L```, pressed ```<tab>```, typed ```.j``` and pressed ```<tab>``` again to auto-complete. I pressed ```<enter>``` to execute the command.

![Image](Screenshots/gitadd.png)

Commit Command: ```git commit -m <message>```

![Image](Screenshots/gitcommit.png)

Push Command: ```git push```

![Image](Screenshots/gitpush.png)

## Checking changes on Github:

![Image](Screenshots/changesongithub.png)