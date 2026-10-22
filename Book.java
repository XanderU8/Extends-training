public class Book {
private String title_type;
private String author_type;
private int pages;


    public String getAuthor_type() {
        return author_type;
    }

    public void setAuthor_type(String author_type) {
        this.author_type = author_type;
    }

    public Book(){ // deafault constructor!!!
        this.title_type = "Unknown";
        this.author_type = "Unknown";
        this.pages = 0;
    }

    public Book (String title_type1, String author_type, int pages){
        title_type = title_type1;
        this.author_type = author_type;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }



    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle_type() {
        return title_type;
    }

    public void setTitle_type(String title_type) {
        this.title_type = title_type;
    }

    public void schowInfo(){
        System.out.println("That´s title´s book: " + title_type);
        System.out.println("That´s author type: " + author_type);
        System.out.println("Tht´s pages amount: " + pages);

    }
}