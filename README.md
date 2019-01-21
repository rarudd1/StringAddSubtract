# StringAddSubtract

This project takes two strings and a number. 
Therefore you have a first string, a second string, and a number stating the amount of 
changes you can do to the strings.

It then determines if the first string can be made into the second string. By deleting letters 
off the end of the first string and adding letters onto the end of the first string to make the 
second string. The changes must be done using exactly the amount of changes given. 

So for example if ‘Candle’ can be changed to ‘Cans’ with exactly 4 changes the program 
prints “Yes” if it cannot be changed the program prints “No.” The answer to the example is yes.

You can remove ‘dle’ with 3 changes and add ‘s’ with 1 additional change. So 4 total changes.
Also it is valid to use up changes by subtracting letters from a null string. So for example 

If given the first string ‘ex’ and the second string ‘baby’ with 10 changes possible, the 
answer is “Yes” because we can remove all of the first string with 2 changes then use up the 
extra 4 changes removing “nonletters” from the null string. Then we can use the last 4 changes to add baby. 

You cannot add null letters to the end of the second string. 
