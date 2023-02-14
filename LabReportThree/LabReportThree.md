# **CSE 15L Lab Report Three - Researching Commands**

# Command: `find`

## 1. `find -type`:
This option lets you search for specific types of files. The options are 'f' for regular files, 'd' for directories, and 'l' for symbolic links.

Examples: 

```
#Example 1:

$ find written_2 -type d
written_2
written_2/non-fiction
written_2/non-fiction/OUP
written_2/non-fiction/OUP/Berk
written_2/non-fiction/OUP/Abernathy
written_2/non-fiction/OUP/Rybczynski
written_2/non-fiction/OUP/Kauffman
written_2/non-fiction/OUP/Fletcher
written_2/non-fiction/OUP/Castro
written_2/travel_guides
written_2/travel_guides/berlitz1
written_2/travel_guides/berlitz2
```

This command printed out all the directories and subdirectories in the `written_2` folder.

```
#Example 2:

$ find written_2 -type f -name Bali*
written_2/travel_guides/berlitz2/Bali-History.txt
written_2/travel_guides/berlitz2/Bali-WhereToGo.txt
written_2/travel_guides/berlitz2/Bali-WhatToDo.txt
```

This command printed out all files whose name starts with "Bali" in the in the `written_2` directory.

## 2. `find -name` and `find -iname`:
his option allows you to search for files or directories with a specific name. `find -iname` is case-insensitive.

Examples: 

```
#Example 1:

$ find written_2 -type f -name bali*
```

This command does not print anything because none of the files start with "bali".

```
#Example 2:

find written_2 -type f -iname bALi*
written_2/travel_guides/berlitz2/Bali-History.txt
written_2/travel_guides/berlitz2/Bali-WhereToGo.txt
written_2/travel_guides/berlitz2/Bali-WhatToDo.txt
```

This command printed out all files whose name starts with "bALi", ignoring the case in the in the `written_2` directory.

## 3. `find -size`: 
This option allows you to search for files of a specific size. You can specify the size in bytes, kilobytes, or megabytes using the symbols c for bytes, k for kilobytes, and M for megabytes.

Examples: 

```
#Example 1:

$ find written_2 -size +100kb
written_2/non-fiction/OUP/Berk/ch2.txt
written_2/non-fiction/OUP/Berk/CH4.txt
written_2/travel_guides/berlitz1/WhereToIndia.txt
written_2/travel_guides/berlitz1/WhereToItaly.txt
written_2/travel_guides/berlitz1/WhereToMalaysia.txt
written_2/travel_guides/berlitz1/WhereToJapan.txt
written_2/travel_guides/berlitz1/WhereToFrance.txt
written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt
written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
written_2/travel_guides/berlitz2/China-WhereToGo.txt
```

This command printed out all the files in the in the `written_2` directory with a size of 100kb.

```
#Example 2:

$ find written_2 -size +10M
```

This command does not print out anything becaus ethere are no files with size 10MB in the `written_2` directory.

## 4. `find -mtime` and `find -mmin`:
These options let you search for files modified within a specified time period. -mtime searches by days and -mmin searches by minutes.

Examples: 

```
#Example 1:

$ find written_2/non-fiction/OUP/Abernathy -mmin 5
written_2/non-fiction/OUP/Abernathy
written_2/non-fiction/OUP/Abernathy/ch2.txt
written_2/non-fiction/OUP/Abernathy/ch3.txt
written_2/non-fiction/OUP/Abernathy/ch1.txt
written_2/non-fiction/OUP/Abernathy/ch7.txt
written_2/non-fiction/OUP/Abernathy/ch6.txt
written_2/non-fiction/OUP/Abernathy/ch8.txt
written_2/non-fiction/OUP/Abernathy/ch9.txt
written_2/non-fiction/OUP/Abernathy/ch15.txt
written_2/non-fiction/OUP/Abernathy/ch14.txt
```

This command returns all files in the `written_2/non-fiction/OUP/Abernathy` directory which were modified exactly 5 minutes ago. 

```
#Example 2:

$ find written_2/non-fiction/OUP/Abernathy -mtime 0
written_2/non-fiction/OUP/Abernathy
written_2/non-fiction/OUP/Abernathy/ch2.txt
written_2/non-fiction/OUP/Abernathy/ch3.txt
written_2/non-fiction/OUP/Abernathy/ch1.txt
written_2/non-fiction/OUP/Abernathy/ch7.txt
written_2/non-fiction/OUP/Abernathy/ch6.txt
written_2/non-fiction/OUP/Abernathy/ch8.txt
written_2/non-fiction/OUP/Abernathy/ch9.txt
written_2/non-fiction/OUP/Abernathy/ch15.txt
written_2/non-fiction/OUP/Abernathy/ch14.txt
```

This command returns all files in the `written_2/non-fiction/OUP/Abernathy` directory which were modified exactly 0 days ago. 

## Sources Used: `man find`, ChatGPT

ChatGPT prompts: 
1. "bash find command options"
2. "find -mmin"
3. "find -mtime"