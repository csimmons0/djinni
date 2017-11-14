// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from weak_proxy.djinni

#include "NativeEchoViewModel.hpp"  // my header
#include "Marshal.hpp"
#include "NativeEchoView.hpp"

namespace djinni_generated {

NativeEchoViewModel::NativeEchoViewModel() : ::djinni::JniInterface<::testsuite::EchoViewModel, NativeEchoViewModel>("com/dropbox/djinni/test/EchoViewModel$CppProxy") {}

NativeEchoViewModel::~NativeEchoViewModel() = default;


CJNIEXPORT void JNICALL Java_com_dropbox_djinni_test_EchoViewModel_00024CppProxy_nativeDestroy(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        delete reinterpret_cast<::djinni::CppProxyHandle<::testsuite::EchoViewModel>*>(nativeRef);
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT jobject JNICALL Java_com_dropbox_djinni_test_EchoViewModel_00024CppProxy_create(JNIEnv* jniEnv, jobject /*this*/, jobject j_view)
{
    try {
        DJINNI_FUNCTION_PROLOGUE0(jniEnv);
        auto r = ::testsuite::EchoViewModel::create(::djinni_generated::NativeEchoView::toCpp(jniEnv, j_view));
        return ::djinni::release(::djinni_generated::NativeEchoViewModel::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT void JNICALL Java_com_dropbox_djinni_test_EchoViewModel_00024CppProxy_native_1didEnterText(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jstring j_text)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::testsuite::EchoViewModel>(nativeRef);
        ref->did_enter_text(::djinni::String::toCpp(jniEnv, j_text));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

}  // namespace djinni_generated
