# problem-Mars_Exploration

1-Review:

Sami's spaceship crashed on Mars! She sends a series of SOS messages to Earth for help. 
Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string (s) determine how many letters of Sami's SOS have been changed by radiation.

For example, Earth receives SOSTOT. Sami's original message was SOSSOS. Two of the message characters were changed in transit. 

2-Input Format

There is one line of input: a single string (s).

Note: As the original message is just SOS repeated (n) times, (s)'s length will be a multiple of 3.

3-Output Format

Print the number of letters in Sami's message that were altered by cosmic radiation.

Ex:

1-Input
    
    SOSSPSSQSSOR
    
2-Output

    The Corruption letter is : PQR
    The number of letters that were deleted : 0
    The number of letters that were altered : 3
    
3-Explanation 0

s= SOSSPSSQSSOR, and signal length |s|=12. Sami sent 4 SOS messages (i.e.:12/3=4).

    Expected signal: SOSSOSSOSSOS
    Recieved signal: SOSSPSSQSSOR
    Difference:          X  X   X
    
    
