public class TextPost extends AbsttactPost
{
    private String text;
 
    public TextPost(User user,String content,String text)
    {
        super(user,content);
        this.text=text;
    }
    public String getText()
    {
        return this.text;
    }
    
    public String toString()
    {
        return("Text = "+this.text);
    }
}
