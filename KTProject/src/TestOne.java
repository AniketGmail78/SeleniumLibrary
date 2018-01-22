


public class TestOne {



    int a = 10 ;
    int b = 20 ;

    int c = a+b;



    public void showThis(){
        System.out.println(c);
    }



    public void getMeMemberName(){
        System.out.println(" Memebr name is Manjit and Andrew ");
    }


    public void computeThis(){
        int num1 = 3 ;
        int num2 = 2 ;
        System.out.println("The sum of two numbers is "+(num1+num2));
    }

    void computeThis1(){

    }

    public int addSomeNumbers (int a , int b ){
        int result = a+b;
        System.out.println(result);
        return result;
    }


    // Access Control Modifiers

    /**
     *
     * Public , Private , Protected , Default
     */




    //------------------




    public static void main(String[] args) {


        System.out.println("Hello World ");


        TestOne superman = new TestOne();
            superman.showThis();
            superman.getMeMemberName();
            superman.computeThis();

            TestTwo batman = new TestTwo();
        System.out.println(batman.a);


        Child1 c1 = new Child1();
        System.out.println(c1.parentVaribaleA);
        System.out.println(c1.messaage);
        System.out.println(c1.grandPrarentNumber);
        superman.addSomeNumbers(23,34);
        superman.addSomeNumbers(12,2333);

        c1.GPMethod();



    }



    // METHODS

    // VARIBALES



}
