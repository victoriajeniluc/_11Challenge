/**
 * Question 2 - Solution:
 *
 * @author Udayan Khattry
 */

package question2;

class A {
    public int n1;
    public int n2;

    public A(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /*
     * Provide some code so that "Loaded A class template..."
     * is printed as the first line in the output.
     */
    //static initialization block is executed only once, when class template is loaded in the memory.
    /*
     * TODO: provide some code so that "Loaded A class template..."
     * is printed as the first line in the output.
     */
    static {
        System.out.println("Loaded A class template...");
    }

    public void printDetails() {
        System.out.println("(" + n1 + ", " + n2 + ")");
    }
}
public class TestA {
    public static void main(String[] args) {
        A a1 = new A(0, 0);
        A a2 = new A(1, 1);
        A a3 = new A(2, 2);

        // TODO: Print 1st object's detail.
        // TODO: Print 2nd object's detail.
        // TODO: Print 3rd object's detail.

        a1.printDetails();
        a2.printDetails();
        a3.printDetails();

     /*   OR

        //Print 1st object's detail.
        System.out.println("(" + a1.n1 + ", " + a1.n2 + ")");

        //Print 2nd object's detail.
        System.out.println("(" + a2.n1 + ", " + a2.n2 + ")");

        //Print 3rd object's detail.
        System.out.println("(" + a3.n1 + ", " + a3.n2 + ")");*/

    }
}

