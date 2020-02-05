package study.syntax;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;

import java.util.HashSet;
import java.util.Set;

public class Test8 {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new Integer(1));
        set.add(new Integer(2));
        set.add(new Integer(3));
        set.add(new Integer(4));

    }
}
