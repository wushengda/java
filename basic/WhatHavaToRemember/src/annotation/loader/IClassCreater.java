package annotation.loader;

/**
 * 加载Class时创建实例对像的接口
 * <p>
 * liaosheng@asiainfo.com
 * 2019/1/25
 */
public interface IClassCreater {

    /**
     * 创建Class实例
     * @param className
     * @throws Exception
     */
    public abstract void create(String className) throws Exception;

    public static void main(String[] args) throws Exception
    {
        String command = System.getProperty("sun.java.command", "");
        System.out.println(command);
    }
}
