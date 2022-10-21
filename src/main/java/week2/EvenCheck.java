package week2;
class EvenCheck {
    public static void main(String []args)
    {
        int n = 109;
        String type = (n%2 == 0) ? n + " is even" : n + " is odd";
        System.out.println(type); 

    }
}