public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");


        Miyake m = new Miyake(40);

        Miyake m2 = new Miyake(45);

        System.out.println(m.getAge());

        System.out.println(m2.getAge());

        var builder= new StringBuilder();
        for(var i=0;i<2;i++){
            builder.append("いろは");
        }
        var result = builder.toString();

        System.out.println(result);

        StringBuilder builder2= new StringBuilder("aaa");
        StringBuilder builder3= new StringBuilder("aaa");
        if(builder2 == builder3){

            System.out.println("==");
        }

        if(builder2.equals(builder3)){

            System.out.println("equals");
        }

        return;

    }
}

