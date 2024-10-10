package 연습_상속인터페이스;

public class WizardTest {
    public static void main(String[] args) {
        GreatWizard gandalf = new GreatWizard("간달프", 100, 100, 100);
        System.out.println(gandalf.toString());
        gandalf.energeVolt();

    }
}

class Novice{
    protected  String name;
    protected  int hp;

    public Novice(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("[Novice] %s(HP: %d)", name, hp);
    }
}

class Wizard extends Novice{
    protected int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = hp;
    }
    public void energeVolt(){
        System.out.printf("%s의 에너지볼트!\n", this.name);
    }
}

class GreatWizard extends Wizard{
    protected int shield;

    public GreatWizard(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }

    @Override
    public String toString() {
        return String.format
                ("[대마법사] %s(HP: %d, MP:%d, SHIELD: %d)", name, hp, mp, shield);
    }
}