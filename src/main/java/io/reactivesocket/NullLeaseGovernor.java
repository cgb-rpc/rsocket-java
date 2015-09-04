package io.reactivesocket;

import io.reactivesocket.internal.Responder;

public class NullLeaseGovernor implements LeaseGovernor {
    @Override
    public void register(Responder responder) {}

    @Override
    public void unregister(Responder responder) {}

    @Override
    public boolean accept(Responder responder, Frame frame) {
        return true;
    }
}
