class LibraryItem
{
    private int id;
    private String title;
    private int year;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
}
class Book extends LibraryItem
{
    String author;
    public void bookDisplay(int id,String title,int year,String author)
    {
        System.out.println("ID:"+id);
        System.out.println("Title:"+title);
        System.out.println("Year:"+year);
        System.out.println("Author:"+author);
    }
}
class Magazine extends LibraryItem
{
    int issue;
    public void magazineDisplay(int id,String title,int year,int issue)
    {
        System.out.println("ID:"+id);
        System.out.println("Title:"+title);
        System.out.println("Year:"+year);
        System.out.println("Issue:"+issue);
    }
}
public class Inheritance
{
    public static void main(String[] args) {
        Magazine magazine=new Magazine();
        Book book=new Book();
        book.bookDisplay(1,"Forestry",2000,"Bosch");
        magazine.setId(2);
        magazine.setTitle("Agriculture");
        magazine.setYear(2001);
        magazine.issue=2000;
        int id= magazine.getId();
        String title= magazine.getTitle();
        int year= magazine.getYear();
        magazine.magazineDisplay(id,title,year, magazine.issue);
    }
}
