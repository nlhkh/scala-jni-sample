name := "scala-with-cpp"

version := "0.1"

scalaVersion := "2.12.4"

enablePlugins(JniNative)

target in javah := sourceDirectory.value / "native" / "include"
sourceDirectory in nativeCompile := sourceDirectory.value / "native"
target in nativeCompile := target.value / "native" / (nativePlatform).value
