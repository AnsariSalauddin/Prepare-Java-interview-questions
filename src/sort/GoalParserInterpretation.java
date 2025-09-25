package in.sort;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str="G()()()()(al)";
        String old = str.replace("()", "o");
        String al = old.replace("(al)", "al");
        System.out.println(al);

    }
}

