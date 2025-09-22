public class VideoPost extends AbsttactPost
{
    private String videopath;
 
    public VideoPost(User user,String content,String videopath)
    {
        super(user,content);
        this.videopath=videopath;
    }
    public String getVideoPath()
    {
        return this.videopath;
    }
    
    public String toString()
    {
        return("Video Path = "+this.videopath);
    }
}