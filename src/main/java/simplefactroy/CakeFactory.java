package simplefactroy;

public class CakeFactory {
    public static ICake produceCake(String cakeType) {
        switch (cakeType) {
            case "durianCake":
                return new DurianCake();
            case "straberryCake":
                return new StrawberryCake();
            case "chocolateCake":
                return new ChocolateCake();
            default:
                throw new RuntimeException("不存在这种蛋糕");
        }
    }

    /**
     * 通过反射方式创建对象
     */
    public static ICake produceCake(Class obj) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (ICake) Class.forName(obj.getName()).newInstance();
    }
}
