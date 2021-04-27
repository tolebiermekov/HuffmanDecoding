package com.company;

public class MyDict {
    private DictNode[] temp;

    public MyDict() {
        temp = new DictNode[0];
    }

    public MyDict(DictNode[] temp) {
        this.temp = temp;
    }

    public DictNode[] getTemp() {
        return temp;
    }

    public void setTemp(DictNode[] temp) {
        this.temp = temp;
    }

    public void add(DictNode a) {
        DictNode[] nnn = new DictNode[temp.length + 1];
        System.arraycopy(temp, 0, nnn, 0, temp.length);
        nnn[temp.length] = a;
        temp = nnn;
    }

    public char findByCode(String s) {
        for(DictNode x : temp) {
            if(s.equals(x.getCode())) {
                return x.getA();
            }
        }
        return 1;
    }
}
