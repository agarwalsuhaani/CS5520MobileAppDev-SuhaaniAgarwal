package edu.northeastern.numad22fa_suhaaniagarwal;

public class Link {
    private String name;
    private String link;
    private int id;

    public Link(int id, String name, String link) {
        this.name = name;
        this.link = link;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
