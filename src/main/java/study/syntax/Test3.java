package study.syntax;

public enum Test3 {
    SPRING1(2, 1) {
        @Override
        public void haha2() {

        }

        @Override
        public void haha3() {

        }
    },
    SUMMER2(4, 2) {
        @Override
        public void haha2() {

        }

        @Override
        public void haha3() {

        }
    },
    AUTUMN3(6, 3) {
        @Override
        public void haha2() {

        }

        @Override
        public void haha3() {

        }
    },
    WINTER4(6, 3) {
        @Override
        public void haha2() {

        }

        @Override
        public void haha3() {

        }
    };

    private final double factor1;

    private final double factor2;


    Test3(double factor1, double factor2) {
        this.factor1 = factor1;
        this.factor2 = factor2;
    }

    public double getFactor1() {
        return factor1;
    }

    public double getFactor2() {
        return factor2;
    }

    public abstract void haha2();
    public abstract void haha3();
}
