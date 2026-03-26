class TextEditorBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");        // Append
        sb.insert(6, "Java ");      // Insert

        System.out.println("After Append & Insert: " + sb);

        sb.reverse();               // Reverse
        System.out.println("Reversed String: " + sb);
    }
}