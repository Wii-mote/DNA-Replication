package main;

import java.util.Arrays;

/*
DP SL Computer Science
@author Will Blanchard
 */
public class Runner {

    public static void main(String[] args) {

        DNAReplication replication = new DNAReplication();

        //Instantiating an array of type char, with a dna strand in it
        char[] dnaStrand1 = {

                'A',
                'C',
                'C',
                'G',
                'A',
                'T',
                'T'

        };

        //Instantiating another array of type char with an erroneous letter in it
        char[] dnaStrand2 = {

                'C',
                'T',
                'G',
                'G',
                'F',
                'T',
                'A'


        };

        //Setting up test cases
        System.out.println("Let's test the program with two DNA strands, one valid strand and one invalid (meaning it contains a character other than A, C, G or T)");
        System.out.println("\nHere is the first strand:");
        System.out.println(Arrays.toString(replication.copyDNAStrand(dnaStrand1)));
        System.out.println();
        System.out.println("\nHere is the second strand:");
        System.out.println(Arrays.toString(replication.copyDNAStrand(dnaStrand2)));
        System.out.println("\nThis is what the second strand's array actually looks like");
        System.out.println(Arrays.toString(dnaStrand2));
        System.out.println("\nNow that we know which strand is erroneous let's prepare the first strand for replication by inverting it. This is what the inverted array looks like");
        System.out.println(Arrays.toString(replication.invertDNAStrand(replication.copyDNAStrand(dnaStrand1))));




    }//End of Main Method

}//End of Class