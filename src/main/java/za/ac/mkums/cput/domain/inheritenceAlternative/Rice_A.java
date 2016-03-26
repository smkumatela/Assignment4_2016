package za.ac.mkums.cput.domain.inheritenceAlternative;

/**
 * Created by Songezo on 2016-03-26.
 */
public class Rice_A {

    private Food_A foodB = new Food_A();

    public String eat(){
        return foodB.eat();
    }
}
