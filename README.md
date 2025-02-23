# com.imooc.singleton
单例模式（Singleton Pattern）是一种设计模式，确保一个类只有一个实例，并提供全局访问点。在Java中，常见的单例模式有懒汉式和饿汉式，它们的区别主要体现在实例化的时机和线程安全上。

懒汉式（Lazy Initialization）
懒汉式单例模式在第一次需要实例时才创建对象。懒汉式的优势是延迟实例化，但也有可能遇到线程安全问题。

饿汉式（Eager Initialization）
饿汉式单例模式在类加载时就已经创建了实例，不管你是否使用它。它的优点是实现简单，且天然线程安全，但如果实例化过程比较重时，会导致不必要的资源浪费。

总结
懒汉式：实例在第一次使用时创建，节省内存，但需要处理线程安全问题（使用synchronized或双重检查锁定）。
饿汉式：类加载时就创建实例，天然线程安全，简单直观，但会在类加载时就实例化对象，可能导致不必要的资源浪费。
通常，饿汉式适用于实例化过程轻量且不影响性能的情况，而懒汉式适合资源较重的实例化，但需要保证线程安全。
