public class Pumpkin {
    //variables big, color, shape, halloween pumpkin
    int size = 30;
    String color = "orange";
    String shape = "sqaure";
    boolean isHalloween = true;

    public  Pumpkin(String pshape, String pColor, int pSize, boolean pisHawlloween){
        System.out.println("making a pumpkin");
        size = 30;
        color = pColor;
        shape = pshape;
        isHalloween = true;
    }


    public Pumpkin(){

    }


    public void printInfo(){
        System.out.println(color);
        System.out.println(shape);
        System.out.println(size +2);
        System.out.println("changed size " + size);
        if(isHalloween==true){
            System.out.println("I will be used for halloween!");
        }

            if(isHalloween==false){
                System.out.println("I am a regular pumpkin!");
            }


    }

}


