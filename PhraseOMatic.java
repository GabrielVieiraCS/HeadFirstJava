public class PhraseOMatic {

    public static void main (String [] args) {
        String [] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "win-win", "Poo-Poo", "dynamic", "Yayy"};

        String [] wordListTwo = {"oriented", "Kras", "Chicken-legs", "Easy Gainzzz"};

        String [] wordListThree = {"Time", "Boomer", "New Vegas"};

        //Find the number of words in a list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Generate three random numbers
        int rand1 =(int) Math.random() * oneLength;
        int rand2 =(int) Math.random() * twoLength;
        int rand3 =(int) Math.random() * threeLength;

        //Build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Print out a phase
        System.out.println("What we need is a " + phrase);
    }
}