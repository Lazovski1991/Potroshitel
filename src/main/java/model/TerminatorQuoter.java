package model;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandom(min = 2, max = 9)
    private int random;

    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase_1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase_2");
        System.out.println(random);
    }

    @Override
    public void sayQuoter() {
        for (int i = 0; i < random; i++) {
            System.out.println(message);
        }
    }
}
