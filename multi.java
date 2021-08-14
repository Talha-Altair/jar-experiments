class One {
    public static void main(String args[]) {
        System.out.println("Hello bro");
        
    }

    public void something(int a){


        System.out.println("Hello bro again");
        System.out.println(a*10);
    }
}

class Two {
    public static void main(String args[]) {

        System.out.println("altair");
        One one = new One();

        one.something(9);

    }
}
