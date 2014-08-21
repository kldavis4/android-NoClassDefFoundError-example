android-NoClassDefFoundError-example
====================================

Simple example project demonstrating NoClassDefFoundError as reported here http://stackoverflow.com/questions/25194024/java-lang-noclassdeffounderror-com-acme-rlayout-referencing-android-library

## Build and install testlib aar to local maven repo
    cd testlib
    ../MyApplication/gradlew clean build publishToMavenLocal

## Build and install test app to android device
    cd ../MyApplication/app
    ../gradlew clean installDebug

## Instructions

To reproduce the error, install the test application then click the Launch Activity button.

The following exception will occur and the app will close:

    W/dalvikvm(19289): VFY: unable to resolve static field 6 (test_activity_layout) in Lcom/acme/R$layout;
    D/dalvikvm(19289): VFY: replacing opcode 0x60 at 0x0003
    D/AndroidRuntime(19289): Shutting down VM
    W/dalvikvm(19289): threadid=1: thread exiting with uncaught exception (group=0x41595ba8)
    E/AndroidRuntime(19289): FATAL EXCEPTION: main
    E/AndroidRuntime(19289): Process: com.acme.myapplication, PID: 19289
    E/AndroidRuntime(19289): java.lang.NoClassDefFoundError: com.acme.R$layout
    E/AndroidRuntime(19289):        at com.acme.TestActivity.onCreate(TestActivity.java:16)
    E/AndroidRuntime(19289):        at android.app.Activity.performCreate(Activity.java:5231)
    E/AndroidRuntime(19289):        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1087)E/AndroidRuntime(19289):        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2148)
    E/AndroidRuntime(19289):        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2233)
    E/AndroidRuntime(19289):        at android.app.ActivityThread.access$800(ActivityThread.java:135)
    E/AndroidRuntime(19289):        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1196)
    E/AndroidRuntime(19289):        at android.os.Handler.dispatchMessage(Handler.java:102)
    E/AndroidRuntime(19289):        at android.os.Looper.loop(Looper.java:136)
    E/AndroidRuntime(19289):        at android.app.ActivityThread.main(ActivityThread.java:5001)
    E/AndroidRuntime(19289):        at java.lang.reflect.Method.invokeNative(Native Method)E/AndroidRuntime(19289):        at java.lang.reflect.Method.invoke(Method.java:515)
    E/AndroidRuntime(19289):        at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:785)
    E/AndroidRuntime(19289):        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:601)
    E/AndroidRuntime(19289):        at dalvik.system.NativeStart.main(Native Method)
    W/ActivityManager(  590):   Force finishing activity com.acme.myapplication/com.acme.TestActivityW/ActivityManager(  590):   Force finishing activity com.acme.myapplication/.MyActivity
