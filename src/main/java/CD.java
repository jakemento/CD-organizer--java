import java.time.LocalDateTime;
import java.util.ArrayList;

public class CD {
  private static ArrayList<CD> instances = new ArrayList<CD>();

  private String mcdName;
  private String mcdArtist = "unnamed";
  private int mId;

  public CD(String cdName) {
    mcdName = cdName;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mcdName;
  }

  public String getArtist() {
    return mcdArtist;
  }

  public void setArtist(String newArtist) {
    mcdArtist = newArtist;
  }

  public int getId() {
  return mId;
  }

  public static ArrayList<CD>  all() {
    return instances;
  }

  public static CD find(int id) {
  try {
   return instances.get(id - 1);
   } catch (IndexOutOfBoundsException e) {
   return null;
  }
}
 public static void clear() {
   instances.clear();
  }
}
