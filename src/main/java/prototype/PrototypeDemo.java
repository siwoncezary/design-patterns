package prototype;

import builder.EmailMessage;
class Parent{
    String name;
}

class Child{
    String name;
    Parent parent;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Child child = new Child();
        child.name = this.name;
        child.parent = this.parent;
        return child;
    }
}

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmailMessage message = EmailMessage.builder().emailAddress("aaa").subject("fdsf").build();
        EmailMessage newMessage = (EmailMessage) message.clone();
        System.out.println(newMessage);
        System.out.println(message);
        System.out.println(newMessage == message);

        //Parent and Child
        Parent parent = new Parent();
        parent.name = "ADAM";
        Child child = new Child();
        child.name = "Karol";
        child.parent = parent;
        //Tutaj klonowanie powinno spowodować utworznie nowego dziecka z tym samym rodzicem
        Child sister = (Child) child.clone();
        System.out.println(sister.parent == child.parent);

    }
}
