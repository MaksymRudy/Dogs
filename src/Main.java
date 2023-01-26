public class Main {
    public static void main(String[] args) {

        Mainecoon mainecoon = new Mainecoon();

        Bald bald = new Bald();

        Pers pers = new Pers();

        Siam siam = new Siam();

        System.out.println("Mainecoon Mustaches : " + mainecoon.getMustaches());
        System.out.println("Mainecoon Ears : " + mainecoon.getEars());
        System.out.println("Mainecoon Claws :" + mainecoon.getClaws());
        System.out.println("Mainecoon Tails :" + mainecoon.getTails());
        System.out.println("Bald Mustaches :" + bald.getMustaches());
        System.out.println("Bald Ears :" + bald.getEars());
        System.out.println("Bald Claws :" + bald.getClaws());
        System.out.println("Bald Tails :" + bald.getTails());
        System.out.println("Pers Mustaches :" + pers.getMustaches());
        System.out.println("Pers Ears :" + pers.getEars());
        System.out.println("Pers Claws :" + pers.getClaws());
        System.out.println("Pers Tails :" + pers.getTails());
        System.out.println("Siam Mustaches :" + siam.getMustaches());
        System.out.println("Siam Ears :" + siam.getEars());
        System.out.println("Siam Claws :" + siam.getClaws());
        System.out.println("Siam Tails :" + siam.getTails());
        System.out.println(mainecoon.MaxNumberOfMustachesOnTheRightSideOfTheFace);
        System.out.println(mainecoon.MaxLengthOfTheJumpForTheRat);
        System.out.println(mainecoon.MaxTimeOfEatingTheMouse);
        System.out.println(mainecoon.MaxHighInTheStandingPosition);
        System.out.println(bald.MaxNumberOfMustachesOnTheRightSideOfTheFace);
        System.out.println(bald.MaxLengthOfTheJumpForTheRat);
        System.out.println(bald.MaxTimeOfEatingTheMouse);
        System.out.println(bald.MaxHighInTheStandingPosition);
        System.out.println(pers.MaxNumberOfMustachesOnTheRightSideOfTheFace);
        System.out.println(pers.MaxLengthOfTheJumpForTheRat);
        System.out.println(pers.MaxTimeOfTheEatingTheMouse);
        System.out.println(pers.MaxHighInTheStandingPosition);
        System.out.println(siam.MaxNumberOfMustachesOnTheRightSideOfTheFace);
        System.out.println(siam.MaxLengthOfTheJumpForTheRat);
        System.out.println(siam.MaxTimeOfTheEatingMouse);
        System.out.println(siam.MaxHighInTheStandingPosition);


    }
}