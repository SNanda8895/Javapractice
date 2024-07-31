package org.example;

public class BinaryNumber {
public static int binarySequence(int number){

if(number == 1) return 2;
if(number == 2) return 3;
return binarySequence(number-1) + binarySequence(number-2);

//f(n)=f(n-1)+(n-2)
}

    public static void main(String[] args) {

System.out.println(binarySequence(4));
System.out.println(binarySequence(5));
System.out.println(binarySequence(6));
    }
}
//Think of binary numbers: sequences of 0’s and 1’s. How many n-digit binary numbers are there that don’t have two adjacent 1 bits? For example, here are the three-digit numbers:
//
//000 001 010011 100 101110 111
//
//Five of the possible eight combinations meet the criteria
//
//What is the number for sequences of length 4, 5, 10, n?