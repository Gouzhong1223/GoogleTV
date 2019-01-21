LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

# Include all common java files.
LOCAL_SRC_FILES := $(call all-java-files-under, src)
LOCAL_SRC_FILES += $(call all-proto-files-under, src)

LOCAL_MODULE := tv-common
LOCAL_MODULE_CLASS := STATIC_JAVA_LIBRARIES
LOCAL_MODULE_TAGS := optional
LOCAL_SDK_VERSION := system_current

LOCAL_PROTOC_OPTIMIZE_TYPE := lite
LOCAL_PROTOC_FLAGS := --proto_path=$(LOCAL_PATH)/src/


LOCAL_USE_AAPT2 := true

LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res

LOCAL_JAVA_LIBRARIES := \
    auto-value-jar \
    auto-factory-jar \
    android-support-annotations \
    error-prone-annotations-jar \
    guava-android-jar \
    jsr330 \
    lib-dagger \
    lib-exoplayer \
    lib-exoplayer-v2-core \


LOCAL_DISABLE_RESOLVE_SUPPORT_LIBRARIES := true

LOCAL_SHARED_ANDROID_LIBRARIES := \
    android-support-compat \
    android-support-core-ui \
    android-support-v7-recyclerview \
    android-support-v17-leanback \

LOCAL_STATIC_ANDROID_LIBRARIES := \
    lib-dagger-android \

LOCAL_ANNOTATION_PROCESSORS := \
    auto-value-jar-host \
    auto-factory-jar-host \
    guava-jre-jar \
    javawriter-jar-host \
    javax-annotations-jar-host \
    jsr330 \

LOCAL_ANNOTATION_PROCESSOR_CLASSES := \
  com.google.auto.factory.processor.AutoFactoryProcessor,com.google.auto.value.processor.AutoValueProcessor

LOCAL_MIN_SDK_VERSION := 23

include $(LOCAL_PATH)/buildconfig.mk

include $(BUILD_STATIC_JAVA_LIBRARY)
