// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from weak_proxy.djinni

#pragma once

#include <memory>
#include <string>

namespace testsuite {

class EchoView;

class EchoViewModel {
public:
    virtual ~EchoViewModel() {}

    static std::shared_ptr<EchoViewModel> create(const std::shared_ptr<EchoView> & view);

    virtual void did_enter_text(const std::string & text) = 0;
};

}  // namespace testsuite
