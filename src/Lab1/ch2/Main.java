package Lab1.ch2;

public class Main {

    public static String compute(int arg) {
        String toReturn = "";
        Boolean found = false;
        if(arg % 3 == 0) {
            toReturn += "Foo";
            found = true;
        }
        if(arg % 5 == 0) {
            toReturn += "Bar";
            found = true;
        }
        if(arg % 7 == 0) {
            toReturn += "Qix";
            found = true;
        }

        char[] argCharArr = Integer.toString(arg).toCharArray();

        for(char currDigit : argCharArr) {

            if(currDigit == '3') {
                toReturn += "Foo";
                found = true;
            }
            else if (currDigit == '5') {
                toReturn += "Bar";
                found = true;
            }
            else if (currDigit == '7') {
                toReturn += "Qix";
                found = true;
            }

        }

        if(!found) {
            toReturn = Integer.toString(arg);
        }
        return toReturn;
    }

    public static String compute2(int arg) { //wasn't sure how to implement using compute(arg)
        String toReturn = "";
        Boolean found = false;
        if(arg % 3 == 0) {
            toReturn += "Foo";
            found = true;
        }
        if(arg % 5 == 0) {
            toReturn += "Bar";
            found = true;
        }
        if(arg % 7 == 0) {
            toReturn += "Qix";
            found = true;
        }

        char[] argCharArr = Integer.toString(arg).toCharArray();

        for(int i = 0; i < argCharArr.length; i++) {
            char currDigit = argCharArr[i];
            if(currDigit == '3') {
                toReturn += "Foo";
                found = true;
            }
            else if (currDigit == '5') {
                toReturn += "Bar";
                found = true;
            }
            else if (currDigit == '7') {
                toReturn += "Qix";
                found = true;
            }
            else if (currDigit == '0') {
                argCharArr[i] = '*';
                toReturn += "*";
            }

        }

        if(!found) {
            toReturn = String.valueOf(argCharArr);
            return toReturn;
        }
        return toReturn;
    }



    public static void main(String[] args) {
        for(int i = 0; i < 102; i++) {
            System.out.println(compute(i));
            System.out.println(compute2(i));
        }
    }
}
