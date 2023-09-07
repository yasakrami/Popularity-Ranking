# Baby Name Ranking Lookup

## Description

In this project, we create a program that allows users to look up the popularity ranking of baby names from years 2001 to 2021 (top 1000) based on gender and a specific name. The ranking data is downloaded from the [Social Security Administration (SSA)](www.ssa.gov/oact/babynames) website and stored in separate text files named `babynameranking2001.txt`, `babynameranking2002.txt`, ..., `babynameranking2021.txt`.

The program prompts the user to enter the desired year, gender (M for male or F for female), and the name they want to look up. It then displays the ranking of the entered name for the specified year. If the name is not ranked for that year, it informs the user accordingly.

### Sample Input/Output

Here are sample runs of the program:

Enter the year: 2010
Enter the gender: M
Enter the name: Javier
Javier is ranked #190 in year 2010

Enter the year: 2010
Enter the gender: F
Enter the name: ABC
The name ABC is not ranked in year 2010
