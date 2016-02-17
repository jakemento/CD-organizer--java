import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {
  @Test
  public void CD_instantiatesCorrectly_true() {
    CD myCD = new CD("Slim Shady LP");
    assertEquals(true, myCD instanceof CD);
  }

  @Test
  public void CD_returnsName() {
    CD myCD = new CD ("Slim Shady LP");
    assertEquals("Slim Shady LP", myCD.getName());
  }

  @Test
  public void CD_returnsArtist() {
    CD myCD = new CD ("Slim Shady LP");
    assertEquals(null, myCD.getArtist());
  }
  @Test
  public void CD_setsArtist() {
    CD myCD = new CD ("Slim Shady LP");
    myCD.setArtist("Eminem");
    assertEquals("Eminem", myCD.getArtist());
  }
  @Test
  public void all_returnsAllInstancesOfCD_true() {
    CD firstCD = new CD("Slim Shady LP");
    CD secondCD = new CD("Marshall Mathers LP");
    assertTrue(CD.all().contains(firstCD));
    assertTrue(CD.all().contains(secondCD));
}

}
