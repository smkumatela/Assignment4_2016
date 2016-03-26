package za.ac.mkums.cput.domain.inheritenceAlternative;

/**
 * Created by Songezo on 2016-03-26.
 */
public class Pasta_A {

    private Food_A foodA = new Food_A();

    public String eat(){
        return foodA.eat();
    }
}
