public class Comment
{
    private User user;
    private String content;
    private Comment [] replys=new Comment[10];

    public Comment(User user,String content)
    {
        this.user=user;
        this.content=content;
    }
    public void addReply(Comment reply)
    {
        for (int i =0 ;i<replys.length;i++)
        {
            this.replys[i]=reply;
        }
    
    }
}