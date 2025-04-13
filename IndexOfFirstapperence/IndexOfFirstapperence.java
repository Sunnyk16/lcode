class IndexOfFirstapperence {
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }

        int len1 = haystack.length();
        int len2 = needle.length();
        int p = 0;
        int q = 0;
        while (p < len1) {
            if (haystack.charAt(p) == needle.charAt(q)) {
                ++p;
                ++q;
            } else {
                p -= q - 1;
                q = 0;
            }

            if (q == len2) {
                return p - q;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        IndexOfFirstapperence indexOfFirstapperence = new IndexOfFirstapperence();
        System.out.println(indexOfFirstapperence.strStr("hello", "ll")); // Output: 2
        System.out.println(indexOfFirstapperence.strStr("aaaaa", "bba")); // Output: -1
        System.out.println(indexOfFirstapperence.strStr("", "")); // Output: 0
    }
}