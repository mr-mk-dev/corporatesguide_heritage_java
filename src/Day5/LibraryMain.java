package Day5;

public class LibraryMain {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println("       LIBRARY BOOK MANAGEMENT – TEST RUN             ");
        System.out.println("=======================================================\n");

        //Register Books

        Book b1 = new Book("978-0-13-468599-1", "Clean Code",
                           "Robert C. Martin", 799.00, 5);

        Book b2 = new Book("978-0-20-163361-5", "The Pragmatic Programmer",
                           "Andrew Hunt & David Thomas", 899.00, 3);

        Book b3 = new Book("978-0-59-651798-1", "Head First Java",
                           "Kathy Sierra & Bert Bates", 649.00, 2);

        Book b4 = new Book("978-0-13-110362-7", "The C Programming Language",
                           "Brian W. Kernighan & Dennis Ritchie", 549.00, 1);

        System.out.println("── Books Registered ────────────────────────────────────");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        //Static total count

        System.out.println("\n── Total Books Registered ──────────────────────────────");
        System.out.println("Book.getTotalBooks() → " + Book.getTotalBooks());

        //Lend Variant 1 – lend() : one copy, anonymous

        System.out.println("\n── Variant 1 : lend() – 1 copy, anonymous ──────────────");
        b1.lend();

        //Lend Variant 2 – lend(int copies)

        System.out.println("\n── Variant 2 : lend(int copies) – multiple, anonymous ──");
        b1.lend(2);   // b1 had 5, now 4 after V1, lending 2 more → 2 remaining

        //Lend Variant 3 – lend(String borrowerName)

        System.out.println("\n── Variant 3 : lend(String borrowerName) – 1 named ─────");
        b2.lend("Aarav Sharma");

        //Lend Variant 4 – lend(String borrowerName, int copies)

        System.out.println("\n── Variant 4 : lend(borrowerName, copies) – multi named ─");
        b3.lend("Priya Mehta", 2);   // b3 has exactly 2 → 0 after this

        //Validation Tests

        System.out.println("\n── Validation Tests ────────────────────────────────────");

        //No copies left
        try {
            b3.lend();   // b3 now has 0 copies
        } catch (IllegalStateException e) {
            System.out.println("[OK] No copies left       : " + e.getMessage());
        }

        //Request more than available
        try {
            b4.lend(5);  // b4 has only 1 copy
        } catch (IllegalStateException e) {
            System.out.println("[OK] Too many requested   : " + e.getMessage());
        }

        //Invalid copies argument (0)
        try {
            b2.lend(0);
        } catch (IllegalArgumentException e) {
            System.out.println("[OK] Invalid copies arg   : " + e.getMessage());
        }

        //Null borrower name
        try {
            b1.lend(null);
        } catch (IllegalArgumentException e) {
            System.out.println("[OK] Null borrower name   : " + e.getMessage());
        }

        //Empty borrower name
        try {
            b1.lend("   ", 2);
        } catch (IllegalArgumentException e) {
            System.out.println("[OK] Empty borrower name  : " + e.getMessage());
        }

        //Final state of all books

        System.out.println("\n── Final Book States ───────────────────────────────────");
        for (Book b : new Book[]{b1, b2, b3, b4}) {
            System.out.println(b);
        }

        System.out.println("\n=======================================================");
        System.out.println("                    TEST COMPLETE                     ");
        System.out.println("=======================================================");
    }
}
