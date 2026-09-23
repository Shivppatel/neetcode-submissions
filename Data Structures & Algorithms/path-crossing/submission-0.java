class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> visited = new HashSet<>();
        int x = 0;
        int y = 0;
        visited.add(x + "," + y);
        for (Character ch: path.toCharArray()){
            if (ch == 'N'){
                y++;
            } else if (ch == 'S'){
                y--;
            } else if (ch == 'E'){
                x++;
            } else {
                x--;
            }
            String newPos = x + "," + y;
            if (visited.contains(newPos)) return true;
            visited.add(newPos);
        }
        return false;
    }
}