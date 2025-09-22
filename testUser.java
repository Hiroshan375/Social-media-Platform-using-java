public class testUser
{
    public static void main(String args[])
    {
        String getusers[]={"teachers,children"};

        User u1=new User("Hiru123","Hiru017@gmail.com","Hiroshan",getusers);
        User u2=new User("Shanu456","Shanu24@gmail.com","Shayani",getusers);

        TextPost tp1= new TextPost(u1,"Welcome","Rush");
        System.out.println(u1.toString());
        System.out.println('\n');
        System.out.println(u2.toString());
        System.out.println('\n');
        System.out.println(tp1.toString());
        tp1.likePost();


    }
}