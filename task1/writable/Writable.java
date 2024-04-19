package task1.writable;

import java.io.Serializable;

public interface Writable {
    boolean save(Serializable serializable, String file);
    Object read(String file);
}
