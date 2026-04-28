class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeStr = new StringBuilder();
        for (String str : strs) {
            encodeStr.append(str.length()).append("#").append(str);
        }

        return encodeStr.toString();
    }

    public List<String> decode(String str) {
        List<String> decodeStrs = new ArrayList<>();
        int i = 0, j = 1;
        while (j < str.length()) {
            if (str.charAt(j) == '#') {
                int length = Integer.parseInt(str.substring(i, j));
                String subStr = str.substring(j + 1, j + length + 1);
                decodeStrs.add(subStr);
                i = j + length + 1;
                j = i + 1;
            } else {
                j++;
            }
        }
        return decodeStrs;
    }
}
