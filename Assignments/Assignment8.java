class Sport {
    void play() {
        System.out.println("We are Playing Sports.");
    }
}

class Football extends Sport {
    void play() {
        System.out.println("We are playing Football.");
    }
}

class Basketball extends Sport {
    void play() {
        System.out.println("We are playing Basketball.");
    }
}

class Rugby extends Sport {
    void play() {
        System.out.println("We are playing Rugby.");
    }
}

public class Assignment8 {
    public static void main(String[] args) {
        Football f = new Football();
        Basketball b = new Basketball();
        Rugby r = new Rugby();

        f.play();
        b.play();
        r.play();
    }
}