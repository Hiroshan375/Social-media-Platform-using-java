public class ImagePost extends AbsttactPost
{
    private String imagepath;
 
    public ImagePost(User user,String content,String imagepath)
    {
        super(user,content);
        this.imagepath=imagepath;
    }
    public String getImagePath()
    {
        return this.imagepath;
    }

    public String toString()
    {
        return("Image Path = "+this.imagepath);
    }
}