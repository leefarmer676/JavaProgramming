package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public String getBookTitle() {
        if(bookTitle==null){
            return "";
        }
        return bookTitle;
    }

    public EncapsulationReview(String bookTitle, String publishDate) {
        this.bookTitle = bookTitle;
        this.publishDate = publishDate;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle==null||bookTitle.isEmpty()){
            throw new RuntimeException("invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
