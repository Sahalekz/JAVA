
interface Playable {
    void play();
}


class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}


class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball");
    }
}


class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

public class SportsApp {
    public static void main(String[] args) {
        // Create instances of each sport and call their play method
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}

