    //懒汉式：类内实例对象创建时并不直接初始化，直到第一次调用get方法时，才完成初始化操作
    //用时间换空间 存在线程风险
/*可以通过以下手段进行修复
 * 1.同步锁
 * 2.双重校验锁
 * 3.静态内部锁
 * 4.枚举
 */
    public class SingletonTwo {   
        //1.创建私有构造方法
          private SingletonTwo(){

          } 

          //2.创建静态的该类实例对象
          private static SingletonTwo instance=null;

          //3.创建开放的静态方法提供实例对象
          public static SingletonTwo getInstance(){
            if(instance==null)
            instance=new SingletonTwo();

            return instance;
          }
    
} 
