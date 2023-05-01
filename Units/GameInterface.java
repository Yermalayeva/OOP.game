package Units;

import java.util.ArrayList;

public interface GameInterface {
    //void step();
    void step(ArrayList<Unit> enemy);

    String getInfo();
    String introduce();
}
