public class UnderstandingMethods {


    /**
     * So we looked at what methods do . Its time to see how they are actually made.
     *
     *
     * Lets look at a standard method signature.
     * What is a method signature.
     *
     *  A method signature is the arrangement that goes into a method which tells the JVM it is a method.
     *
     *
     *  The Signatue goes as follows.
     *
     *      ACM : Access Control Modifier (public/private/protected/default)
     *
     *      Public : Acessible Across the Projec, that means any class who has the object of another class can accees its public memebers.
     *
     *      Private: Accessible in the class only. That means no Class who has the object can access this member (varibale/method).
     *
     *      Default: This menas all the classes in the same package can access member with an object.
     *
     *      Protected: This means the member has a defualt acess in the package + Any of it child classes from another packages can access it too.
     *
     *
     *      ------ Lets look at what is return statement. Every method does something and returns something. Like in an addition method it adds two numbers and returns the sum of
     *      two numbers. But we can have methods that compute something but return nothing. The ones that return nothing are called void returns.
     *
     *      Method name : This is a name for the method given by the creator.
     *
     *      Signature goes as follows
     *
     *      ACM    ReturnType   MethodName (parameter area) {
     *          method body.
     *          return statement;
     *      }
     *
     *
     *      public int adition (int a, int b ){
     *          int c = a+b;
     *          return c; -- this is a return statement. We mentioned in the method signature that it will return an int.
     *      }
     *
     *      Parameter AREA:  Sometimes method need to take some information to build on from that. This info that gets pased to the method comes in the Paramter Area.
     *      So when creating a method in the paramter area we need to tell what type of information will this method take.
     *
     *      eg:
     *
     *      public int addition( int a, int b ){ So here we have mentioned what parameters to expect, which is of type int.
     *
     *      }
     *
     *
     */
}
