package in.leetProblem;

public class FindFirstOccurence {
    public static int findFirstOccurence(String string, String target) {
        char c = target.charAt(0);
        for (int i = 0; i < string.length() - target.length() + 1; i++) {
            if (string.charAt(i) == c) {
                String substring1 = string.substring(i, target.length() + i);
                if (substring1.equals(target)) {
//                    System.out.println(substring1);
                    return i;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "mississippi";
        String target = "issippi";
        int firstOccurence = findFirstOccurence(s, target);
        System.out.println(firstOccurence);

    }
}

