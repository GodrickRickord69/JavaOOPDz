package task1.writable;

import task1.familyTree.FamilyTree;

public interface Writable {
    void write(FamilyTree familyTree);
    FamilyTree load();
}
