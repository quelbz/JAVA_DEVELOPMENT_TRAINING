public class day_3_Assignment {
    public static void main(String[] args) {

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(firstTerm + ", ");

            // //
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}
