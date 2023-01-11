public class programmers4_2 {

    static class Solution {
        public static int[] solution(String s) {
            //이진 변환 횟수
            int count = 0;
            // 제거된 0의 개수
            int zero_removed = 0;

            while(!s.equals("1")) {
                count++;

                //Stream 이용하여 0 개수 구하기
                int zero = Math.toIntExact(countChar(s, '0'));
                zero_removed += zero;
                s = s.replace("0", "");

                s = Integer.toBinaryString(s.length());
            }

            return new int[]{count, zero_removed};
        }

        public static long countChar(String s, char ch) {
            return s.chars().filter(c -> c == ch).count();
        }
    }

    public static void main(String[] args) {
        String s = "01110";
        Solution.solution(s);
    }

}
