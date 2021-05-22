![Language](https://img.shields.io/badge/language-java-orange.svg)
![JDK](https://img.shields.io/badge/OpenJDK-11-yellow.svg)
![Maven](https://raster.shields.io/badge/Maven-3.6.3-red.svg)
![License](https://img.shields.io/badge/license-GPL2.0-000000.svg)


java 

输出详细信息
-D"info"="false" 

生成class类文件
-D"generateClass"="false" 

过滤掉哪些包下的类
-D"packageName"="org.jdkstack" 

探针类jar包
-javaagent:"G:/jdkagent/jdkagent-core/target/jdkagent-core-11.0.1-SNAPSHOT.jar" 

classpath
-classpath "G:/jdkagent/jdkagent-api/target/*;
G:/jdkagent/jdkagent-core/target/*;
G:/jdkagent/jdkagent-examples/target/*;
G:\maven3.6.3\repository\org\javassist\javassist\3.22.0-GA\javassist-3.22.0-GA.jar;"

执行的main方法的类
org.jdkstack.jdkagent.examples.Examples
