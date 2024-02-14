class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int ceil = 0;

        while (aLength >= 0 || bLength >= 0) {
            int sum = ceil;
            sum += (aLength >= 0) ? a.charAt(aLength--) - '0' : 0;
            sum += (bLength >= 0) ? b.charAt(bLength--) - '0' : 0;

            sb.append(sum % 2);
            ceil = sum / 2;
        }
        if (ceil != 0) sb.append(ceil);

        return sb.reverse().toString();
    }
    
}