package entity;

public abstract class AbstractCustomArray {
    private long id;

    public AbstractCustomArray() {

    }

    public AbstractCustomArray(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
