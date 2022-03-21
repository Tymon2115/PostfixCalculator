package Calculator.Data;

public enum Operation {
    PLUS {
        public int calculate(int a, int b) {
            return a + b;
        }
    },

    MINUS {
        public int calculate(int a, int b) {
            return a - b;
        }
    },

    TIMES {
        public int calculate(int a, int b) {
            return a * b;
        }
    },

    DIVIDE {
        public int calculate (int a, int b){
            return a/b;
        }

    };

    public abstract int calculate(int a, int b);


}
