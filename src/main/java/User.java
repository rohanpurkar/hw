import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rohanp on 11/1/18.
 */

@Document(collection = "users")
public class User {

@Id
    private String id;

    public String name;

    public String use;

    public User(String name, String use) {
        this.name = name;
        this.use = use;
    }

    public String getName() {
        return name;
    }

    public String getUse() {
        return use;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", use='" + use + '\'' +
                '}';
    }
}
