
#import <Foundation/Foundation.h>
#import <XCTest/XCTest.h>

#import "DBEchoViewImpl.h"

@interface DBWeakProxyTests : XCTestCase

@end

@implementation DBWeakProxyTests

- (void)setUp
{
    [super setUp];
}

- (void)tearDown
{
    [super tearDown];
}

- (void)testWeakProxy
{
    DBEchoViewImpl *echoView = [[DBEchoViewImpl alloc] init];
    [echoView enterText:@"Hello."];
    XCTAssertEqualObjects(echoView.displayedText, @"Hello.");
}

@end
