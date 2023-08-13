package Main;

class Node {
    char letter;
    Node north;
    Node east;
    Node south;
    Node west;

    public Node(char letter) {
        this.letter = letter;
        this.north = null;
        this.east = null;
        this.south = null;
        this.west = null;
    }
}
