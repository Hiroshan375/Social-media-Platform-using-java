# Social Media Application

A simple Java social media app with posts, comments, and users.

## Files
- `User.java` - User profiles
- `AbsttactPost.java` - Base class for posts  
- `TextPost.java` - Text posts
- `ImagePost.java` - Image posts
- `VideoPost.java` - Video posts
- `Comment.java` - Comments with replies
- `testUser.java` - Test/demo code

## Features
- Create users with username, email, full name
- Make text, image, or video posts
- Like posts
- Add comments to posts
- Reply to comments

## How to Run
1. Compile: `javac *.java`
2. Run: `java testUser`

## Example Output
```
User Name: Hiru123
Full name:Hiroshan
E-mail:Hiru017@gmail.com

User Name: Shanu456
Full name:Shayani
E-mail:Shanu24@gmail.com

Text = Rush
1
```

## Known Bugs
- Comment adding doesn't work properly (overwrites all positions)
- Class name typo: "AbsttactPost" should be "AbstractPost"
