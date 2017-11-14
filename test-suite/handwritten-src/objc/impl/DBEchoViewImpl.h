#import <Foundation/Foundation.h>

#import "DBEchoView.h"
#import "DBEchoViewModel.h"


@interface DBEchoViewImpl : NSObject <DBEchoView>

@property (nonatomic, nonnull) DBEchoViewModel* viewModel;
@property (nonatomic, nonnull) NSString *displayedText;

- (nullable instancetype) init;

- (void)enterText:(nonnull NSString *)text;

@end
