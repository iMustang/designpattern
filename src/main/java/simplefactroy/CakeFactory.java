package simplefactroy;

public class CakeFactory {
    public static ICake produceCake(String cakeType) {
        switch (cakeType) {
            case "straberryCake":
                return new StrawberryCake();
            case "chocolateCake":
                return new ChocolateCake();
            default:
                throw new RuntimeException("不存在这种蛋糕");
        }
    }

    /**
     * 不使用简单工厂，使用反射方式创建对象
     */
    public static ICake produceCake(Class clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (ICake) Class.forName(clazz.getName()).newInstance();
    }
}
