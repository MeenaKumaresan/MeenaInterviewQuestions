package workout;

public class SingletonEx {
    private static SingletonEx instance;
    private SingletonEx(){

    }
    static SingletonEx getInstance(){
        if(instance==null){
             new SingletonEx();
        }
            return instance;

    }
    //Alliswell
}
