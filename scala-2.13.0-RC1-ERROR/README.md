`sbt run`:

```
[info] Loading settings for project global-plugins from dependency-graph.sbt ...
[info] Loading global plugins from ...\.sbt\1.0\plugins
[info] Loading project definition from ...\scala-2.13.0-RC1-ERROR\project
[info] Loading settings for project scala-2-13-0-rc1-error from build.sbt ...
[info] Set current project to scala-2-13-0-rc1-error (in build file:/.../scala-2.13.0-RC1-ERROR/)
[info] Running Main 
[error] (run-main-0) org.mockito.exceptions.base.MockitoException: 
[error] Mockito cannot mock this class: class scala.reflect.io.AbstractFile.
[error] 
[error] Mockito can only mock non-private & non-final classes.
[error] If you're not sure why you're getting this error, please report to the mailing list.
[error] 
[error] 
[error] Java               : 1.8
[error] JVM vendor name    : Oracle Corporation
[error] JVM vendor version : 25.151-b12
[error] JVM name           : Java HotSpot(TM) 64-Bit Server VM
[error] JVM version        : 1.8.0_151-b12
[error] JVM info           : mixed mode
[error] OS name            : Windows 10
[error] OS version         : 10.0
[error] 
[error] 
[error] Underlying exception : java.lang.IllegalStateException: Error invoking java.lang.ClassLoader#defineClass
[error] org.mockito.exceptions.base.MockitoException: 
[error] Mockito cannot mock this class: class scala.reflect.io.AbstractFile.
[error] 
[error] Mockito can only mock non-private & non-final classes.
[error] If you're not sure why you're getting this error, please report to the mailing list.
[error] 
[error] 
[error] Java               : 1.8
[error] JVM vendor name    : Oracle Corporation
[error] JVM vendor version : 25.151-b12
[error] JVM name           : Java HotSpot(TM) 64-Bit Server VM
[error] JVM version        : 1.8.0_151-b12
[error] JVM info           : mixed mode
[error] OS name            : Windows 10
[error] OS version         : 10.0
[error] 
[error] 
[error] Underlying exception : java.lang.IllegalStateException: Error invoking java.lang.ClassLoader#defineClass
[error] 	at Main$.main(Main.scala:8)
[error] 	at Main.main(Main.scala)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error] 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error] 	at java.lang.reflect.Method.invoke(Method.java:498)
[error] Caused by: java.lang.IllegalStateException: Error invoking java.lang.ClassLoader#defineClass
[error] 	at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Direct.defineClass(ClassInjector.java:609)
[error] 	at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection.injectRaw(ClassInjector.java:236)
[error] 	at net.bytebuddy.dynamic.loading.ClassInjector$AbstractBase.inject(ClassInjector.java:112)
[error] 	at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher.load(ClassLoadingStrategy.java:232)
[error] 	at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:100)
[error] 	at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:5662)
[error] 	at org.mockito.internal.creation.bytebuddy.SubclassBytecodeGenerator.mockClass(SubclassBytecodeGenerator.java:173)
[error] 	at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
[error] 	at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
[error] 	at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:152)
[error] 	at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:365)
[error] 	at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:174)
[error] 	at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:376)
[error] 	at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
[error] 	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMockType(SubclassByteBuddyMockMaker.java:71)
[error] 	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:42)
[error] 	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:25)
[error] 	at org.mockito.MockitoEnhancer.createMock$1(MockitoAPI.scala:194)
[error] 	at org.mockito.MockitoEnhancer.mock(MockitoAPI.scala:203)
[error] 	at org.mockito.MockitoEnhancer.mock$(MockitoAPI.scala:177)
[error] 	at org.mockito.MockitoSugar$.mock(MockitoSugar.scala:10)
[error] 	at org.mockito.MockitoEnhancer.mock(MockitoAPI.scala:144)
[error] 	at org.mockito.MockitoEnhancer.mock$(MockitoAPI.scala:144)
[error] 	at org.mockito.MockitoSugar$.mock(MockitoSugar.scala:10)
[error] 	at Main$.main(Main.scala:8)
[error] 	at Main.main(Main.scala)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error] 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error] 	at java.lang.reflect.Method.invoke(Method.java:498)
[error] Caused by: java.lang.VerifyError: class org.mockito.codegen.AbstractFile$MockitoMock$642908657 overrides final method addString.(Lscala/collection/mutable/StringBuilder;)Lscala/collection/mutable/StringBuilder;
[error] 	at java.lang.ClassLoader.defineClass1(Native Method)
[error] 	at java.lang.ClassLoader.defineClass(ClassLoader.java:763)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error] 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error] 	at java.lang.reflect.Method.invoke(Method.java:498)
[error] 	at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Direct.defineClass(ClassInjector.java:605)
[error] 	at net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection.injectRaw(ClassInjector.java:236)
[error] 	at net.bytebuddy.dynamic.loading.ClassInjector$AbstractBase.inject(ClassInjector.java:112)
[error] 	at net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher.load(ClassLoadingStrategy.java:232)
[error] 	at net.bytebuddy.dynamic.TypeResolutionStrategy$Passive.initialize(TypeResolutionStrategy.java:100)
[error] 	at net.bytebuddy.dynamic.DynamicType$Default$Unloaded.load(DynamicType.java:5662)
[error] 	at org.mockito.internal.creation.bytebuddy.SubclassBytecodeGenerator.mockClass(SubclassBytecodeGenerator.java:173)
[error] 	at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:37)
[error] 	at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator$1.call(TypeCachingBytecodeGenerator.java:34)
[error] 	at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:152)
[error] 	at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:365)
[error] 	at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:174)
[error] 	at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:376)
[error] 	at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:32)
[error] 	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMockType(SubclassByteBuddyMockMaker.java:71)
[error] 	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:42)
[error] 	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:25)
[error] 	at org.mockito.MockitoEnhancer.createMock$1(MockitoAPI.scala:194)
[error] 	at org.mockito.MockitoEnhancer.mock(MockitoAPI.scala:203)
[error] 	at org.mockito.MockitoEnhancer.mock$(MockitoAPI.scala:177)
[error] 	at org.mockito.MockitoSugar$.mock(MockitoSugar.scala:10)
[error] 	at org.mockito.MockitoEnhancer.mock(MockitoAPI.scala:144)
[error] 	at org.mockito.MockitoEnhancer.mock$(MockitoAPI.scala:144)
[error] 	at org.mockito.MockitoSugar$.mock(MockitoSugar.scala:10)
[error] 	at Main$.main(Main.scala:8)
[error] 	at Main.main(Main.scala)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error] 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error] 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error] 	at java.lang.reflect.Method.invoke(Method.java:498)
[error] Nonzero exit code: 1
[error] (Compile / run) Nonzero exit code: 1
[error] Total time: 6 s, completed 2019-04-11 22:26:12
```
