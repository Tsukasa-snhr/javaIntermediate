class Lesson06_06 {
    public static void main(String[] args) {
        String var_01 = "ABC";
        String var_02 = "DEF";
        int num_01 = 1;
        int num_02 = 2;

        System.out.println(var_01 + var_02);
        System.out.println(var_01 + num_01);
        
        System.out.println(num_01 + num_02 + var_01);
        System.out.println(var_01 + num_01 + num_02);

        System.out.println(var_01 + (num_01 + num_02));


    }
    }