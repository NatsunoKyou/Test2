package pre.xyl.pojo;

public class Student {
    private Integer id;
    private String stuName;
    private Card card;
    public Student() {
    }

    public Student(Integer id, String stuName, Card card) {
        this.id = id;
        this.stuName = stuName;
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", card=" + card +
                '}';
    }
}
