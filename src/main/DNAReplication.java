package main;

/*
DP SL Computer Science
@author Will Blanchard
 */
public class DNAReplication {

    //Method to copy the dna sequence
    public char[] copyDNAStrand(char[] strand) {

        char[] copiedStrand = new char[strand.length];

        for (int index = 0; index < strand.length; index++) {

            if (strand[index] != 'A' && strand[index] != 'C' && strand[index] != 'G' && strand[index] != 'T') {

                System.out.println("An invalid character has been found at index " + index + " please ensure your DNA strand has been entered correctly");

            } else {

                copiedStrand[index] = strand[index];

            }//End of If-Else Statement

        }//End of For Loop

        return copiedStrand;

    }//End of Method
    
    //Method to invert the dna strand so it can be replicated
    public char[] invertDNAStrand(char[] strand) {
        
        //Same looping technique as before
        int index = 0;
        char[] invertedArray = new char[strand.length];
        
        for (char element : strand) {
            
            if (element == 'A') {
                
                invertedArray[index++] = 'C';
                
            } else if (element == 'C') {
                
                invertedArray[index++] = 'A';
                
            } else if (element == 'G') {

                invertedArray[index++] = 'T';

            } else if (element == 'T') {

                invertedArray[index++] = 'G';

            } else {

                System.out.println("An invalid character has been found at index " + index + " please ensure your DNA strand has been entered correctly");
                index++;

            }//End of If-Else-If-Else Statement

        }//End of Method

        return invertedArray;
        
    }//End of Method

}//End of Class