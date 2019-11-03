public class AutoBox{
    public static void main(String[] args) {
        /**
         * 能够调用静态工厂方法实现的对象，使用方法。（底层可能会对实例生成做优化）
         *     @HotSpotIntrinsicCandidate
         *      public static Integer valueOf(int i) {
         *          if (i >= IntegerCache.low && i <= IntegerCache.high)
         *               return IntegerCache.cache[i + (-IntegerCache.low)];
         *           return new Integer(i);
         *       }
         * Float.valueOf();
         * Double.valueOf();
         */
        Integer i = Integer.valueOf(100);
        System.out.println(i);
        float a = 1.0f - 0.9f;
        float b = 0.9f -0.8f;
        //float 类型不能使用“==”直接比较大小，float在内存中存储的是有误差的。
        System.out.println(a == b ? "true": "false");
    }
}