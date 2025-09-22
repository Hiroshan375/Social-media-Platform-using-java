public class AbsttactPost 
{
    private User user;
    private String content;
    private int like;
    private Comment[] comments=new Comment[10];

    public AbsttactPost(User user,String content)
    {
        this.user =user ;
        this.content=content;
        like=0;
    }
    public void addComment(Comment comment)
    {
        for (int i =0 ;i<comments.length;i++)
        {
            
                this.comments[i]=comment;
               
            
        }
    }

    public void likePost()
    {
        like++;
        System.out.println(like);
    }

   

}