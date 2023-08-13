package Main;

import java.util.HashSet;

class LewisStructure {
    Node root;
    Node currentPosition;

    public LewisStructure() {
        this.root = null;
        this.currentPosition = null;
    }

    public void Root(char letter) {
        this.root = new Node(letter);
        this.currentPosition = this.root;
    }

    public void Add(char letter, String direction) {
        Node newNode = new Node(letter);
        switch (direction) {
            case "North":
                this.currentPosition.north = newNode;
                break;
            case "East":
                this.currentPosition.east = newNode;
                break;
            case "South":
                this.currentPosition.south = newNode;
                break;
            case "West":
                this.currentPosition.west = newNode;
                break;
        }
    }

    public void Move(String direction) {
        switch (direction) {
            case "North":
                this.currentPosition = this.currentPosition.north;
                break;
            case "East":
                this.currentPosition = this.currentPosition.east;
                break;
            case "South":
                this.currentPosition = this.currentPosition.south;
                break;
            case "West":
                this.currentPosition = this.currentPosition.west;
                break;
        }
    }

    public void Print() {
        printLewisStructure(this.root, new HashSet<>(), "");
    }

    private void printLewisStructure(Node node, HashSet<Node> visited, String direction) {
        if (node == null || visited.contains(node)) return;
        visited.add(node);

        if (direction.equals("East")) {
            System.out.print("--" + node.letter);
        } else if (direction.equals("South")) {
            System.out.println("|");
            System.out.print(" " + node.letter);
        } else {
            System.out.print(node.letter);
        }

        printLewisStructure(node.east, visited, "East");
        printLewisStructure(node.south, visited, "South");
        printLewisStructure(node.west, visited, "West");
        printLewisStructure(node.north, visited, "North");
    }
}