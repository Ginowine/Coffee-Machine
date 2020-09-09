enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int sections;

    DangerLevel(int sections){
        this.sections = sections;
    }

    public int getLevel(){
        return sections;
    }
}