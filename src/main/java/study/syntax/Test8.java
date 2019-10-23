package study.syntax;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class Test8 {

    public static void main(String[] args) {
        Velocity.init();
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("test","testValue");
        Template template = null;
        Velocity.getTemplate("testTemplate.vm");


    }
}
