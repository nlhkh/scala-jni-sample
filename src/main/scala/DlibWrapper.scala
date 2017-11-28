import ch.jodersky.jni.nativeLoader

@nativeLoader("DlibWrapper")
class DlibWrapper {
  @native def detectFaces(filePath: String)
}
