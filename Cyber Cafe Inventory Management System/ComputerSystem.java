  public class ComputerSystem {
    private String name;
    private String processor;
    private int ram;

    public ComputerSystem(String name, String processor, int ram) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "ComputerSystem{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                '}';
    }
}
    
	