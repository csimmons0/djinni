#import "DBEchoViewImpl.h"

static NSString *DBEnteredText = @"Hello.";

@implementation DBEchoViewImpl

- (nullable instancetype) init
{
    self = [super init];
    self.displayedText = @"";
    id<DBEchoView> proxy = [[DBEchoViewWeakProxy alloc] initWithActual:self];
    self.viewModel = [DBEchoViewModel create:proxy];
    if (!self.viewModel)
    {
        return NULL;
    }
    
    return self;
}

- (void)enterText:(nonnull NSString *)text
{
    [self.viewModel didEnterText:text];
}

- (void) displayText:(nonnull NSString *)text
{
    self.displayedText = text;
}

@end
