package hello;
class StringReverser {
    String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new StringReverser().reverse("hello"));
    }
}
