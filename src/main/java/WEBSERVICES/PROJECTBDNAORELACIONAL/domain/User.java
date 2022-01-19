package WEBSERVICES.PROJECTBDNAORELACIONAL.domain;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private static  final long serialVersionUID = 1L;

    private String Id;
    private String name;
    private String email;

    public User() {
    }

    public User(String id, String name, String email) {
        Id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Id, user.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

}
