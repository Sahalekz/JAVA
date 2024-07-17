import java.util.ArrayList;

// Book class
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

// Library class
public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void displayBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library("MyLibrary");

        // Adding some books
        library.addBook(new Book("Java Programming", "John Doe"));
        library.addBook(new Book("Python Basics", "Jane Smith"));
        library.addBook(new Book("JavaScript Essentials", "John Doe"));

        // Displaying all books
        library.displayBooks();

        // Searching by title
        String titleToSearch = "Java Programming";
        ArrayList<Book> foundByTitle = library.searchByTitle(titleToSearch);
        System.out.println("\nBooks with title '" + titleToSearch + "':");
        if (!foundByTitle.isEmpty()) {
            for (Book book : foundByTitle) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books found with title '" + titleToSearch + "'.");
        }

        // Searching by author
        String authorToSearch = "John Doe";
        ArrayList<Book> foundByAuthor = library.searchByAuthor(authorToSearch);
        System.out.println("\nBooks by author '" + authorToSearch + "':");
        if (!foundByAuthor.isEmpty()) {
            for (Book book : foundByAuthor) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books found by author '" + authorToSearch + "'.");
        }
    }
}
