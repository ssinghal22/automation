$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/bleacherreport.feature");
formatter.feature({
  "name": "Bleacher Report smoke test suite",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@bleacherreport"
    }
  ]
});
formatter.scenario({
  "name": "BR Home page smoke test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@bleacherreport"
    },
    {
      "name": "@bleacherreport1"
    }
  ]
});
formatter.before({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: DevToolsActivePort file doesn\u0027t exist\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Soniyas-MacBook-Air.local\u0027, ip: \u00272601:646:8f01:2f60:0:0:0:95cb%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: 0   chromedriver                        0x000000010b482079 chromedriver + 4444281\n1   chromedriver                        0x000000010b40e403 chromedriver + 3970051\n2   chromedriver                        0x000000010b0a9038 chromedriver + 409656\n3   chromedriver                        0x000000010b0cf902 chromedriver + 567554\n4   chromedriver                        0x000000010b0cbfba chromedriver + 552890\n5   chromedriver                        0x000000010b0c8836 chromedriver + 538678\n6   chromedriver                        0x000000010b10244a chromedriver + 775242\n7   chromedriver                        0x000000010b0fc683 chromedriver + 751235\n8   chromedriver                        0x000000010b0d2a45 chromedriver + 580165\n9   chromedriver                        0x000000010b0d3a95 chromedriver + 584341\n10  chromedriver                        0x000000010b45355d chromedriver + 4253021\n11  chromedriver                        0x000000010b4583a1 chromedriver + 4273057\n12  chromedriver                        0x000000010b45d16f chromedriver + 4292975\n13  chromedriver                        0x000000010b458dea chromedriver + 4275690\n14  chromedriver                        0x000000010b43254f chromedriver + 4117839\n15  chromedriver                        0x000000010b472ed8 chromedriver + 4382424\n16  chromedriver                        0x000000010b47305f chromedriver + 4382815\n17  chromedriver                        0x000000010b4898d5 chromedriver + 4475093\n18  libsystem_pthread.dylib             0x00007fff7eabb661 _pthread_body + 340\n19  libsystem_pthread.dylib             0x00007fff7eabb50d _pthread_body + 0\n20  libsystem_pthread.dylib             0x00007fff7eababf9 thread_start + 13\n\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\n\tat support.TestContext.initialize(TestContext.java:21)\n\tat support.Hooks.start(Hooks.java:9)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:31)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:25)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:17)\n\tat cucumber.runner.UnskipableStep.executeStep(UnskipableStep.java:22)\n\tat cucumber.api.TestStep.run(TestStep.java:83)\n\tat cucumber.api.TestCase.run(TestCase.java:58)\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:118)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:56)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:127)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n",
  "status": "failed"
});
formatter.step({
  "name": "I open BR home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BleacherReportDefs.iOpenBRHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "header displays",
  "keyword": "Then "
});
formatter.match({
  "location": "BleacherReportDefs.headerDisplays()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a big image displays",
  "keyword": "And "
});
formatter.match({
  "location": "BleacherReportDefs.aBigImageDisplays()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "My Teams displays",
  "keyword": "And "
});
formatter.match({
  "location": "BleacherReportDefs.myTeamsDisplays()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Edit Teams displays",
  "keyword": "And "
});
formatter.match({
  "location": "BleacherReportDefs.editTeamsDisplays()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Headlines displays",
  "keyword": "And "
});
formatter.match({
  "location": "BleacherReportDefs.headlinesDisplays()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Trending displays",
  "keyword": "And "
});
formatter.match({
  "location": "BleacherReportDefs.trendingDisplays()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Exclusive displays",
  "keyword": "And "
});
formatter.match({
  "location": "BleacherReportDefs.exclusiveDisplays()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Social icons display in footer",
  "keyword": "And "
});
formatter.match({
  "location": "BleacherReportDefs.socialIconsDisplayInFooter()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Links display in footer",
  "keyword": "And "
});
formatter.match({
  "location": "BleacherReportDefs.linksDisplayInFooter()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\n\tat support.TestContext.teardown(TestContext.java:28)\n\tat support.Hooks.finish(Hooks.java:14)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:31)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:25)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:17)\n\tat cucumber.runner.UnskipableStep.executeStep(UnskipableStep.java:22)\n\tat cucumber.api.TestStep.run(TestStep.java:83)\n\tat cucumber.api.TestCase.run(TestCase.java:58)\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:118)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:56)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:127)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n",
  "status": "failed"
});
formatter.uri("src/test/resources/features/careers.feature");
formatter.feature({
  "name": "Careers",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@careers"
    }
  ]
});
formatter.scenario({
  "name": "Search on Careers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@careers"
    },
    {
      "name": "@careers1"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open careers page",
  "keyword": "Given "
});
formatter.match({
  "location": "CareersStepDefs.iOpenCareersPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"Principal Automation Engineer\"",
  "keyword": "When "
});
