package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

import intern.schu.patterns.Bekleidnug.Helm;

public class Kleidermodifikatortest {

    
    @Test
    public void testRandomClothValues() {
        List<Helm> defenseList = new ArrayList();
        IntStream
            .range(0, 100)
            .mapToObj(e -> new Helm())
            .forEach(defenseList::add);
        assert(defenseList
                .stream()
                .map(Helm::getLeben)
                .distinct()
                .limit(2)
                .count() <= 1
                );
    }
}
