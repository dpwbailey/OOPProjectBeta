public class AudioPlayer extends Product implements MultimediaControl {

  //fields
  private String audioSpecifications;
  private ItemType mediaType;

  @Override
  public String toString() {
    return super.toString() +
        "Audio Specifications: " + audioSpecifications + '\n' +
        "Media Type: " + mediaType;

  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Going to previous");
  }

  @Override
  public void next() {
    System.out.println("Going to next");
  }

  public AudioPlayer(String name, String audioSpecifications) {
    super();
    this.mediaType = ItemType.AUDIO;
  }

  public static void main(String[] args) {
    AudioPlayer ap1 = new AudioPlayer("Player One", "generic audio specifications");
    System.out.println(ap1);
  }

  @Override
  public int compareTo(Item o) {
    return 0;
  }
}
