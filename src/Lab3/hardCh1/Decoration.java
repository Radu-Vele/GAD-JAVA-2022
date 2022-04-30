package Lab3.hardCh1;

import java.util.List;

public abstract class Decoration implements DecorableTree {
    DecorableTree decorableTree;
    int level;
    String decoration;
    public Decoration(DecorableTree decorableTree) {
        this.decorableTree = decorableTree;
    }

    @Override
    public List<List<String>> getTree() {
        List<List<String>> toReturn = decorableTree.getTree();
        boolean wantedArea = false;

        for(int j = 0; j < toReturn.get(level).size(); j++) {
            if(toReturn.get(level).get(j) == ">") {
                wantedArea = false;
                continue;
            }
            if(wantedArea) {
                toReturn.get(level).set(j, decoration);
            }

            if(toReturn.get(level).get(j) == "<") {
                wantedArea = true;
            }
        }

        return toReturn;
    }

    @Override
    public void display() {
        List<List<String>> toPrint = getTree();
        for (int i = 0; i < toPrint.size(); i++) {
            for (int j = 0; j < toPrint.get(i).size(); j++) {
                System.out.print(toPrint.get(i).get(j));
            }
            System.out.println();
        }
    }

}

