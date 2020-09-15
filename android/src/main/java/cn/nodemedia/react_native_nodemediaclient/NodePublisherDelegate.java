package cn.nodemedia.react_native_nodemediaclient;

/**
 * Created by ${$USER_NAME} on 17/4/19.
 */

public interface NodePublisherDelegate {
    void onEventCallback(NodePublisher streamer, int event, String msg);
}
