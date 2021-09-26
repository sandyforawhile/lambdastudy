#Lambda
##Lambda使用前提
lambda是匿名内部类的简化变形，使用Lambda简化内部匿名类的前提如下：
+ 有且只有一个抽象方法的接口【函数式接口】
+ 必须有上下文推断

###标准格式
标准格式：（参数列表）-> { 表达式做事的逻辑代码 }

##Lambda方法引用
lambda表达式的执行体【大括号】里面的代码如果已经被另一个类中的某个方法完成过，就直接把这个类的方法引用过来使用，就不重新书写了。

###格式 ::符号
+ 普通方法：对象::方法名，比如：System.out::println
+ 静态方法：类名::方法名，比如：Math::abs
+ 构造方法：类名::new

##常用内置函数式接口

### 消费型接口 Consumer<T>
+ 抽象方法：void accept(T t)
+ 作用：当某个函数【函数式接口的抽象方法】可以接收一个数据，并且处理这个数据，处理完成之后，不需要返回任何数据，这个函数需要当做数据来进行传递，就使用消费型接口


# Stream
## Stream的操作
Stream的操作符大体可以分为两种：中间操作符 和 终止操作符
Stream的一系列操作必须要使用终止操作，否则整个数据流是不会流动的，即处理操作不会执行


### 中间操作符
+ map
+ flatmap
+ limit
+ distinct
+ filter
+ peek
+ skip
+ sorted

### 终止操作符
+ collect，Stream的核心就是Collectors
+ count
+ findFirst，findAny，返回值类型为Optional
+ noneMatch，allMatch，anyMatch，返回值类型为bool
+ min，max
+ reduce
+ forEach，forEachOrdered
+ toArray
