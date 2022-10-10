public class Book {

    // Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // whether the book is checked out
    int dayCheckedOut = -1;

    // Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }

    // Getters --> INSTANCE METHODS
    public String getTitle() {
        return this.getTitle();
    }

    public int getPageCount() {
        return this.getPageCount();
    }

    public int getISBN() {
        return this.getISBN();
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    // Setters
    public void setIsCheckeOut(boolean newIsCheckedOut, int currentDayChekedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayChekedOut);
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }

}
