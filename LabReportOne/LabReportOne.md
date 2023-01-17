# **CSE 15L Lab Report One - Remote Access**


## Step 1 - Finding your CSE15L Account

Go to [https://sdacs.ucsd.edu/~icc/index.php](https://sdacs.ucsd.edu/~icc/index.php)

Enter your Username and Student ID (PID) in the account lookup section. 
Press Submit. 

![Image](Screenshots/AccountLookup.jpg)

Find your username under **Additional Accounts**. 

![Image](Screenshots/Username.png)

**Changing Password**

To Change your password, Click on 'change your password' and follow the on screen instuctions carefully. 


## Step 2 - Installing Visual Studio Code

Go to the [Visual Studio Code Website](https://code.visualstudio.com/Download) and download and install Visual Studio Code onto your computer. 

When you open VS Code, your window should look like this:

![Image](Screenshots/VSCodeHome.png)

## Step 3 - Remotely Connecting

**Additional Step for Windows Users:** 
1. Download [Git for Windows](https://gitforwindows.org)
2. Open Visual Studio Code and press `Ctrl` + \` to open the terminal.
3. Press `Ctrl` + `Shift` + `P` to open the command palette.
4. Type `- Select Default Profile`. 
5. Select the Git Bash option and click on the + in the terminal window. 
6. The new terminal will now be a Git Bash terminal. 

Open a new terminal window in VSCode (`Ctrl` + `Shift` + \`) or (`control` + `Shift` + \`) 
Paste the following Command in the terminal and press enter. 
`ssh <your_username_here>@ieng6.ucsd.edu`

![Image](Screenshots/command.png)

If you are logging in for the first time, you will get the following message: 

![Image](Screenshots/authorize.png)

Type `yes` and press enter. 

You will then be prompted to enter your password.

Enter your password and press enter. (The password might not show up

![Image](Screenshots/login.png)

Congratulations, you are now logged into the server!

## Step 4 - Trying Commands
