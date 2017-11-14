#include "echo_view_model.hpp"
#include "echo_view.hpp"

namespace testsuite {

class EchoViewModelImpl : public EchoViewModel {
public:
    EchoViewModelImpl(const std::shared_ptr<EchoView>& view): view(view) {}
    virtual void did_enter_text(const std::string& text) override { view->display_text(text); }

private:
	std::shared_ptr<EchoView> view;
};

std::shared_ptr<EchoViewModel> EchoViewModel::create(const std::shared_ptr<EchoView>& view) {
	return std::make_shared<EchoViewModelImpl>(view);
}

} // namespace testsuite
