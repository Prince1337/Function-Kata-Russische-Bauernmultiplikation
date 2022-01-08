import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RussischeBauernmultiplikationTest {

  RussischeBauernmultiplikation russischeBauernmultiplikation;

  @Test
  void mul47And42(){
    russischeBauernmultiplikation = new RussischeBauernmultiplikation();

    int actual = russischeBauernmultiplikation.multiplikation(47, 42);

    assertEquals(1974, actual);
  }

  @Test
  void mul47And0(){
    russischeBauernmultiplikation = new RussischeBauernmultiplikation();

    int actual = russischeBauernmultiplikation.multiplikation(47, 0);

    assertEquals(0, actual);
  }

  @Test
  void mul12And12(){
    russischeBauernmultiplikation = new RussischeBauernmultiplikation();

    int actual = russischeBauernmultiplikation.multiplikation(12, 12);

    assertEquals(144, actual);
  }

}