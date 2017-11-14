// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from weak_proxy.djinni

#include "echo_view.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@protocol DBEchoView;

namespace djinni_generated {

class EchoView
{
public:
    using CppType = std::shared_ptr<::testsuite::EchoView>;
    using CppOptType = std::shared_ptr<::testsuite::EchoView>;
    using ObjcType = id<DBEchoView>;

    using Boxed = EchoView;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

