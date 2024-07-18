public  class DemoReplaceAll {
    public static void main(String[] args) {
        String str1 = "Java123is456fun";

        // regex for sequence of digits
        // regex - a regex (can be a typical string) that is to be replaced
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));
    }
}
