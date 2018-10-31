public class Main {

  public static void main(String[] args) {
/*
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.itcode);
      */

    AudioPlayer mediaPlayer1 = new AudioPlayer("media player 1", "generic specifications");
  //MoviePlayer mediaPlayer2 = new MoviePlayer();
    System.out.println(mediaPlayer1.toString());

    mediaPlayer1.previous();
    mediaPlayer1.next();
    mediaPlayer1.stop();
    mediaPlayer1.play();
    }

  }





