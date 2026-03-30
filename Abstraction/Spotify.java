abstract class AudioContent {
protected String title;
protected int duration; // in minutes
static String platformName = "TuneStream";
AudioContent(String title, int duration) {
this.title = title;
this.duration = duration;
}
abstract void play();
void showDetails() {
System.out.println("Title: " + title);
System.out.println("Duration: " + duration + " mins");
System.out.println("Platform: " + platformName);
}
final void buffering() {
System.out.println("Buffering audio... Please wait ⏳");
}
}
class Podcast extends AudioContent {
private String host;
Podcast(String title, int duration, String host) {
super(title, duration);
this.host = host;
}
void play() {
System.out.println("Playing podcast: " + title + " hosted by " + host);
}
void skipIntro() {
System.out.println("Skipping intro...");
}
}
public class Spotify {
public static void main(String[] args) {
Podcast p = new Podcast("Tech Talks", 45, "Mohit");
p.showDetails();
p.buffering();  
p.play();       
p.skipIntro();   
}
}