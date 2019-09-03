public class FooBar {


    public static String fooBar() {
        int i;
        String output = "";

        for(i = 1; i <= 100; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                output += "foobar ";
            }
            else if(i % 3 == 0) {
                output += "foo ";
            }
            else if(i % 5 == 0) {
                output += "bar ";
            }
            else {
                output += i + " ";
            }

        }

        return output;
    }

    public static String fooBarWithInputs(int start, int end) throws Exception {
        if(start>end) {
            throw new Exception("Cannot have negative range");
        }

        String output = "";
        int i;

        for(i = start; i <= end; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                output += "foobar ";
            }
            else if(i % 3 == 0) {
                output += "foo ";
            }
            else if(i % 5 == 0) {
                output += "bar ";
            }
            else {
                output += i + " ";
            }
        }

        return output;





    }

}
