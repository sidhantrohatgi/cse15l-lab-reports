# Command to clone the forked repo
CLONE="git clone git@github.com:sidhantrohatgi/lab7.git;"

# Command to cd into the repo
CD="cd lab7/;"

# Command to compile tester file and java file
COMPILE="javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java;"

# Command to run tests
RUN="java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests;"

# Command to manipulate text file to fix error
FIX="sed -i '43s/index1/index2/g' ListExamples.java;"

# Command to add file using git
ADD="git add ListExamples.java;"

# Command to commit changes
COMMIT="git commit -m \"fixed errors using bash script\";" 

# Command to push changes
PUSH="git push;"

RESULT=$CLONE$CD$COMPILE$RUN$FIX$COMPILE$RUN$ADD$COMMIT$PUSH

# echo $RESULT

ssh -o StrictHostKeyChecking=no cs15lwi23ajd@ieng6.ucsd.edu $RESULT
