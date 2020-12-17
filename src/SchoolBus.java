public class SchoolBus extends Car {

    public SchoolBus(String id) {
        this.id = ("SchoolBus_" + id);
        length = super.getLength() * 3;
    }

}

