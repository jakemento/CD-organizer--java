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
    assertEquals("unnamed", myCD.getArtist());
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
  @Test
  public void newId_CdSInstantiateWithAnID_true() {
  CD myCD = new CD("Slim Shady LP");
  assertEquals(CD.all().size(), myCD.getId());
  }

  @Test
  public void find_returnsNullWhenNoCDFound_null() {
    assertTrue(CD.find(999) == null);
  }

    @Test
    public void clear_emptiesAllCDsFromArrayList() {
      CD myCD = new CD("Mow the lawn");
      CD.clear();
      assertEquals(CD.all().size(), 0);
  }
}
