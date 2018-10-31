public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");
  public String itcode; //maybe public

  ItemType(String itcode) {

    this.itcode = itcode;
  }

}