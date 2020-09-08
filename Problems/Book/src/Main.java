// write your class here
class Book{
    String title;
    int yearOfPublishing;
    String[] authors = new String[0];

    public Book(String title, int yearOfPublishing, String[] authors){
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }
}