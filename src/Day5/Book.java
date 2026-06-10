package Day5;


public class Book {

    // Static fields
    private static int totalBooks = 0;

    //Private fields
    private final String isbn;
    private double price;

    //Protected fields
    protected String title;
    protected String author;
    protected int copiesAvailable;

    //Constructor

    public Book(String isbn, String title, String author, double price, int copiesAvailable) {
        if (isbn == null || isbn.trim().isEmpty())
            throw new IllegalArgumentException("ISBN cannot be null or empty.");
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cannot be null or empty.");
        if (author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author cannot be null or empty.");
        if (price <= 0)
            throw new IllegalArgumentException("Price must be greater than 0. Provided: " + price);
        if (copiesAvailable < 0)
            throw new IllegalArgumentException("Copies available cannot be negative. Provided: " + copiesAvailable);

        this.isbn            = isbn.trim();
        this.title           = title.trim();
        this.author          = author.trim();
        this.price           = price;
        this.copiesAvailable = copiesAvailable;

        totalBooks++;
    }

    // Static method


    public static int getTotalBooks() {
        return totalBooks;
    }

    //Getters

    public String getIsbn()             { return isbn; }
    public String getTitle()            { return title; }
    public String getAuthor()           { return author; }
    public double getPrice()            { return price; }
    public int    getCopiesAvailable()  { return copiesAvailable; }

    //Setters

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cannot be null or empty.");
        this.title = title.trim();
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author cannot be null or empty.");
        this.author = author.trim();
    }

    public void setPrice(double price) {
        if (price <= 0)
            throw new IllegalArgumentException("Price must be greater than 0.");
        this.price = price;
    }

    public void setCopiesAvailable(int copies) {
        if (copies < 0)
            throw new IllegalArgumentException("Copies cannot be negative.");
        this.copiesAvailable = copies;
    }

    //toString

    @Override
    public String toString() {
        return String.format(
                "Book{isbn='%s', title='%s', author='%s', price=₹%.2f, copies=%d}",
                isbn, title, author, price, copiesAvailable);
    }

    //Helper: validate copies before lending

    private void validateCopies(int requested) {
        if (copiesAvailable == 0) {
            throw new IllegalStateException(
                    "\"" + title + "\" has no copies available for lending.");
        }
        if (requested > copiesAvailable) {
            throw new IllegalStateException(
                    "Not enough copies for \"" + title + "\". " +
                    "Requested: " + requested + ", Available: " + copiesAvailable);
        }
    }

    //Overloaded lend() methods

    public void lend() {
        validateCopies(1);
        copiesAvailable--;
        System.out.println("[LEND] 1 copy of \"" + title + "\" lent. Copies remaining: " + copiesAvailable);
    }

    public void lend(int copies) {
        if (copies < 1)
            throw new IllegalArgumentException("Number of copies to lend must be at least 1.");
        validateCopies(copies);
        copiesAvailable -= copies;
        System.out.println("[LEND] " + copies + " copy/copies of \"" + title +
                           "\" lent. Copies remaining: " + copiesAvailable);
    }

    public void lend(String borrowerName) {
        if (borrowerName == null || borrowerName.trim().isEmpty())
            throw new IllegalArgumentException("Borrower name cannot be null or empty.");
        validateCopies(1);
        copiesAvailable--;
        System.out.println("[LEND] 1 copy of \"" + title + "\" lent to " +
                           borrowerName.trim() + ". Copies remaining: " + copiesAvailable);
    }

    public void lend(String borrowerName, int copies) {
        if (borrowerName == null || borrowerName.trim().isEmpty())
            throw new IllegalArgumentException("Borrower name cannot be null or empty.");
        if (copies < 1)
            throw new IllegalArgumentException("Number of copies to lend must be at least 1.");
        validateCopies(copies);
        copiesAvailable -= copies;
        System.out.println("[LEND] " + copies + " copy/copies of \"" + title +
                           "\" lent to " + borrowerName.trim() +
                           ". Copies remaining: " + copiesAvailable);
    }
}
