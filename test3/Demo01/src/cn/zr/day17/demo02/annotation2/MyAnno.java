package cn.zr.day17.demo02.annotation2;

/*
* 	* 属性：接口中的抽象方法
			* 要求：
				1. 属性的返回值类型有下列取值
					* 基本数据类型
					* String
					* 枚举
					* 注解
					* 以上类型的数组*/
public @interface MyAnno {
    int age();
    String name() default "Ron";
    //还可以是
}
