#include "include/DlibWrapper.h"
#include <iostream>

using namespace std;

JNIEXPORT void JNICALL Java_DlibWrapper_detectFaces
  (JNIEnv *, jobject, jstring filePath)
  {
    cout << "The file path is" << filePath << endl;
  }