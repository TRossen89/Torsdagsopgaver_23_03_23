package Task1;

public class Flow_in_program {



    // first letter of words
    public void method_A (int word_index) {

        if (word_index == 1) {

            System.out.println("J");

        } else if (word_index == 2) {

            System.out.println("e");

        } else {
            System.out.println("s");

        }

    }

    // letters inside words
    public void method_B(int word_index) {
        if (word_index == 1) {

            method_C();
            System.out.println("v");

        } else {

            System.out.println("j");
            method_D();
            System.out.println("v");

        }
    }

    // letter a
    public void method_C(){

        System.out.println("a");

    }

    //letter o
    public void method_D(){
            System.out.println("o");
        }


    // last letter of words
    public void method_E(int word_index){

        if(word_index== 1) {
            System.out.println("a");
            method_F();

        } else if (word_index==2) {


        System.out.println("r");
        method_F();

    }
        else {
            System.out.println("t");
            method_F();
        }
    }

    public void method_F(){

        System.out.println(" ");

    }
}
