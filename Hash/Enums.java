package Hash;

public class Enums {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday;
        //These are enum constants
        //They are final, static and public
        //type is Week

        Week(){
            System.out.println(this);
        }
        //The constructor is default or private
    }

    public static void main(String[] args) {

        String str = "Hello";
        String str1 = "Hellos";
        if(str == str1)
            System.out.println("same");
        else
            System.out.println("Not same");
        Week week = Week.Thursday;
//        System.out.println(week);

//        System.out.println(week.ordinal());
//        System.out.println(week.name());
//
//        for (Week day : Week.values())
//            System.out.print(day + " ");
    }
}
