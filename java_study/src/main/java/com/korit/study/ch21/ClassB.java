package main.java.com.korit.study.ch21;

public class ClassB {
    public void run() {
        Singleton.getInstance().changeData();
        Singleton.getInstance().deleteData();
    }
}
