package inheritanceque1;
/* Write a Java program to create a class called codebuster with a method called
   groupName(). Create a subclass called codebusterGroups() that overrides the
   groupName() method.*/

public class CodeBusterGroups extends CodeBuster {
    public void GroupName(){
        System.out.println("Strawberry");
    }

    public static void main(String[] args) {
        CodeBusterGroups C = new CodeBusterGroups();
        C.GroupName();
    }
}


