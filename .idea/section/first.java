
class first {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
//! primitive data types

        boolean hasChildren = true;
        char x = 'M';
        System.out.println(x);
        System.out.println(hasChildren);


//? non primitive  data types

        String name = "Mohammad Hammad Ansari!!";
        System.out.println(name);
//        ! multi line strings
        String line = """
                this is a multi line string example.
                """
        System.out.println(line);
        String abc = """
                this is a multi line string example.
                
                """
        System.out.println(abc);

        long l = 12345;
        System.out.println(l);
        boolean a = true;
        System.out.println(a);
        void greet () {
            System.out.println("This is a greeting function!!");

        }
        greet();
        console.log("Jjjjjj");
        console.log("MOfqo4ew9r;soidfj;alsdkfj;lasdkfj");


//! non-primitive data types

        int [] arr={0,1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println((arr[i]));

        }
        int i=0;
        while(i>0){
            System.out.println(i);
            i--;
        }


    }
}