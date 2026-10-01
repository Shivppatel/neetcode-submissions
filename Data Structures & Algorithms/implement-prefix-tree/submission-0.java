class PrefixTree {
    class TreeNode{
        HashMap<Character, TreeNode> children;
        boolean isWord;

        public TreeNode(){
            children = new HashMap<>();
            isWord = false;
        }
    }
    TreeNode head;

    public PrefixTree() {
        head = new TreeNode();
    }

    public void insert(String word) {
        TreeNode current = head;
        for (Character ch: word.toCharArray()){
            current.children.putIfAbsent(ch, new TreeNode());
            current = current.children.get(ch);
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        TreeNode current = head;
        for (Character ch: word.toCharArray()){
            if (!current.children.containsKey(ch)) return false;
            current = current.children.get(ch);
        }
        return current.isWord;
    }

    public boolean startsWith(String prefix) {
        TreeNode current = head;
        for (Character ch: prefix.toCharArray()){
            if (!current.children.containsKey(ch)) return false;
            current = current.children.get(ch);
        }
        return true;
    }
}
