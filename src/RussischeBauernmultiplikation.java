import java.util.HashMap;
import java.util.Map;

public class RussischeBauernmultiplikation {

  public int multiplikation(int erstesProdukt, int zweitesProdukt){
    Map<Integer, Integer> addition = new HashMap<>();

    while (erstesProdukt != 0){
      if(erstesProdukt % 2 != 0) {
        addition.put(erstesProdukt, zweitesProdukt);
      }
      erstesProdukt /= 2;
      zweitesProdukt *= 2;
    }

    return getSumme(addition);
  }

  private int getSumme(Map<Integer, Integer> addition) {
    int count = 0;
    for (int number : addition.values()){
      count += number;
    }
    return count;
  }
}
