package Spring5.entity;

public class Book {
    private String id;
    private String name;
    private String uataus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUataus() {
        return uataus;
    }

    public void setUataus(String uataus) {
        this.uataus = uataus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", uataus='" + uataus + '\'' +
                '}';
    }
}
