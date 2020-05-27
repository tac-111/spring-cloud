public class Singleton {

    private  Singleton(){}
        //内部定义一个自己的实例
        private static Singleton singleton=new Singleton();
        public static Singleton getInstance(){
            return singleton;
        }





}
