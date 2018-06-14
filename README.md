# Junit-
# Junit单元测试的demo


##===============*v1.0*=================
/2018.06.14
v1.0版本
基础版本，通过junit写了一个SimpleCaculationTest测试类，通过参数化的方式，对被测试类SimpleCaculation进行一个简单的单元测试。<br>
同时，通过build.xml中添加的target，实现了 通过ant对源码编译，执行junit测试，并且输出测试报告。<br>
这样就输出了一个简单的ant+junit的框架，可以放到jenkins这样就形成了一个简单的'ant+junit+jenkins的模板'。<br>
这个版本的被测试类比较简单，测试的方法也很容易，也未实现数据用例和程序的分离。<br>
有待后续继续完善......<br>



文件结构：<br>
                                                +————code\Myutil——————SimpleCaculation（被测试类）<br>
                              + ———— src————————+ <br>
                              |                 +————test\Myuitl——————SimpleCaculationTest（测试执行类）<br>
                              |<br>
                              |                 +————code\Myutil——————SimpleCaculation.class(被编译后的被测试类字节码文件)<br>
                              +——————bin————————+<br>
                              |                 +————test\Myuitl——————SimpleCaculationTest.class(被编译后的测试执行类字节码文件)<br>
                              |<br>
                              |<br>
                              +—————lib（存放编译需要的第三方包，诸如junit.jar等）<br>
                              |<br>
                              |<br>
            Junit- —————————— +—————tool（存放后续测试方法需要的一些工具类）<br>
                              |<br>
                              |<br>
                              +————report（用于存放junit的测试报告）<br>
                              |<br>
                              |<br>
                              +————testCase（用于存放需要的测试用例，例如后续需要通过）<br>
                              |<br>
                              |<br>
                              +—————build.xml(ant的构建文件，用于通过ant进行自动编译，测试，打包，输出报告)<br>
