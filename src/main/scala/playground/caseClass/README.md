# Case Classes

The nice `pattern matching` of Scala gets compiled 
into `instanceof` checks with `if/else` construct in 
the final bytecode.

![ScalaCode](./assets/scalaCode.PNG)

gets compiled into (decompiled with jd)

![DecompiledBytecode](./assets/decompiledClass.PNG)