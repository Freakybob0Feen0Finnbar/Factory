import org.w3c.dom.ls.LSOutput;

public class Factory {
    //made variable of type string
    String nameOfFactory;
    int yearFounded;
    //made variable of type int aka whole numbers
    boolean inUse;
    //made a var of type boolean aka t/f
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Factory();
    }

    public Factory() {
        nameOfFactory = "Pumpkin Factory";
        yearFounded = 1968;
        inUse = false;
        System.out.println(nameOfFactory + " was founded in the year " + yearFounded);
        Pumpkin spookly = new Pumpkin("circular", "orange", 100, false);
        System.out.println(spookly.color);
        System.out.println(spookly.shape);
        spookly.shape = "circle";
        spookly.color = "pink";
        System.out.println(spookly.size + 2);
        spookly.size = 17;
        System.out.println();
        System.out.println("changed size " + spookly.size);
        System.out.println("spookly info");
        spookly.printInfo();

        System.out.println();
        System.out.println("Ian's info");
        Pumpkin Ian = new Pumpkin("square", "pink", 2, true);
        Ian.printInfo();

        Pumpkin Ghost = new Pumpkin("Lumpy", "black", 67, false);
        Ghost.printInfo();

        Pumpkin casper = new Pumpkin("Smooth as hell", "brown", 34, true);
        casper.printInfo();

        Pumpkin Evil = new Pumpkin();
        Evil.printInfo();
        System.out.println("factory aquired by cookie company.");
        System.out.println("Now our facotry makes cookies and pumpkin");
        nameOfFactory = "P.C. Factory";
        System.out.println(nameOfFactory);
    }





    }
    //use isHalloween in an if statement
        //if true then print I will be used for halloween!!
        //if false then print i'm just a regular pumpkin
