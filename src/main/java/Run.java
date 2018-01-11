import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import java.util.List;

/**
 * Created by rohanp on 11/1/18.
 */



public class Run {

    public static void main(String args[]) {
      //  ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);

        MongoOperations mongoOperations = (MongoOperations) ctx.getBean("MongoTemplate");

        User u = new User("rohan", "hello");

        mongoOperations.save(u);

        System.out.println(u);


        Query searchUserQuery = new Query(Criteria.where("Name").is("rohan"));



        List<User> listUser = mongoOperations.findAll(User.class);
        System.out.print(listUser.size());


    }

    }

