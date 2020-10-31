package EA3.a2;

public enum THW_Grade {
    HELFER(0),
    TRUPPFUEHRER(1),
    GRUPPENFUEHRER(2),
    ZUGTRUPPENFUEHRER(3),
    ZUGFUEHRER(4);

    private final int whoIsDaBoss;

    THW_Grade(int bossLevel){
        whoIsDaBoss = bossLevel;
    }

    @Override
    public String toString(){
        String buffer = super.toString();
        return buffer.charAt(0) + buffer.substring(1).toLowerCase();
    }

    public boolean istVorgesetzterVor(THW_Grade grad){
        return this.whoIsDaBoss > grad.whoIsDaBoss;
    }


}



